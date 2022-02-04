package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class ListGist {

	private WebDriver driver;
	
	public ListGist() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div[1]/div/div[1]/div/div/div[2]/div[1]/h1/span[1]/a")
	private WebElement btnHome;
	
	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div/div/div[2]/div[1]/nav/div[2]/div/div/details/summary")
	private WebElement btnRecentlyCreate;
	
	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div/div/div[2]/div[1]/nav/div[2]/div/div/details/details-menu/div[2]/a[2]")
	private WebElement btnLeastCreate;
	
	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div/div/div[2]/div[1]/nav/div[2]/div/div/details/details-menu/div[2]/a[3]")
	private WebElement btnRecentlyUpdate;
	
	@FindBy(xpath = "//*[@id=\"gist-pjax-container\"]/div/div/div[2]/div[1]/nav/div[2]/div/div/details/details-menu/div[2]/a[4]/span")
	private WebElement btnLeastUpdate;
	
	public void List() throws InterruptedException {
		
		btnHome.click();
		btnRecentlyCreate.click();
		btnLeastCreate.click();
		btnRecentlyCreate.click();
		btnRecentlyUpdate.click();
		btnRecentlyCreate.click();
		btnLeastUpdate.click();
		Thread.sleep(4000);
	}
	
}
