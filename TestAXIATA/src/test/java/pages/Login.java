package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class Login {

	private WebDriver driver;
	
	public Login() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "/html/body/div[1]/div/div[5]/a[1]")
	WebElement btnSignIn;
	
	@FindBy (xpath = "//*[@id=\"login_field\"]")
	WebElement txtUserName;
	
	@FindBy (xpath = "//*[@id=\"password\"]")
	WebElement txtPassword;
	
	@FindBy (xpath = "//*[@id=\"login\"]/div[3]/form/div/input[12]")
	WebElement btnLogin;
	
	public void LoginWeb() throws InterruptedException {
		
		btnSignIn.click();
		//Change your own username and password
		txtUserName.sendKeys("own username");
		txtPassword.sendKeys("own password");
		btnLogin.click();
		Thread.sleep(4000);
	}
	
}
