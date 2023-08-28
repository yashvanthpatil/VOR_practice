package VOR_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VOR_base_class1 {
    public static WebDriver driver;
    Actions act;

    @BeforeMethod
    public void startup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vehicle-dashboard-staging.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    public void waitfor(int x) throws InterruptedException {
    	Thread.sleep(x);
    }
    
    public void actionsfor(WebElement ele) {
    	Actions act = new Actions(driver);
    	 act.moveToElement(ele).build().perform();
    }
    public boolean isElementClickable(WebElement element) {
        try {
            return element.isEnabled() && element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void scrollPageDown() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");
    	
    }
    
    
    public void sleep_time(int q) throws InterruptedException {
    	Thread.sleep(q);
    }
    
   

    public void RandomNumberGenerator(int min,int dropdown_List) {
            Random random = new Random();
            int randomnumber= random.nextInt(dropdown_List - min + 1) + min;
            System.out.println("random number is :  "+ randomnumber);
        }
    

    
    
    public static void waittill(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOf(ele)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
    }
    
    public void actions_perform(WebElement Act_ele) {
    	act = new Actions(driver);
    	act.moveToElement(Act_ele).click().build().perform();
    }
   

    @AfterMethod
    public void quite() {
       // driver.quit();
    }
}