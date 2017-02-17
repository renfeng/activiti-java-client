package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/11/16.
 */
public class TaskQuery implements Payload {

	@Key("processInstanceId")
	private String processInstanceId;

	@Key("processInstanceVariables")
	private List<QueryVariable> processInstanceVariables;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public List<QueryVariable> getProcessInstanceVariables() {
		return processInstanceVariables;
	}

	public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
	}
}
