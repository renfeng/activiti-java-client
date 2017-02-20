package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 2/16/17.
 */
public abstract class AbstractProcessInstance extends Payload {

	@Key("id")
	private String id;

	@Key("url")
	private String url;

	@Key("businessKey")
	private String businessKey;

	@Key("processDefinitionId")
	private String processDefinitionId;

	@Key("processDefinitionUrl")
	private String processDefinitionUrl;

	@Key("variables")
	private List<Variable> variables;

	@Key("tenantId")
	private String tenandId;

	@Key("name")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessDefinitionUrl() {
		return processDefinitionUrl;
	}

	public void setProcessDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
	}

	public List<Variable> getVariables() {
		return variables;
	}

	public void setVariables(List<Variable> variables) {
		this.variables = variables;
	}

	public String getTenandId() {
		return tenandId;
	}

	public void setTenandId(String tenandId) {
		this.tenandId = tenandId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
