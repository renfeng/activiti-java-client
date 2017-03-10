package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 7/30/16.
 */
public class Resource {

	@Key("id")
	private String id;

	@Key("url")
	private String url;

	@Key("contentUrl")
	private String contentUrl;

	@Key("mediaType")
	private String mediaType;

	@Key("type")
	private String type;

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

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
