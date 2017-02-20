package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/14/16.
 */
public class TaskAction extends Payload {

	@Key("action")
	private TaskActionEnum action;

	@Key("assignee")
	private String assignee;

	@Key("variables")
	private List<Variable> variables;

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

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}
}
