package Pages;

import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExamplePage {
    protected WebDriver driver;
    protected By StartButton = By.cssSelector("#start button");
    protected By LoadingBar = By.cssSelector("#loading");
    protected By StartButtonStatus=  By.cssSelector("#finish");
    protected Duration waitDuration = Duration.ofSeconds(5);
    protected Duration pollDuration = Duration.ofSeconds(1);


    protected ExamplePage(WebDriver driver){
        this.driver = driver;
    }

    public void StartClick(){
        driver.findElement(StartButton).click();
    }
    public String StartClickStatus(){
        return driver.findElement(StartButtonStatus).getText();
    }
    public void StartClickWait(){
        /*
        WebDriverWait wait = new WebDriverWait(driver, waitDuration);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingBar)));
        */

        // Another Technique of waiting with same output
        FluentWait wait = new FluentWait(driver).withTimeout(waitDuration).pollingEvery(pollDuration).ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(LoadingBar)));
    }

}
