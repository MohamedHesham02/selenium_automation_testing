package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSButtonsPage {
    public WebDriver driver;
    private By triggerJSAlert = By.xpath(".//button[text()= 'Click for JS Alert']");
    private By triggerJSConfirmAlert = By.xpath(".//button[text()= 'Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath(".//button[text()= 'Click for JS Prompt']");
    private By triggerAlertOutput = By.id("result");
    public JSButtonsPage(WebDriver driver){
        this.driver = driver;
    }
    public void GetTriggerJSAlert(){
        driver.findElement(triggerJSAlert).click();
    }
    public void GetTriggerJSConfirmAlert(){
        driver.findElement(triggerJSConfirmAlert).click();
    }
    public void GetTriggerJSPrompt(){
        driver.findElement(triggerJSPrompt).click();
    }
    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void DismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void AlertInput(String text){
        driver.switchTo().alert().sendKeys(text);

    }
    public String AlertOutput(){
        return driver.findElement(triggerAlertOutput).getText();
    }

}
