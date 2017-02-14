package work.fair24.activiti;

import com.google.api.client.util.Key;

public class HistoricTask extends RuntimeTask {

	@Key("deleteReason")
	private String description;

	@Key("startTime")
	private String startTime;

	@Key("endTime")
	private String endTime;

	@Key("durationInMillis")
	private Long durationInMillis;

	@Key("workTimeInMillis")
	private Long workTimeInMillis;

	@Key("claimTime")
	private String claimTime;

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

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

	public Long getWorkTimeInMillis() {
		return workTimeInMillis;
	}

	public void setWorkTimeInMillis(Long workTimeInMillis) {
		this.workTimeInMillis = workTimeInMillis;
	}

	public String getClaimTime() {
		return claimTime;
	}

	public void setClaimTime(String claimTime) {
		this.claimTime = claimTime;
	}
}
