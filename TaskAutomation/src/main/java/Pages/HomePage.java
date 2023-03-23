package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage extends PageBase{


    public HomePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By ProfileIcon = By.xpath("//*[@id=\"top-header-main\"]/div/div/div[2]/div/div/div[2]/a/span");
    By AddProductBttn = By.xpath("//*[@id=\"top-header-main\"]/div/div/div[2]/div/div/div[2]/div/ul/li[5]/a");


    public void clickOnAddProduct(){
        driver.element().click(ProfileIcon)
                .click(AddProductBttn);

    }
}
