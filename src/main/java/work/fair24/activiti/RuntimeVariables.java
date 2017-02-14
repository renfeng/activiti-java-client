package work.fair24.activiti;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by renfeng on 10/6/16.
 */
public class RuntimeVariables extends ArrayList<RuntimeVariable> implements List<RuntimeVariable> {

	public SortedMap<String, RuntimeVariable> map() {

		TreeMap<String, RuntimeVariable> map = new TreeMap<>();

		for (RuntimeVariable v : this) {
			map.put(v.getName(), v);
		}

		return map;
	}

	public SortedMap<String, String> mapValue() {

		TreeMap<String, String> map = new TreeMap<>();

		for (RuntimeVariable v : this) {
			map.put(v.getName(), v.getValue());
		}

		return map;
	}
}
