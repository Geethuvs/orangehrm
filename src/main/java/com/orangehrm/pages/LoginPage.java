package com.orangehrm.pages;

import com.orangehrm.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;

public class LoginPage extends TestHelperUtility {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public String getLoginPageTitle(){
        return webDriver.getTitleOfWebPage(driver);
    }

}
