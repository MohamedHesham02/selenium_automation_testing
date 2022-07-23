package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;
    protected By fromAuthenticationLink = By.linkText("Form Authentication");
    protected By fromHoverLink = By.linkText("Hovers");
    protected By fromKeyPress = By.linkText("Key Presses");
    protected By fromJSAlert = By.linkText("JavaScript Alerts");
    protected By FileUploadButton = By.linkText("File Upload");
    protected By EntryADButton = By.linkText("Entry Ad");
    protected By TextEditorButton = By.linkText("WYSIWYG Editor");
    protected By DynamicLoadingButton = By.linkText("Dynamic Loading");
    protected By MultipleWindowButton = By.linkText("Multiple Windows");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(fromAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public HoverPage clickHoverPage(){
        driver.findElement(fromHoverLink).click();
        return new HoverPage(driver);
    }

    public KeyPressPage clickKeyPressPage(){
        driver.findElement(fromKeyPress).click();
        return new KeyPressPage(driver);
    }

    public JSButtonsPage clickJSAlert(){
        driver.findElement(fromJSAlert).click();
        return new JSButtonsPage(driver);
    }

    public FileUploadPage UploadFile(){
        driver.findElement(FileUploadButton).click();
        return new FileUploadPage(driver);
    }
    public EntryADPage ModalEntryAD(){
        driver.findElement(EntryADButton).click();
        return new EntryADPage(driver);
    }
    public TextEditorFramePage TextEditor(){
        driver.findElement(TextEditorButton).click();
        return new TextEditorFramePage(driver);
    }

    public DynamicLoadingPage DynamicLoader(){
        driver.findElement(DynamicLoadingButton).click();
        return new DynamicLoadingPage(driver);
    }
    public MultipleWindowGenerator WindowGenerator(){
        driver.findElement(MultipleWindowButton).click();
        return new MultipleWindowGenerator(driver);
    }

}
