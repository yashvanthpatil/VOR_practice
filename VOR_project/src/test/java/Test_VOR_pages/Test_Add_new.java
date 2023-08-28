package Test_VOR_pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import VOR_Base.VOR_base_class1;
import VOR_Pages.Addnew_btn_vor;
import VOR_Pages.Homepage_vor;
import VOR_Pages.Login_page_vor;

public class Test_Add_new extends VOR_base_class1 {

	@Test
	public void Add_new_test() throws InterruptedException {
		Login_page_vor lvor = new Login_page_vor(driver);
		lvor.click_login_link();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(4000);
		lvor.enter_email();
		lvor.click_button();
		Thread.sleep(2000);
		lvor.enter_password();
		lvor.click_button();
		Thread.sleep(3000);
		lvor.click_button();
		Thread.sleep(3000);
		System.out.println("1 time execution completed");
		driver.switchTo().window(parent);
		driver.navigate().refresh();
		Thread.sleep(10000);
		Homepage_vor hp = new Homepage_vor(driver);
		hp.movetomenu();
		System.out.println("expanded the nav bar");
		waitfor(4000);
		hp.clickvorreport();
		Thread.sleep(8000);
		hp.movetomenu();
		Addnew_btn_vor<WebElement> ad = new Addnew_btn_vor<>(driver);
		ad.clik_add_new();
		ad.selectdate();
		ad.selectetc_date();
		ad.enter_remarks();
		ad.select_cust();
		ad.click_submit();
		
	}

}
