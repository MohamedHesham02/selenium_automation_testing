package Hover;

import Pages.HoverPage;
import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTests {
    @Test
    public void HoverPageTest(){
        HoverPage hover = homepage.clickHoverPage();
        var caption = hover.HoverOverPage(1);
        System.out.println(caption.isCaptionDisplayed());
        System.out.println(caption.GetCaptionTitle());
        System.out.println(caption.GetLink());
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.GetCaptionTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(caption.GetLinkText(), "View profile", "Caption text link is incorrect");
        assertTrue(caption.GetLink().endsWith("/users/1"), "Link is incorrect");
    }

}
