package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;

public class PageBase {
    protected SHAFT.GUI.WebDriver driver;

    public PageBase(SHAFT.GUI.WebDriver driver){

        this.driver = driver;


    }


}
