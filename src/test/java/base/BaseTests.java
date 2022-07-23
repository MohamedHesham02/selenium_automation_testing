package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WindowManager;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;
    protected Duration duration = Duration.ofSeconds(3);
    @BeforeClass
    public void setUp(){
        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        // Set a time limit for page loading, in case of timeout(0.5 sec), it will return an error
        //driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.MILLISECONDS);
        homepage = new HomePage(driver);
        // Wait Order for all website test interactions, incase of time is out, it will give a no such exception error
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // System.out.println(driver.getTitle());
        /*
        driver.manage().window().setSize(new Dimension(375, 812));
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        WebElement inputLink = driver.findElement(By.linkText("Shifting Content"));
        inputLink.click();
        inputLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputLink.click();
        List<WebElement> links_2 = driver.findElements(By.tagName("a"));
        System.out.println(links_2.size());
        */

    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }

    public WindowManager GetWindowManger(){
        return new WindowManager(driver);
    }

    public static void main(String args[]){
        BaseTests tester = new BaseTests();
        tester.setUp();
    }
}
