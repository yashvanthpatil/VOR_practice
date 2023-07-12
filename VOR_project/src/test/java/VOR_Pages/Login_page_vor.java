package VOR_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import VOR_Base.VOR_base_class1;

public class Login_page_vor extends VOR_base_class1 {
	
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-log-in']")
    private WebElement login_link;

    @FindBy(id = "i0116")
    private WebElement enter_email;

    @FindBy(id = "idSIButton9")
    private WebElement button_to_login;

    @FindBy(id = "i0118")
    private WebElement enter_password;

    public Login_page_vor(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void click_login_link() {
        login_link.click();
    }

    public void enter_email() {
        enter_email.sendKeys("yashvanth.patil@sunmobility.com");
    }

    public void enter_password() {
        enter_password.sendKeys("Til@2021");
    }

    public void click_button() {
        button_to_login.click();
    }
}