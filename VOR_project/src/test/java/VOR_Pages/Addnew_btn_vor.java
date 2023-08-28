package VOR_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import VOR_Base.VOR_base_class1;

public class Addnew_btn_vor<WebElements> extends VOR_base_class1 {

	@FindBy(xpath = "//button[. = \" Add new \"]")
	private WebElement Add_new_btn;

	@FindBy(partialLinkText = " Add new ")
	private WebElement addnew;

	@FindBy(xpath = "//div[@class=\"modal-body modal-body_custom\"]//div[@class=\"row\"]//div[@class=\"form-group\"]/label")
	private List<WebElement> adnewpageelements;

	@FindBy(xpath = "//div[@class=\"modal-content\"]/div[2]//span[@class=\"ng-arrow-wrapper\"]")
	private List<WebElement> dropdown_click;

	@FindBy(xpath = "//*[@id=\"AddNewStation\"]/div/div/div[2]/form/div[1]/div[15]/div/input")
	private WebElement etc_date;

	@FindBy(xpath = "//input[@formcontrolname=\"LogdateAdd\"]")
	private WebElement log_add_date;

	@FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div")
	private List<WebElement> dropdown_List;

	@FindBy(xpath = "//input[@formcontrolname=\"Remarks\"]")
	private WebElement remarks;

	@FindBy(xpath = "//div[@class=\"modal-footer\"]/button[.=\" Submit \"]")
	private WebElement submit_button;

	public Addnew_btn_vor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	static String page_elements_names;
	static String page_ele_names_List;
	int a, k;
	int dropdownlist_count;
	String formattedDate;

	public void clik_add_new() {
		// addnew.click();
		Add_new_btn.click();
	}

	public void selectdate() {
		log_add_date.click();
		log_add_date.clear();
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Format the date according to your desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
		formattedDate = currentDate.format(formatter);
		System.out.println(formattedDate);
		log_add_date.sendKeys(formattedDate);
	}


//	public void select_cust() throws InterruptedException {
//		for (int k = 0; k <= 11; k++) {
//
//			System.out.println(dropdown_click.size() + "  and k value is = " + k);
//			WebElement field_click = dropdown_click.get(k);
//			if (field_click.isEnabled())
//				field_click.click();
//			dropdownlist_count = dropdown_List.size();
//			for (int a = 0; a < dropdownlist_count; a++) {
//				WebElement dropdown_elements = dropdown_List.get(a);
//				String dropdown_elements_name = dropdown_elements.getText();
//				System.out.println(dropdown_elements_name);
//				RandomNumberGenerator(a, dropdownlist_count);
//				dropdown_elements.click();
//				System.out.println("completed with a = " + a + "    drop down list count is = " + dropdownlist_count);	
//				
//					}
//			
//		}
//			
//		}
	
	
	public void select_cust() throws InterruptedException {
	    int dropdownClickSize = dropdown_click.size();
	    int dropdownListSize = dropdown_List.size();

	    for (int k = 0; k < dropdownClickSize; k++) {
	        System.out.println("Dropdown click size: " + dropdownClickSize + ", k value is: " + k);
	        
	        WebElement field_click = dropdown_click.get(k);
	       
	        if (field_click.isEnabled())
	        	
	            field_click.click();
	     
	        
	        for ( a = 0; a < dropdownListSize; ) {
	        	
	            
	            WebElement dropdown_elements = dropdown_List.get(a);
	            String dropdown_elements_name = dropdown_elements.getText();
	            System.out.println(dropdown_elements_name);
	            RandomNumberGenerator(a, dropdownListSize);
	            dropdown_elements.click();
	            System.out.println("Completed with a = " + a + "    Dropdown list count is = " + dropdownListSize);
	            a++;
	            break;
	        }  
	    }
	}


		

	public void selectetc_date() {
		waittill(etc_date);
		etc_date.click();
		
		// etc_date.click();
		etc_date.clear();
		LocalDate currentDate = LocalDate.now();

		// Format the date according to your desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
		formattedDate = currentDate.format(formatter);
		etc_date.sendKeys(formattedDate);
		System.out.println("date is selected for etc");

	}


	


	public void enter_remarks() {
		waittill(remarks);
		remarks.click();
		remarks.clear();
		remarks.sendKeys("no remarks");
		System.out.println("Remarks are entered");
	}

	public void click_submit() throws InterruptedException {
		waittill(submit_button);
		 while (!isElementClickable(submit_button)) {
		        // Scroll the page down
		        scrollPageDown();

		        // Wait for a brief moment to allow any dynamic content to load
		        sleep_time(500);  // You might need to adjust the delay based on your application

		        // Retry the check for interactability
		        if (isElementClickable(submit_button)) {
		            break;
		        }
		submit_button.click();
		System.out.println("submit button click method");
		        }
		 }
	}




