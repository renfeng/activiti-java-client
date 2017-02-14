package work.fair24.activiti;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 12/10/16.
 */
public class RuntimeProcessInstances {

	@Key("data")
	private List<RuntimeProcessInstance> data;

	@Key("total")
	private int total;

	@Key("start")
	private int start;

	@Key("sort")
	private String sort;

	@Key("order")
	private String order;

	@Key("size")
	private int size;

	public List<RuntimeProcessInstance> getData() {
		return data;
	}

	public void setData(List<RuntimeProcessInstance> data) {
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
