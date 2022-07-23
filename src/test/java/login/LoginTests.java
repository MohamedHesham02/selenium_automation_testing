package login;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage login = homepage.clickFormAuthentication();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        SecureAreaPage securepage = login.ClickLogin();
        assertTrue(securepage.GetStatusAlert().contains("You logged into a secure area!"),
                "The actual output is not the expected");
    }
}
