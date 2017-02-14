package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/14/16.
 */
public class TaskAction implements Payload {

	@Key("action")
	private TaskActionEnum action;

	@Key("assignee")
	private String assignee;

	@Key("variables")
	private List<RuntimeVariable> variables;

	public TaskActionEnum getAction() {
		return action;
	}

	public void setAction(TaskActionEnum action) {
		this.action = action;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public List<RuntimeVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RuntimeVariable> variables) {
		this.variables = variables;
	}
}
