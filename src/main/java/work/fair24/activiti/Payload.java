package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * https://www.activiti.org/userguide/#restPagingAndSort
 *
 * Created by renfeng on 12/11/16.
 */
public abstract class Payload {

	@Key("sort")
	private String sort;

	@Key("order")
	private String order;

	@Key("start")
	private Integer start;

	@Key("size")
	private Integer size;

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
}
