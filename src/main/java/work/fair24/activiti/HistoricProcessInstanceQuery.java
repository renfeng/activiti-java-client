package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 2/16/17.
 */
public class HistoricProcessInstanceQuery extends RunningProcessInstanceQuery {

	@Key("finished")
	private Boolean finished;

	public HistoricProcessInstanceQuery(String processDefinitionKey) {
		super(processDefinitionKey);
	}

	public Boolean isFinished() {
		return finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
}
