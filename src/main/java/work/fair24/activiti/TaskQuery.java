package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/11/16.
 */
public class TaskQuery extends Payload {

	@Key("processInstanceId")
	private String processInstanceId;

	@Key("processDefinitionKey")
	private String processDefinitionKey;

	@Key("name")
	private String name;

	@Key("processInstanceVariables")
	private List<QueryVariable> processInstanceVariables;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QueryVariable> getProcessInstanceVariables() {
		return processInstanceVariables;
	}

	public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
	}
}
