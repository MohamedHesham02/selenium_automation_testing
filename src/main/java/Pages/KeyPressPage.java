package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressPage {
    public WebDriver driver;
    protected By inputField = By.id("target");
    protected By outputField = By.id("result");

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }
    public void WriteInput(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String GetOutput(){
        return driver.findElement(outputField).getText();
    }
}
