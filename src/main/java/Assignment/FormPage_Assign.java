package Assignment;

import Pages.SecureAreaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FormPage_Assign {
    public WebDriver driver;
    public By FirstNameField = By.id("first-name");
    public By LastNameField = By.id("last-name");
    public By JobtitleField = By.id("job-title");
    public By LevelOfEducationField_College = By.id("radio-button-2");
    public By Gender_Male = By.id("checkbox-1");
    public By ExperienceYearsField = By.id("select-menu");
    public By datePickerField = By.id("datepicker");
    public By submitField = By.name("submit");

    public FormPage_Assign(WebDriver driver){
        this.driver = driver;
    }
    public void setFirstName(){
        driver.findElement(FirstNameField).sendKeys("Mohamed");
    }
    public void setLastName(){
        driver.findElement(LastNameField).sendKeys("Ahmed");
    }
    public void setJobTitle(){
        driver.findElement(JobtitleField).sendKeys("Software Testing Engineer");
    }
    public void LevelOfEducation(){
        driver.findElement(LevelOfEducationField_College).click();
    }
    public void Gender(){
        driver.findElement(Gender_Male).click();
    }

    public void Experience(){
        WebElement selectionList = driver.findElement(ExperienceYearsField);
        Select Selector = new Select(selectionList);
        Selector.selectByValue("0");
    }

    public void DatePick(){
        driver.findElement(datePickerField).sendKeys("06/24/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
    }

    public FormSubmitted_Assign submitButton(){
        driver.findElement(submitField).submit();
        return new FormSubmitted_Assign(driver);
    }

}
