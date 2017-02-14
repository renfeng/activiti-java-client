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
import java.util.List;

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

		return request.execute();
	}

	private HttpResponse get(String path) throws IOException {

		HttpRequest request = httpRequestFactory.buildGetRequest(new GenericUrl(baseUrl + path));
		request.getHeaders().setBasicAuthentication(username, password);

		return request.execute();
	}

	public RuntimeProcessInstances queryProcessInstances(String processDefinitionKey, List<QueryVariable> variables)
			throws IOException {
		QueryProcessInstances payload = new QueryProcessInstances(processDefinitionKey);
		payload.setVariables(variables);
		HttpResponse response = post("query/process-instances", payload);
		return response.parseAs(RuntimeProcessInstances.class);
	}

	public void diagram(String processInstanceId, OutputStream out) throws IOException {
		HttpResponse response = get("runtime/process-instances/" + processInstanceId + "/diagram");
		IOUtils.copy(response.getContent(), out);
	}

	public RuntimeProcessInstance startProcessInstance(String processDefinitionKey, RuntimeVariables variables)
			throws IOException {
		RuntimeProcessInstance payload = new RuntimeProcessInstance(processDefinitionKey);
		payload.setVariables(variables);
		HttpResponse response = post("runtime/process-instances", payload);
		return response.parseAs(RuntimeProcessInstance.class);
	}

	public RuntimeTasks queryTasks(String processInstanceId, List<QueryVariable> processInstanceVariables)
			throws IOException {
		QueryTasks payload = new QueryTasks();
		payload.setProcessInstanceId(processInstanceId);
		payload.setProcessInstanceVariables(processInstanceVariables);
		HttpResponse response = post("query/tasks", payload);
		return response.parseAs(RuntimeTasks.class);
	}

	public void claimTask(String taskId, String username) throws IOException {
		TaskAction payload = new TaskAction();
		payload.setAction(TaskActionEnum.claim);
		payload.setAssignee(username);
		post("runtime/tasks/" + taskId, payload);
	}

	public RuntimeTask getTask(String taskId) throws IOException {
		HttpResponse response = get("runtime/tasks/" + taskId);
		return response.parseAs(RuntimeTask.class);
	}

	public void completeTask(String taskId, RuntimeVariables variables) throws IOException {
		TaskAction payload = new TaskAction();
		payload.setAction(TaskActionEnum.complete);
		payload.setVariables(variables);
		post("runtime/tasks/" + taskId, payload);
	}

	public RuntimeTask getHistoricTask(String taskId) throws IOException {
		HttpResponse response = get("history/historic-task-instances/" + taskId);
		return response.parseAs(HistoricTask.class);
	}

	public void listDeployments() throws IOException {
		HttpResponse response = get("repository/deployments");
		System.out.println(response.parseAsString());
	}

	public RuntimeTasks listTasksPending() throws IOException {
		HttpResponse response = get("runtime/tasks?candidateGroup=engineering");
		return response.parseAs(RuntimeTasks.class);
	}

	public RuntimeTasks listTasksAssigned() throws IOException {
		HttpResponse response = get("runtime/tasks?assigned=" + username);
		return response.parseAs(RuntimeTasks.class);
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

	public RuntimeVariables getProcessVariables(String processInstanceId) throws IOException {
		HttpResponse response = get("runtime/process-instances/" + processInstanceId + "/variables");
		return response.parseAs(RuntimeVariables.class);
	}

}
