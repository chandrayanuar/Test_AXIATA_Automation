package utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String myusername;
	
	@Value("${password}")
	private String password;

	public String getBrowser() {
		return browser;
	}

	public String getUsername() {
		return myusername;
	}

	public String getPassword() {
		return password;
	}
}
