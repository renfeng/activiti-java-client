package work.fair24.activiti;

import java.util.*;

/**
 * Created by renfeng on 10/6/16.
 */
public class Variables extends ArrayList<Variable> implements List<Variable> {

	public Variables() {
	}

	public Variables(Collection<Variable> c) {
		super(c);
	}

	public SortedMap<String, Variable> map() {

		TreeMap<String, Variable> map = new TreeMap<>();

		for (Variable v : this) {
			map.put(v.getName(), v);
		}

		return map;
	}

	public SortedMap<String, String> mapValue() {

		TreeMap<String, String> map = new TreeMap<>();

		for (Variable v : this) {
			map.put(v.getName(), v.getValue());
		}

		return map;
	}
}
