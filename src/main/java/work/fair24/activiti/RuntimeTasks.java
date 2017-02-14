package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 9/18/16.
 */
public class RuntimeTasks {

	@Key("data")
	private List<RuntimeTask> data;

	@Key("order")
	private String order;

	@Key("size")
	private int size;

	@Key("sort")
	private String sort;

	@Key("start")
	private int start;

	@Key("total")
	private int total;

	public List<RuntimeTask> getData() {
		return data;
	}

	public void setData(List<RuntimeTask> data) {
		this.data = data;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
