package VOR_Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vor_report {
		
	@FindBy(xpath = "//button[.=\" Add new \"]")
	private WebElement addnew_btn;
	
	@FindBy(xpath = "//input[@formcontrolname=\"LogdateAdd\"]")
	private WebElement Loggdateadd;
	
	@FindBy(xpath = "//ng-select[@role=\"listbox\"]/div[@class=\"ng-select-container\"]//div[2]/input")
	private WebElement Customername;
	
	@FindBy(xpath = "//span[@class=\"ng-arrow-wrapper\"]")
	private WebElement cust_name_arrow_btn;
	//      
	@FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div")
	private List<WebElement> customerList;
	
//	@FindBy(xpath = "//div[@class=\"modal-content\"]//div[.=\"Select Customer\"]/div/div[1]")
//	private WebElement enter_custName;
	
	@FindBy(xpath = "//div[@class=\"modal-content\"]//div[.=\"Select Customer\"]//input")
	private WebElement enter_custName;
	
	
	public Vor_report(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Add_new() {
		addnew_btn.click();
	}
	
	
	public void logg_date() {
	Loggdateadd.click();
	Loggdateadd.clear();
	Loggdateadd.click();
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Format the date according to your desired format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formattedDate = currentDate.format(formatter);

	        System.out.println("Current date: " + formattedDate);
	        
	        Loggdateadd.sendKeys(formattedDate);

	        // Assuming you want to use the current date in your Selenium code
	        // You can pass the 'formattedDate' value to your Selenium code
	    }
	
	public void select_cust() {
		//Customername.click();
		cust_name_arrow_btn.click();
		//enter_custName.click();
	}
	
	public void select_cust_list() {
		int cust_count = customerList.size();
		System.out.println(cust_count);
		for (int i = 0; i < cust_count; i++) {
	        WebElement custElement = customerList.get(i);
	        String name = custElement.getText();
	        System.out.println("Name at index " + i + ": " + name);
	       
	       
		 if(name.contains("kumar")) {
			 custElement.click();
			 break;
			 
		 	}
		}
	}
}















