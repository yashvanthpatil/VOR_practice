package Test_VOR_pages;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import VOR_Base.VOR_base_class1;
import VOR_Pages.Login_page_vor;

public class Test_login_page extends VOR_base_class1 {
    @Test
    public void login_test() throws InterruptedException {
        Login_page_vor lvor = new Login_page_vor(driver);
        lvor.click_login_link();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        System.out.println(parent);
        String child = it.next();
        driver.switchTo().window(child);
        Thread.sleep(4000);
        lvor.enter_email();
        lvor.click_button();
        Thread.sleep(2000);
        lvor.enter_password();
        lvor.click_button();
        Thread.sleep(5000);
        lvor.click_button();
        Thread.sleep(3000);
        System.out.println("1 time execution completed");
    }
}
