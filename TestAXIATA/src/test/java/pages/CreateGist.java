package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class CreateGist {

	private WebDriver driver;
	
	public CreateGist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='octicon octicon-plus d-none d-md-inline-block'])[1]")
	private WebElement btnTambah;
	
	@FindBy(xpath = "//input[@name='gist[description]']")
	private WebElement txtDescription;
	
	@FindBy(xpath = "//input[@name='gist[contents][][name]']")
	private WebElement txtFilename;
	
	@FindBy(xpath = "//*[@id=\"code-editor\"]/div/pre")
	private WebElement txtIsi;
	
	@FindBy(xpath = "//*[@id=\"new_gist\"]/div/div[2]/div/button")
	private WebElement btnCreate;
	
	public void Create() throws InterruptedException {
		
		btnTambah.click();
		txtDescription.sendKeys("Testing Gist");
		txtFilename.sendKeys("Testing Gist");
		txtIsi.click();
		txtIsi.sendKeys("WWWWRRRRRYYYYYYYY");
		btnCreate.click();
	}
}
