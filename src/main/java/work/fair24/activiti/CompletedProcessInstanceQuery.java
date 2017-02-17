package work.fair24.activiti;

/**
 * Created by renfeng on 2/16/17.
 */
public class CompletedProcessInstanceQuery extends RunningProcessInstanceQuery {
	public CompletedProcessInstanceQuery(String processDefinitionKey) {
		super(processDefinitionKey);
	}
}
