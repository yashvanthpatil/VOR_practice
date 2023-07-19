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

	@FindBy(xpath = "//div[@class=\"ng-input\"]/input")
	private List<WebElement> dropdown_click;

	@FindBy(xpath = "//input[@formcontrolname=\"ETC\"]")
	private WebElement etc_date;

	@FindBy(xpath = "//input[@formcontrolname=\"LogdateAdd\"]")
	private WebElement log_add_date;

	@FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div")
	private List<WebElement> dropdown_List;

	@FindBy(xpath = "//input[@formcontrolname=\"Remarks\"]")
	private WebElement remarks;

	public Addnew_btn_vor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

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
		String formattedDate = currentDate.format(formatter);
		System.out.println(formattedDate);
		log_add_date.sendKeys(formattedDate);
	}

	public void select_cust() throws InterruptedException {
	    int page_elements_count = adnewpageelements.size();
	    for (int i = 0; i <15; i++) {
	    	
	        WebElement page_elements_names = adnewpageelements.get(i);
	        String page_ele_names_List = page_elements_names.getText();
	        if (page_ele_names_List.contains("Customer")) {
	        	for (int a = 0; a < i; a++) {
	        System.out.println(page_ele_names_List);
	        System.out.println("completed with i   :   =  " + i);
	        WebElement field_click = dropdown_click.get(i);

	       
	            field_click.click();
	            dropdown_List.size();
	                WebElement dropdown_elements = dropdown_List.get(a);
	                String dropdown_elements_name = dropdown_elements.getText();
	                System.out.println(dropdown_elements_name);
	                RandomNumberGenerator(a-1, i);
	                dropdown_elements.click();
	                System.out.println("completed with a");
	                break;
	            }
	        }

	        // Rest of the code for other conditions and loops
	    }
	} // Missing closing brace for select_cust() method

	// Rest of the code

		

//			if(page_ele_names_List.contains("Region")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int c = 0; c < dropdown_list_count; c++) {
//					WebElement dropdown_elements  = dropdown_List.get(c);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(c+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with c");
//				}
//			}
//			if(page_ele_names_List.contains("OEM")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int d = 0; d < dropdown_list_count; d++) {
//					WebElement dropdown_elements  = dropdown_List.get(d);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(d+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with d");
//				}
//			}
//			if(page_ele_names_List.contains("OEM")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int e = 0; e < dropdown_list_count; e++) {
//					WebElement dropdown_elements  = dropdown_List.get(e);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(e+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with e");
//				}
//			}
//			if(page_ele_names_List.contains("Vehicle No")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int f = 0; f < dropdown_list_count; f++) {
//					WebElement dropdown_elements  = dropdown_List.get(f);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(f+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with f");
//				}
//			}
//			if(page_ele_names_List.contains("Chassis No")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int g = 0; g < dropdown_list_count; g++) {
//					WebElement dropdown_elements  = dropdown_List.get(g);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(g+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with g");
//				}
//			}
//			if(page_ele_names_List.contains("Hub")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int h = 0; h < dropdown_list_count; h++) {
//					WebElement dropdown_elements  = dropdown_List.get(h);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(h+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with h");
//				}
//			}
//			if(page_ele_names_List.contains("Type Of VOR")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int j = 0; j < dropdown_list_count; j++) {
//					WebElement dropdown_elements  = dropdown_List.get(j);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(j+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with j");
//				}
//			}
//			
//			if(page_ele_names_List.contains("Pending For")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int k = 0; k < dropdown_list_count; k++) {
//					WebElement dropdown_elements  = dropdown_List.get(k);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(k+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with k");
//				}
//			}
//			if(page_ele_names_List.contains("M-docks Required")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int l = 0; l < dropdown_list_count; l++) {
//					WebElement dropdown_elements  = dropdown_List.get(l);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(l+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with l");
//				}
//			}
//			
//			if(page_ele_names_List.contains("S-docks Required")) {
//				dropdown_click.click();
//				int dropdown_list_count = dropdown_List.size();
//				for (int m = 0; m<dropdown_list_count; m++) {
//					WebElement dropdown_elements  = dropdown_List.get(m);
//					String dropdown_elements_name = dropdown_elements.getText();
//					System.out.println(dropdown_elements_name);
//					RandomNumberGenerator(m+1, dropdown_list_count);
//					dropdown_elements.click();
//					System.out.println("completed with m");
//					break;
//				}
//			}
//			

	public void enter_remarks() {
		remarks.click();
	}
}

//	public void select_etc_date() {
//		etc_date.click();
//		etc_date.clear();
//		LocalDate currentDate = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
//		String formattedDate = currentDate.format(formatter);
//		System.out.println(formattedDate);
//		etc_date.sendKeys(formattedDate);
//	}
//}

//	public class CurrentDateExample {
//	        // Get the current date
//	        LocalDate currentDate = LocalDate.now();
//
//	        // Format the date according to your desired format
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("/MM/dd");
//	        String formattedDate = currentDate.format(formatter);
//	        
//	    }
//	
//	
//
//	public void DateInputExample() {
//	   
//	        Scanner scanner = new Scanner(System.in);
//	       System.out.println("enter from date: in : (format: yyyy/mm/dd)");
//	       String dateinput = scanner.nextLine();
//	       

//	        System.out.print("Enter the date (format: dd/mm/yyyy): ");
//	        String dateInput = scanner.nextLine();
//
//	        // Assuming you want to use the entered date in Selenium
//	        // You can pass the 'dateInput' value to your Selenium code
//
//	        System.out.println("Entered date: " + dateInput);
//
//	        // Remember to close the scanner
//	        scanner.close();
