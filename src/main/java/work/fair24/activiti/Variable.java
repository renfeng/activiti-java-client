package work.fair24.activiti;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 7/30/16.
 */
public class Variable implements Comparable<Variable> {

	@Key("name")
	private String name;

	/**
	 * string, long, boolean?, date?, enum (string)
	 */
	@Key("type")
	private VariableType type;

	@Key("value")
	private String value;

	@Key("scope")
	private String scope;

	public Variable() {
		this.type = VariableType.string;
	}

	public Variable(String name, String value) {
		this();
		setName(name);
		setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public VariableType getType() {
		return type;
	}

	public void setType(VariableType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return getName() + " = " + getValue();
	}

	@Override
	public int compareTo(Variable o) {
		return getName().compareTo(o.getName());
	}
}
