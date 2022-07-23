package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSubmitted_Assign {
    public WebDriver driver;
    public By message = By.className("alert alert-success");

    public FormSubmitted_Assign(WebDriver driver){
        this.driver = driver;
    }
    public String SubmissionMessage(){
        return driver.findElement(message).getText();
    }
}
