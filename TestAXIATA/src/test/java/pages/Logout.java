package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class Logout {

	private WebDriver driver;

	public Logout() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//summary[@aria-label='View profile and more']//img[@alt='@chandrayanuar']")
	private WebElement btndropdown;

	@FindBy(xpath = "//button[@role='menuitem']")
	private WebElement btnsignOut;

	@FindBy(xpath = "//input[@value='Sign out']")
	private WebElement btnLogout;
	
	public void LogoutWeb() throws InterruptedException {
		
		btndropdown.click();
		btnsignOut.click();
		Thread.sleep(2000);
		btnLogout.click();
	}
}
