package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryADPage {
    protected WebDriver driver;
    protected By ModalTitle = By.tagName("h3");
    protected By ModalCloseButton = By.tagName("p");

    public EntryADPage(WebDriver driver){
        this.driver = driver;
    }

    public Boolean ModalAlert(){
        String title = driver.findElement(ModalTitle).getText();
        if (title.contains("THIS IS A MODAL WINDOW")){
            return true;
        }
        else {
            return false;
        }
    }
    public void ModelClose(){
        driver.findElement(ModalCloseButton).click();
    }
}
