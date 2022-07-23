package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.WeakHashMap;

public class SecureAreaPage {
    public WebDriver driver;
    public By statusAlert = By.id("flash-messages");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String GetStatusAlert(){
        return driver.findElement(statusAlert).getText();
    }
}
