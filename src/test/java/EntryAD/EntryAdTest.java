package EntryAD;

import Pages.EntryADPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTest extends BaseTests {
    @Test
    public void Testware(){
        EntryADPage Modal = homepage.ModalEntryAD();
        Modal.ModelClose();
        // Assert.assertTrue(Modal.ModalAlert(), "The title is not the expected");
    }
}
