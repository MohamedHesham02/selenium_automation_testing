package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;

public class TextEditorFramePage {
    protected WebDriver driver;
    protected String FrameArea = "mce_0_ifr";
    protected By textArea = By.id("tinymce");

    //protected By button = By.;

    public TextEditorFramePage(WebDriver driver){
        this.driver = driver;
    }
    public void SwitchToEditor(String FrameID){
        driver.switchTo().frame(FrameID);
    }

    public void SwitchToMainFrame(){
        driver.switchTo().parentFrame();
    }

    public void ClearEditor(String FrameID){
        SwitchToEditor(FrameID);
        driver.findElement(textArea).clear();
    }

    public void WriteToEditor(String FrameID, String text){
        SwitchToEditor(FrameID);
        driver.findElement(textArea).sendKeys(text);
    }



}
