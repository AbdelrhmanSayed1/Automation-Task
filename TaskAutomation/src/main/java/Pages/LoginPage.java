package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(SHAFT.GUI.WebDriver driver){
        super(driver);
        this.driver = this.driver;
    }

    public String ValidUser = "tester@task.com";
    public String ValidPass = "11111111";


    By emailField = By.id("email");
    By passwordField = By.id("password");
    By loginbttn = By.xpath("//*[@id=\"app\"]/section[1]/div/form/div[4]/div/button");


    public void LoginWithValidData() {
        driver.element().type(emailField,ValidUser)
                .type(passwordField,ValidPass)
                .click(loginbttn);


    }
}
