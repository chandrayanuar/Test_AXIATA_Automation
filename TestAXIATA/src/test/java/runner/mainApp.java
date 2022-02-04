package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import pages.CreateGist;
import pages.DeleteGist;
import pages.EditGist;
import pages.ListGist;
import pages.Login;
import pages.Logout;

public class mainApp {

	Login login;
	CreateGist create;
	ListGist list;
	EditGist edit;
	DeleteGist delete;
	Logout logout;
	
	@BeforeSuite
	public void initializeObjects() {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://gist.github.com/");
		login = new Login();
		create = new CreateGist();
		list = new ListGist();
		edit = new EditGist();
		delete = new DeleteGist();
		logout = new Logout();
	}
	
	@Test
	public void testing() throws InterruptedException {
		
		login.LoginWeb();
		create.Create();
		list.List();
		edit.Edit();
		delete.Delete();
		logout.LogoutWeb();
		
	}
}
