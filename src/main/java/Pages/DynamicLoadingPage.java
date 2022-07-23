package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

public class DynamicLoadingPage {
    public WebDriver driver;
    public String LinkButton = ".//a[contains(text(),'%s')]";
    public By RequiredLink = By.xpath(String.format(LinkButton, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public ExamplePage OpenPage(){
        driver.findElement(RequiredLink).click();
        return new ExamplePage(driver);
    }

}
