package pages;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler;


public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);

    }
    By headerTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");
    By numberOfItemsBy = By.xpath("//*[@class='inventory_item']");
    int expectedNumberOfProducts = 6;


    public HomePage verifyLogin(String expectedText){
        String pageTitle = readText(headerTitleBy);
        assertStringEquals(pageTitle, expectedText);
        return this;
    }
    public HomePage validateNumberOfProducts(int expectedNumberOfProduct){
        int actualNumberOfProducts = locateElements(numberOfItemsBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
    public HomePage veryfyTitles(){
        Object click;
        readText(elementBy)

    }public HomePage verifyNavigation(){
        click(getElementBy());

    }
    public HomePage openMenu(){
        click elementBy (Name);
        
        readText(getElementBy name);
    }
    public HomePage verifyMenuTitles(){\}
        String assertIntegerEquals(String expectedItem , String actualItem)
        readText
        Assert.assertEquals(expectedItem, actualItem)

