package work.fair24.activiti;

import com.google.api.client.util.Value;

public enum TaskActionEnum {
	@Value("complete")complete,
	@Value("claim")claim,
	@Value("delegate")delegate,
	@Value("resolve")resolve
}
