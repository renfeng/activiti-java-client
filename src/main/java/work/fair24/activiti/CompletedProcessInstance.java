package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 2/16/17.
 */
public class CompletedProcessInstance extends AbstractProcessInstance {

	@Key("startTime")
	private String startTime;

	@Key("endTime")
	private String endTime;

	@Key("durationInMillis")
	private Long durationInMillis;

	@Key("startUserId")
	private String startUserId;

	@Key("startActivityId")
	private String startActivityId;

	@Key("endActivityId")
	private String endActivityId;

	@Key("deleteReason")
	private String deleteReason;

	@Key("superProcessInstanceId")
	private String superProcessInstanceId;

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getDurationInMillis() {
		return durationInMillis;
	}

	public void setDurationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
	}

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public String getStartActivityId() {
		return startActivityId;
	}

	public void setStartActivityId(String startActivityId) {
		this.startActivityId = startActivityId;
	}

	public String getEndActivityId() {
		return endActivityId;
	}

	public void setEndActivityId(String endActivityId) {
		this.endActivityId = endActivityId;
	}

	public String getDeleteReason() {
		return deleteReason;
	}

	public void setDeleteReason(String deleteReason) {
		this.deleteReason = deleteReason;
	}

	public String getSuperProcessInstanceId() {
		return superProcessInstanceId;
	}

	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}
}
