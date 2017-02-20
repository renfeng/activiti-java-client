package work.fair24.activiti;

import com.google.api.client.util.Key;
import com.google.api.client.util.Value;

/**
 * Created by renfeng on 12/11/16.
 */
public class QueryVariable {

	@Key("name")
	private String name;

	/**
	 * string, long, boolean?, date?, enum (string)
	 */
	@Key("value")
	private String value;

	@Key("operation")
	private Operation operation;

	@Key("type")
	private final VariableType type;

	public QueryVariable() {
		this.type = VariableType.string;
	}

	public QueryVariable(String name, Operation operation, String value) {
		this();
		setName(name);
		setOperation(operation);
		setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VariableType getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public enum Operation {
		@Value("equals")equals,
		@Value("notEquals")notEquals,
		@Value("equalsIgnoreCase")equalsIgnoreCase,
		@Value("notEqualsIgnoreCase")notEqualsIgnoreCase,
		@Value("lessThan")lessThan,
		@Value("greaterThan")greaterThan,
		@Value("lessThanOrEquals")lessThanOrEquals,
		@Value("greaterThanOrEquals")greaterThanOrEquals,
		@Value("like")like,
		@Value("likeIgnoreCase")likeIgnoreCase,
	}
}
