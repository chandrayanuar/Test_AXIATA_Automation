package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class EditGist {

	private WebDriver driver;

	public EditGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[@class='css-truncate-target'][normalize-space()='Testing Gist']")
	private WebElement btnGist;
	
	@FindBy(css = "ul[class='d-md-flex d-none pagehead-actions float-none'] a[aria-label='Edit this Gist']")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//input[@placeholder='Gist description…']")
	private WebElement txtDescription;

	@FindBy(xpath = "//input[@placeholder='Filename including extension…']")
	private WebElement txtFilename;

	@FindBy(xpath = "//pre[@role='presentation']")
	private WebElement txtIsi;

	@FindBy(xpath = "//button[normalize-space()='Update secret gist']")
	private WebElement btnUpdate;
	
	public void Edit() throws InterruptedException {
		
		btnGist.click();
		Thread.sleep(2000);
		btnEdit.click();
		Thread.sleep(2000);
		txtDescription.clear();
		txtDescription.sendKeys("UUUUUUOOOOOOO");
		txtFilename.clear();
		txtFilename.sendKeys("AAIIBBOOOO");
		Thread.sleep(1000);
		txtIsi.clear();
		txtIsi.sendKeys("CCCHHHHEEESSSAAAARRR");
		btnUpdate.click();
		Thread.sleep(4000);
	}
}
