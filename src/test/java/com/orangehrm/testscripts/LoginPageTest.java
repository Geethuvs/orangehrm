package com.orangehrm.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangehrm.automationcore.Base;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.reports.TestListener;
import com.orangehrm.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base {
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();
    @Test(groups = {"Smoke"})
    public void verifyLoginPageTitle() {
        extentTest.get().assignCategory("Smoke");
        LoginPage login = new LoginPage(driver);
        String actualTitle=login.getLoginPageTitle();
        extentTest.get().log(Status.PASS,"Login page title received as "+actualTitle);
        List<List<String>> data= ExcelUtility.excelDataReader("LoginPage");
        String expectedTitle=data.get(0).get(1);
        Assert.assertEquals(actualTitle,expectedTitle,"Title not matching");
        extentTest.get().log(Status.PASS,"Expected login page title"+expectedTitle+" Matched with actual title "+actualTitle);
    }
}
