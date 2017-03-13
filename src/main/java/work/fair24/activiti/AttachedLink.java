package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 3/13/17.
 */
public class AttachedLink extends Payload {

	@Key("name")
	String name;

	@Key("description")
	String description;

	@Key("type")
	String type;

	@Key("externalUrl")
	String externalUrl;

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

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}
}
