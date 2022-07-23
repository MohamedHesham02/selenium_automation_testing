package Assignment.base;

import Assignment.FormPage_Assign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestAssign {

    public WebDriver driver;
    public FormPage_Assign formPage;

    @BeforeClass
    public void SetUP(){
        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println(driver.getTitle());
        formPage = new FormPage_Assign(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    public static void main(String args[]){
        BaseTestAssign testware = new BaseTestAssign();
        testware.SetUP();
        // testware.tearDown();
    }
}
