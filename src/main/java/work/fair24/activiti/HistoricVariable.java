package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 2/17/17.
 */
public class HistoricVariable {

	@Key("id")
	private String id;

	@Key("processInstanceId")
	private String processInstanceId;

	@Key("processInstanceUrl")
	private String processInstanceUrl;

	@Key("taskId")
	private String taskId;

	@Key("variable")
	private Variable variable;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}
}
