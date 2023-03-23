package Pages;

import com.shaft.driver.SHAFT;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddSingleProductPage extends PageBase{
    public AddSingleProductPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By NextBttn = By.xpath("//*[@id=\"step-1\"]/div/div[3]/div/button");

    By AuctionNameField = By.xpath("/html/body/div/div[4]/div/div/div/section/div/form/div/div[2]/span/div[2]/div[3]/div/span[2]/input");

    By MainCategoryDropDownList = By.xpath("//*[@id=\"vs3__combobox\"]/div[1]");
    By Selection1 = By.xpath("//*[@id=\"vs3__combobox\"]/div[1]/input");

    By SubCategoryDropDownList = By.xpath("//*[@id=\"vs4__combobox\"]/div[1]/input");

    By QuantityField =By.name("quantity");

    By Heading = By.xpath("//*[@id=\"mceu_9\"]/button[1]");
    By description = By.xpath("//*[@id=\"tinymce\"]/ol/li");




    public void addNewSingleProduct() throws InterruptedException {
        driver.element().click(NextBttn)
                .click(AuctionNameField)
                .type(AuctionNameField,"AuctionNameText")
                .click(MainCategoryDropDownList)
                .keyPress(Selection1, Keys.ARROW_DOWN)
                .keyPress(Selection1, Keys.ARROW_DOWN)
                .keyPress(Selection1, Keys.ENTER)
                .click(SubCategoryDropDownList)
                .keyPress(SubCategoryDropDownList, Keys.ARROW_DOWN)
                .keyPress(SubCategoryDropDownList, Keys.ENTER)
                .click(Heading)
                .click(MainCategoryDropDownList);







               /* .click(MainCategoryDropDownList)
                .click(Selection)
                .select(MainCategoryDropDownList,"CARS , MOTORCYCLES & ACCESSORIES")
                .select(SubCategoryDropDownList,"Domain")
                .type(QuantityField,"1")
                .select(CountryDropDownList,"Syria")
                .select(StateDropDownList,"Al-Golan")
                .select(CityDropDownlist,"Al-Golan");*/




    }
}
