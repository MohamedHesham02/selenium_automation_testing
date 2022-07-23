package KeyPress;

import Pages.KeyPressPage;
import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPressTest extends BaseTests {
    @Test
    public void KeyTest(){
        KeyPressPage keypage = homepage.clickKeyPressPage();
        /*
        keypage.WriteInput("ABC"+ Keys.BACK_SPACE);
        assertEquals(keypage.GetOutput(), "You entered: BACK_SPACE");
        */
        keypage.WriteInput(Keys.chord(Keys.SHIFT, "2")); //pressing @ (shift+2) using chord
        assertEquals(keypage.GetOutput(), "You entered: 2");


    }
}
