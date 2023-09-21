package com.orangehrm.automationcore;

import com.orangehrm.constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;
    public FileInputStream fs;

    public Base()  {
        try{
            prop=new Properties();
            fs=new FileInputStream(System.getProperty("user.dir") + Constants.PROPERTYFILE_PATH);
            prop.load(fs);
        }catch (IOException e){
            throw new IllegalArgumentException("Given property file path not found" +e.getMessage());
        }
    }
    @Parameters({"browser"})
    @BeforeMethod
    public void setUp(String browser){
        String baseUrl=prop.getProperty("url");
        initialiseTest(browser);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void initialiseTest(String browser) {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Invalid browser received");
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(ITestResult.FAILURE== result.getStatus()){
            takeScreenshots(result);
        }
        driver.close();
    }
    public void takeScreenshots(ITestResult result) throws IOException {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File screenShots=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShots,new File("./Screenshots/"+result.getName()+".png"));
    }
}
