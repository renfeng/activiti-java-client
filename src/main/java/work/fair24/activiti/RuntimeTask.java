package work.fair24.activiti;

import com.google.api.client.util.DateTime;
import com.google.api.client.util.Key;

import java.util.List;

public class RuntimeTask {

	@Key("assignee")
	private String assignee;

	/**
	 * not in HistoricTask
	 */
	@Key("category")
	private String category;

	/**
	 * not in HistoricTask
	 */
	@Key("createTime")
	private DateTime createTime;

	/**
	 * not in HistoricTask
	 */
	@Key("delegationState")
	private String delegationState;

	@Key("description")
	private String description;

	@Key("dueDate")
	private String dueDate;

	@Key("executionId")
	private String executionId;

	/**
	 * not in HistoricTask
	 */
	@Key("executionUrl")
	private String executionUrl;

	@Key("formKey")
	private String formKey;

	@Key("id")
	private String id;

	@Key("name")
	private String name;

	@Key("owner")
	private String owner;

	@Key("parentTaskId")
	private String parentTaskId;

	@Key("parentTaskUrl")
	private String parentTaskUrl;

	@Key("priority")
	private int priority;

	@Key("processDefinitionId")
	private String processDefinitionId;

	@Key("processDefinitionUrl")
	private String processDefinitionUrl;

	@Key("processInstanceId")
	private String processInstanceId;

	@Key("processInstanceUrl")
	private String processInstanceUrl;

	@Key("suspended")
	private boolean suspended;

	@Key("taskDefinitionKey")
	private String taskDefinitionKey;

	@Key("tenantId")
	private String tenantId;

	@Key("url")
	private String url;

	@Key("variables")
	private List<RuntimeVariable> variables;

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public DateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(DateTime createTime) {
		this.createTime = createTime;
	}

	public String getDelegationState() {
		return delegationState;
	}

	public void setDelegationState(String delegationState) {
		this.delegationState = delegationState;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getExecutionUrl() {
		return executionUrl;
	}

	public void setExecutionUrl(String executionUrl) {
		this.executionUrl = executionUrl;
	}

	public String getFormKey() {
		return formKey;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public String getParentTaskUrl() {
		return parentTaskUrl;
	}

	public void setParentTaskUrl(String parentTaskUrl) {
		this.parentTaskUrl = parentTaskUrl;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceUrl() {
		return processInstanceUrl;
	}

	public void setProcessInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	public String getTaskDefinitionKey() {
		return taskDefinitionKey;
	}

	public void setTaskDefinitionKey(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<RuntimeVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RuntimeVariable> variables) {
		this.variables = variables;
	}
}
