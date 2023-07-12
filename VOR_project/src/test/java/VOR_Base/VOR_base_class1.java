package VOR_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VOR_base_class1 {
    public WebDriver driver;

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
    
   
    
    
    public void waittill(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOf(ele)).click();
    }

    @AfterMethod
    public void quite() {
       // driver.quit();
    }
}