package tests;

import java.net.PasswordAuthentication;

import org.junit.Test;
import org.openqa.selenium.UsernameAndPassword;

import pages.HomePage;

public class HomePageTests extends BaseTest{
    public loginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;

    String standardUsername = "standard_user";
    
    @Test
    public void checkNumberOfItemsOnHomePage(){

    loginPage = new loginPage()(driver);
    homePage = new HomePage(driver);

    
    int expectedNumberOfProduct;
    int numberOfAllItems;
    homePage.validateNumberOfProducts(numberOfAllItems);
  
}

}
    

