package work.fair24.activiti;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonFactory;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;

/**
 * <p>To distinguish between null and empty string in json, invoke Data.isNull(...)
 * Ref. <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json#json_null">
 * https://developers.google.com/api-client-library/java/google-http-java-client/json#json_null</a>
 * </p>
 * Created by renfeng on 12/10/16.
 */
public class ActivitiClient {

	private static final Logger logger = LoggerFactory.getLogger(ActivitiClient.class);

	private final HttpRequestFactory httpRequestFactory;
	private final JsonFactory jsonFactory;

	private final String username;
	private final String password;
	private final String baseUrl;

	@Inject
	public ActivitiClient(HttpRequestFactory httpRequestFactory, JsonFactory jsonFactory,
						  @Assisted("username") String username, @Assisted("password") String password,
						  @Assisted("baseUrl") String baseUrl) {
		this.httpRequestFactory = httpRequestFactory;
		this.jsonFactory = jsonFactory;
		this.username = username;
		this.password = password;
		this.baseUrl = baseUrl;
	}

	private HttpResponse post(String path, Payload payload) throws IOException {

		HttpRequest request = httpRequestFactory.buildPostRequest(
				new GenericUrl(baseUrl + path), new JsonHttpContent(jsonFactory, payload));
		request.getHeaders().setBasicAuthentication(username, password);
		request.setThrowExceptionOnExecuteError(false);

		return request.execute();
	}

	private HttpResponse get(String path) throws IOException {

		HttpRequest request = httpRequestFactory.buildGetRequest(new GenericUrl(baseUrl + path));
		request.getHeaders().setBasicAuthentication(username, password);
		request.setThrowExceptionOnExecuteError(false);

		return request.execute();
	}

	public HistoricProcessInstancePage queryHistoricProcessInstances(HistoricProcessInstanceQuery payload)
			throws IOException {
		HttpResponse response = post("query/historic-process-instances", payload);
		return response.parseAs(HistoricProcessInstancePage.class);
	}

	public RunningProcessInstancePage queryProcessInstances(RunningProcessInstanceQuery payload) throws IOException {
		HttpResponse response = post("query/process-instances", payload);
		return response.parseAs(RunningProcessInstancePage.class);
	}

	public void processInstanceDiagram(String processInstanceId, OutputStream out) throws IOException {
		content("runtime/process-instances/" + processInstanceId + "/diagram", out);
	}

	public ProcessDefinitionPage latestProcessDefinition(String processDefinitionKey) throws IOException {
		HttpResponse response = get("repository/process-definitions?latest=true&key=" + processDefinitionKey);
		return response.parseAs(ProcessDefinitionPage.class);
	}

	public Resource resource(String url) throws IOException {
		HttpRequest request = httpRequestFactory.buildGetRequest(new GenericUrl(url));
		request.getHeaders().setBasicAuthentication(username, password);
		request.setThrowExceptionOnExecuteError(false);

		HttpResponse response = request.execute();
		return response.parseAs(Resource.class);
	}

	/**
	 * applicable to resource and attachment contents
	 *
	 * @param url
	 * @param out
	 * @throws IOException
	 */
	public void content(String url, OutputStream out) throws IOException {
		HttpRequest request = httpRequestFactory.buildGetRequest(new GenericUrl(url));
		request.getHeaders().setBasicAuthentication(username, password);
		request.setThrowExceptionOnExecuteError(false);

		HttpResponse response = request.execute();
		IOUtils.copy(response.getContent(), out);
	}

	public RunningProcessInstance startProcessInstance(String processDefinitionKey, Variables variables)
			throws IOException {
		RunningProcessInstance payload = new RunningProcessInstance(processDefinitionKey);
		payload.setVariables(variables);
		HttpResponse response = post("runtime/process-instances", payload);
		return response.parseAs(RunningProcessInstance.class);
	}

	public TaskPage queryTasks(TaskQuery payload) throws IOException {
		HttpResponse response = post("query/tasks", payload);
		return response.parseAs(TaskPage.class);
	}

	public void claimTask(String taskId, String username) throws IOException {
		TaskAction payload = new TaskAction();
		payload.setAction(TaskActionEnum.claim);
		payload.setAssignee(username);
		post("runtime/tasks/" + taskId, payload);
	}

	public Task getTask(String taskId) throws IOException {
		HttpResponse response = get("runtime/tasks/" + taskId);
		return response.parseAs(Task.class);
	}

	public void completeTask(String taskId, Variables variables) throws IOException {
		TaskAction payload = new TaskAction();
		payload.setAction(TaskActionEnum.complete);
		payload.setVariables(variables);
		post("runtime/tasks/" + taskId, payload);
	}

	public Task getHistoricTask(String taskId) throws IOException {
		HttpResponse response = get("history/historic-task-instances/" + taskId);
		return response.parseAs(HistoricTask.class);
	}

	public void listDeployments() throws IOException {
		HttpResponse response = get("repository/deployments");
		System.out.println(response.parseAsString());
	}

	public TaskPage listTasksPending() throws IOException {
		HttpResponse response = get("runtime/tasks?candidateGroup=engineering");
		return response.parseAs(TaskPage.class);
	}

	public TaskPage listTasksAssigned() throws IOException {
		HttpResponse response = get("runtime/tasks?assigned=" + username);
		return response.parseAs(TaskPage.class);
	}

	/**
	 * form definition, c.f. instance data
	 *
	 * @param processDefinitionId e.g. process_key:2:5008
	 * @throws IOException
	 */
	public void getProcessFormData(String processDefinitionId) throws IOException {
		HttpResponse response = get("form/form-data?processDefinitionId=" + processDefinitionId);
		System.out.println(response.parseAsString());
	}

	/**
	 * form definition, c.f. instance data
	 *
	 * @param taskId e.g. 7541
	 * @throws IOException
	 */
	public void getTaskFormData(String taskId) throws IOException {
		HttpResponse response = get("form/form-data?taskId=" + taskId);
		System.out.println(response.parseAsString());
	}

	public Variables getProcessVariables(String processInstanceId) throws IOException {
		HttpResponse response = get("runtime/process-instances/" + processInstanceId + "/variables");
		return response.parseAs(Variables.class);
	}

	public HistoricVariablePage getHistoricVariables(String processInstanceId, int size) throws IOException {
		HttpResponse response = get("history/historic-variable-instances?processInstanceId=" + processInstanceId +
				"&size=" + size);
		return response.parseAs(HistoricVariablePage.class);
	}

	public Attachment createAttachment(String taskId, AttachedLink payload) throws IOException {
		HttpResponse response = post("runtime/tasks/" + taskId + "/attachments", payload);
		return response.parseAs(Attachment.class);
	}

	public Attachments listAttachments(String taskId) throws IOException {
		HttpResponse response = get("runtime/tasks/" + taskId + "/attachments");
		return response.parseAs(Attachments.class);
	}
}
