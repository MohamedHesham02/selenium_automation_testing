package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By Figure = By.className("figure");
    private By FigureCapBox = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption HoverOverPage(int index){
        WebElement figure = driver.findElements(Figure).get(index - 1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(FigureCapBox));
    }

    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public Boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String GetCaptionTitle(){
            return caption.findElement(header).getText();
        }

        public String GetLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String GetLinkText(){
            return caption.findElement(link).getText();
        }

    }

}
