package com.orangehrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WebDriverUtility {
    public String getWindowHandleId(WebDriver driver) {
        return driver.getWindowHandle();
    }

    public Set<String> getWindowHandleIds(WebDriver driver) {
        return driver.getWindowHandles();
    }

    public void switchToWindow(WebDriver driver, String handleId) {
        driver.switchTo().window(handleId);
    }

    public void getUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    public void maximiseBrowserWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void deleteAllCookiesAvailable(WebDriver driver) {
        driver.manage().deleteAllCookies();
    }

    public String getTitleOfWebPage(WebDriver driver) {
        return driver.getTitle();
    }

    public String getCurrentUrlOfWebPage(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public String getSourceCodeOfWebPage(WebDriver driver) {
        return driver.getPageSource();
    }

    public WebElement findWebElementById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement findWebElementByXpath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findWebElementByCssSelector(WebDriver driver, String cssSelector) {
        return driver.findElement(By.id(cssSelector));
    }

    public List<WebElement> findWebElementsById(WebDriver driver, String id) {
        return driver.findElements(By.id(id));
    }

    public List<WebElement> findWebElementsByXpath(WebDriver driver, String xpath) {
        return driver.findElements(By.id(xpath));
    }

    public List<WebElement> findWebElementsByCssSelector(WebDriver driver, String cssSelector) {
        return driver.findElements(By.id(cssSelector));
    }

    public void closeTheWebPage(WebDriver driver) {
        driver.close();
    }

    public void closeAllWebPages(WebDriver driver) {
        driver.quit();
    }

    public void navigateToUrl(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public void navigateForward(WebDriver driver) {
        driver.navigate().forward();
    }

    public void navigateBackward(WebDriver driver) {
        driver.navigate().back();
    }

    public void refreshWebPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public void switchToFrameIndex(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }

    public void switchToFrameByNameOrId(WebDriver driver, String id) {
        driver.switchTo().frame(id);
    }

    public void switchToFrameByWebElement(WebDriver driver, WebElement element) {
        driver.switchTo().frame(element);
    }
}
