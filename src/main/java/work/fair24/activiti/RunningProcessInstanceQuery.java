package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/11/16.
 */
public class RunningProcessInstanceQuery implements Payload {

	@Key("processDefinitionKey")
	private final String processDefinitionKey;

	@Key("variables")
	private List<QueryVariable> variables;

	public RunningProcessInstanceQuery(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public List<QueryVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<QueryVariable> variables) {
		this.variables = variables;
	}
}
