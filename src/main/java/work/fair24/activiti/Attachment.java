package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 3/13/17.
 */
public class Attachment {

	@Key("id")
	String id;

	@Key("url")
	String url;

	@Key("name")
	String name;

	@Key("description")
	String description;

	@Key("type")
	String type;

	@Key("taskUrl")
	String taskUrl;

	@Key("processInstanceUrl")
	String processInstanceUrl;

	@Key("externalUrl")
	String externalUrl;

	@Key("contentUrl")
	String contentUrl;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTaskUrl() {
		return taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public String getProcessInstanceUrl() {
		return processInstanceUrl;
	}

	public void setProcessInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
}
