package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest{

    public LoginPage loginPage;
    public HomePage homePage;

    String homePageTitle = "PRODUCTS";
    String lockedUsername = "locked_out_user";
    String invalidUsername = "ivalidUser";
    String invalidPassword = "invalidPassword";
    String errorMessageForLocked = "Epic sadface: Sorry, this user has been locked out.";
    String errorMessageForInvalidUser = "Epic sadface: Username and password do not match any user in this service";
    String errorMessageForInvalidPassword = "Epic sadface: Username and password do not match any user in this service";
    String errorMessageForEmptyUser = "Epic sadface: Username is required";
    String errorMessageForEmptyPassword = "Epic sadface: Password is required";


    
    @Test
    public void loginTests() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

            
        loginPage.basePage();
        loginPage.login(validUsername, validPassword);
        homePage.verifyLogin(homePageTitle);
    }

      
    @Test
    public void LockedOutTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage(); 
        loginPage.login(lockedUsername, validPassword);
        loginPage.verifyUnsuccesfulLoginPage(errorMessageForLocked);
    }  
    @Test
        public void invalidUsername() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage(); 
        loginPage.login(invalidUsername, validPassword);
        loginPage.verifyUnsuccesfulLoginPage(errorMessageForInvalidUser);
               

    }
    @Test
        public void invalidPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage(); 
        loginPage.login(validUsername, invalidPassword);
        loginPage.verifyUnsuccesfulLoginPage(errorMessageForInvalidPassword);
    }
    @Test
        public void EmptyUserename() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage(); 
        loginPage.login("", validPassword);
        loginPage.verifyUnsuccesfulLoginPage(errorMessageForEmptyUser);

    }
    @Test
        public void EmptyPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage(); 
        loginPage.login(validUsername, "");
        loginPage.verifyUnsuccesfulLoginPage(errorMessageForEmptyPassword);
    }  
}   