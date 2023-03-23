package TestPackage;

import Pages.AddSingleProductPage;
import Pages.HomePage;
import Pages.LoginPage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTC extends TestBase{
    LoginPage loginObj;
    HomePage homePageObj;

    AddSingleProductPage AddProductObj;

    By MainCategoryDropDownList = By.xpath("//*[@id=\"vs3__combobox\"]/div[1]");


    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        loginObj = new LoginPage(driver);
        loginObj.LoginWithValidData();
        homePageObj = new HomePage(driver);
        homePageObj.clickOnAddProduct();
        AddProductObj = new AddSingleProductPage(driver);
        AddProductObj.addNewSingleProduct();
        Thread.sleep(1000);




    }
}