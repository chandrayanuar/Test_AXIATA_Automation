package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import pages.Login;

public class mainApp {

	Login login;
	
	@BeforeSuite
	public void initializeObjects() {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://gist.github.com/");
		login = new Login();
	}
	
	@Test
	public void testing() throws InterruptedException {
		
		login.Login();
	}
}
