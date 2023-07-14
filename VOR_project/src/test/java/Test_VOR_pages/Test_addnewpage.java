package Test_VOR_pages;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import VOR_Base.VOR_base_class1;
import VOR_Pages.Homepage_vor;
import VOR_Pages.Login_page_vor;
import VOR_Pages.Add_new_page_vor;

public class Test_addnewpage extends VOR_base_class1 {
			
	@Test
	public void vor_report_test() throws InterruptedException {
	Login_page_vor lvor = new Login_page_vor(driver);
    lvor.click_login_link();
    Set<String> windows = driver.getWindowHandles();
    Iterator<String> it = windows.iterator();
    String parent = it.next();
    String child = it.next();
    driver.switchTo().window(child);
    Thread.sleep(2000);
    lvor.enter_email();
    lvor.click_button();
    Thread.sleep(2000);
    lvor.enter_password();
    lvor.click_button();
    Thread.sleep(2000);
    lvor.click_button();
    Thread.sleep(2000);
    System.out.println("1 time execution completed");
    driver.switchTo().window(parent);
    Thread.sleep(10000);
	Homepage_vor hp = new Homepage_vor(driver);
	hp.movetomenu();
	System.out.println("expanded the nav bar");
	waitfor(8000);
	hp.clickvorreport();
	Thread.sleep(2000);
	hp.movetomenu();
	Add_new_page_vor vr=new Add_new_page_vor(driver);
	vr.Add_new();
	vr.logg_date();
	 Thread.sleep(3000);
	vr.select_cust();
	vr.select_cust_list();
}
}
