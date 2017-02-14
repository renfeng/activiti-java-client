package work.fair24.activiti;

import com.google.inject.assistedinject.Assisted;

/**
 * Created by renfeng on 12/10/16.
 */
public interface ActivitiClientFactory {

	ActivitiClient create(@Assisted("username") String username, @Assisted("password") String password,
						  @Assisted("baseUrl") String baseUrl);
}
