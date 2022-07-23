package JSButton;

import Pages.JSButtonsPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JSButtonTest extends BaseTests {
    @Test
    public void JSButton(){
        JSButtonsPage Alert = homepage.clickJSAlert();
        Alert.GetTriggerJSPrompt();
        /*
        Alert.AcceptAlert();
        assertEquals(Alert.AlertOutput(), "You successfully clicked an alert", "The result is not the expected");
         */
        String Text = "Mohamed";
        Alert.AlertInput(Text);
        Alert.AcceptAlert();
        assertEquals(Alert.AlertOutput(), "You entered: "+Text, "The result is not the expected");
    }
}
