package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class DeleteGist {

	private WebDriver driver;

	public DeleteGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".btn-danger.btn-sm.btn")
	private WebElement btnDelete;
	
	public void Delete() throws InterruptedException {
		
		btnDelete.click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
