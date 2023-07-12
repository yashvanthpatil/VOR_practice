package VOR_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VOR_Base.VOR_base_class1;

public class Homepage_vor extends VOR_base_class1 {
	
	@FindBy(xpath = "//div[@class=\"m-header\"]/a[@id=\"mobile-collapse\"]")
	private WebElement navigationbar;
	
	@FindBy(xpath = "//span[.='VOR Report'][1]")
	private WebElement vor_report_link;
	
	public Homepage_vor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void movetomenu() throws InterruptedException {
		navigationbar.click();
		
	}
	
	public void clickvorreport() {
		vor_report_link.click();
	}
	
}
