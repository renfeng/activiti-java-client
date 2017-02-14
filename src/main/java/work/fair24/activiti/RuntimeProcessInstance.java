package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 7/30/16.
 */
public class RuntimeProcessInstance implements Payload {

	/*
	 * response
	 */

	@Key("id")
	private String id;

	@Key("url")
	private String url;

	@Key("businessKey")
	private String businessKey;

	@Key("suspended")
	private Boolean suspended;

	@Key("ended")
	private Boolean ended;

	@Key("processDefinitionId")
	private String processDefinitionId;

	@Key("processDefinitionUrl")
	private String processDefinitionUrl;

	/**
	 * also in request
	 */
	@Key("processDefinitionKey")
	private String processDefinitionKey;

	@Key("activityId")
	private String activityId;

	/**
	 * also in request
	 */
	@Key("variables")
	private List<RuntimeVariable> variables;

	@Key("tenantId")
	private String tenandId;

	@Key("name")
	private String name;

	@Key("completed")
	private Boolean completed;

	public RuntimeProcessInstance() {
	}

	public RuntimeProcessInstance(String processDefinitionKey) {
		setProcessDefinitionKey(processDefinitionKey);
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public List<RuntimeVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RuntimeVariable> variables) {
		this.variables = variables;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public Boolean getSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public Boolean getEnded() {
		return ended;
	}

	public void setEnded(Boolean ended) {
		this.ended = ended;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessDefinitionUrl() {
		return processDefinitionUrl;
	}

	public void setProcessDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getTenandId() {
		return tenandId;
	}

	public void setTenandId(String tenandId) {
		this.tenandId = tenandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
}
