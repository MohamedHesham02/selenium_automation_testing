package Pages;

import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    protected By fileUploadButton = By.id("file-upload");
    protected By fileSubmitButton = By.id("file-submit");
    protected WebDriver driver;
    private By SuccessStatus = By.tagName("h3");
    private By FileName = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void UploadFileSubmission(String absPath){
        driver.findElement(fileUploadButton).sendKeys(absPath);
        driver.findElement(fileSubmitButton).click();
    }
    public String UploadFileSubmissionSuccess(){
        return driver.findElement(SuccessStatus).getText();
    }
    public String UploadFileSubmittedFile(){
        return driver.findElement(FileName).getText();
    }
}
