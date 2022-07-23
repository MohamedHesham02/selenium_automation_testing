package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowGenerator {
    public WebDriver driver;
    public By ClickHereButton = By.linkText("Click Here");

    public MultipleWindowGenerator(WebDriver driver){
        this.driver = driver;
    }
    public NewWindow popNewWindow(){
        driver.findElement(ClickHereButton).click();
        return new NewWindow(driver);
    }
}
