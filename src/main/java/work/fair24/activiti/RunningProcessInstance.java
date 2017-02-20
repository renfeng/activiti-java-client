package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 7/30/16.
 */
public class RunningProcessInstance extends AbstractProcessInstance implements Payload {

	/*
	 * response
	 */

	@Key("suspended")
	private Boolean suspended;

	@Key("ended")
	private Boolean ended;

	/**
	 * also in request
	 */
	@Key("processDefinitionKey")
	private String processDefinitionKey;

	@Key("activityId")
	private String activityId;

	@Key("completed")
	private Boolean completed;

	public RunningProcessInstance() {
	}

	public RunningProcessInstance(String processDefinitionKey) {
		setProcessDefinitionKey(processDefinitionKey);
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
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

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
}
