package DynamicLoader;

import Pages.DynamicLoadingPage;
import Pages.ExamplePage;
import base.BaseTests;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTests {
    @Test
    public void WaitTestware(){
        DynamicLoadingPage DynamicPage = homepage.DynamicLoader();
        ExamplePage example1 = DynamicPage.OpenPage();
        example1.StartClick();
        example1.StartClickWait();
        Assert.assertEquals(example1.StartClickStatus(), "Hello World!", "The result message is not the expected");
    }
}
