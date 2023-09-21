package com.orangehrm.utilities;

import com.orangehrm.constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.orangehrm.constants.Constants.FLUENT_POLLING_TIME;
import static com.orangehrm.constants.Constants.FLUENT_WAIT_TIME;

public class WaitUtility {
    public void waitForVisibilityOfWebElement(WebDriver driver, WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForVisibilityOfElementLocatedByXpath(WebDriver driver, String locator){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void waitForVisibilityOfElementLocatedById(WebDriver driver, String locator){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }
    public void waitForVisibilityOfElementLocatedByCssSelector(WebDriver driver, String locator){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }
    public void waitForAlertToBePresent(WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void fluentWaitForVisibilityOfWebElement(WebDriver driver,WebElement element){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIME));
        wait.pollingEvery(Duration.ofSeconds(FLUENT_POLLING_TIME));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public void fluentWaitForVisibilityOfWebElementLocatedByXpath(WebDriver driver,String locator){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIME));
        wait.pollingEvery(Duration.ofSeconds(FLUENT_POLLING_TIME));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void fluentWaitForVisibilityOfWebElementLocatedById(WebDriver driver,String locator){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIME));
        wait.pollingEvery(Duration.ofSeconds(FLUENT_POLLING_TIME));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
    }
    public void fluentWaitForVisibilityOfWebElementLocatedByCssSelector(WebDriver driver,String locator){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIME));
        wait.pollingEvery(Duration.ofSeconds(FLUENT_POLLING_TIME));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }
    public void fluentWaitForAlertToBePresent(WebDriver driver){
        FluentWait wait= new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIME));
        wait.pollingEvery(Duration.ofSeconds(FLUENT_POLLING_TIME));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
