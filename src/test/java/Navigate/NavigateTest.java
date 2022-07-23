package Navigate;

import Pages.ExamplePage;
import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigateTest extends BaseTests {
    @Test
    public void testNavigate(){
        ExamplePage example1 = homepage.DynamicLoader().OpenPage();
        WindowManager window = GetWindowManger();
        window.GoBack();
        window.Refresh();
        window.GoForward();
        window.GoTo("https://www.google.com/");
    }

    @Test
    public void SwitchToTabTitle(){
        homepage.WindowGenerator().popNewWindow();
        GetWindowManger().SwitchToTab("New Window");
    }
}
