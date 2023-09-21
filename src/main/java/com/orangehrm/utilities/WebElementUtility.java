package com.orangehrm.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class WebElementUtility {
    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String valueToEnter) {
        element.sendKeys(valueToEnter);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getTagHtmlTag(WebElement element) {
        return element.getTagName();
    }

    public boolean webElementDisplayedOrNot(WebElement element) {
        return element.isDisplayed();
    }

    public boolean webElementEnabledOrNot(WebElement element) {
        return element.isEnabled();
    }

    public boolean webElementSelectedOrNot(WebElement element) {
        return element.isSelected();
    }

    public void submitElement(WebElement element) {
        element.submit();
    }

    public Point locationOfWebElement(WebElement element) {
        return element.getLocation();
    }

    public Dimension sizeOfWebElement(WebElement element) {
        return element.getSize();
    }

    public String getCssValueOfWebElement(WebElement element, String cssValue) {
        return element.getCssValue(cssValue);
    }
    public void rightClickUsingXpath(WebElement element, WebDriver driver, String locator, Actions action){
        element= driver.findElement(By.xpath(locator));
        action=new Actions(driver);
        action.contextClick(element).build().perform();
    }
    public void doubleClickUsingXpath(WebElement element, WebDriver driver, String locator, Actions action){
        element= driver.findElement(By.xpath(locator));
        action=new Actions(driver);
        action.doubleClick(element).build().perform();
    }
    public void rightClickUsingId(WebElement element, WebDriver driver, String id, Actions action){
        element= driver.findElement(By.id(id));
        action=new Actions(driver);
        action.contextClick(element).build().perform();
    }
    public void doubleClickUsingId(WebElement element, WebDriver driver, String id, Actions action){
        element= driver.findElement(By.id(id));
        action=new Actions(driver);
        action.doubleClick(element).build().perform();
    }
    public void rightClickUSingCssSelector(WebElement element, WebDriver driver, String cssSelector, Actions action){
        element= driver.findElement(By.xpath(cssSelector));
        action=new Actions(driver);
        action.contextClick(element).build().perform();
    }
    public void doubleClickUsingCssSelector(WebElement element, WebDriver driver, String cssSelector, Actions action){
        element= driver.findElement(By.xpath(cssSelector));
        action=new Actions(driver);
        action.doubleClick(element).build().perform();
    }
    public void moveToElementUsingXpath(WebElement elementA,WebElement elementB,WebDriver driver,String xpathA,String xpathB,Actions action){
        elementA = driver.findElement(By.xpath(xpathA));
        elementB = driver.findElement(By.xpath(xpathB));
        action = new Actions(driver);
        action.moveToElement(elementA);
        action.clickAndHold();
        action.moveToElement(elementB);
        action.release().build().perform();
    }
    public void moveToElementUsingId(WebElement elementA,WebElement elementB,WebDriver driver,String idA,String idB,Actions action){
        elementA = driver.findElement(By.id(idA));
        elementB = driver.findElement(By.id(idB));
        action = new Actions(driver);
        action.moveToElement(elementA);
        action.clickAndHold();
        action.moveToElement(elementB);
        action.release().build().perform();
    }
    public void moveToElementUsingCssSelector(WebElement elementA,WebElement elementB,WebDriver driver,String cssSelectorA,String cssSelectorB,Actions action){
        elementA = driver.findElement(By.cssSelector(cssSelectorA));
        elementB = driver.findElement(By.cssSelector(cssSelectorB));
        action = new Actions(driver);
        action.moveToElement(elementA);
        action.clickAndHold();
        action.moveToElement(elementB);
        action.release().build().perform();
    }
    public void dragAndDropUsingId(WebDriver driver,WebElement elementA,WebElement elementB,Actions action,String idA,String idB){
        elementA = driver.findElement(By.id(idA));
        elementB = driver.findElement(By.id(idB));
        action = new Actions(driver);
        action.dragAndDrop(elementA,elementB).build().perform();
    }
    public void dragAndDropUsingXpath(WebDriver driver,WebElement elementA,WebElement elementB,Actions action,String xpathA,String xpathB){
        elementA = driver.findElement(By.xpath(xpathA));
        elementB = driver.findElement(By.xpath(xpathB));
        action = new Actions(driver);
        action.dragAndDrop(elementA,elementB).build().perform();
    }
    public void dragAndDropUsingCssSelector(WebDriver driver,WebElement elementA,WebElement elementB,Actions action,String cssSelectorA,String cssSelectorB){
        elementA = driver.findElement(By.cssSelector(cssSelectorA));
        elementB = driver.findElement(By.cssSelector(cssSelectorB));
        action = new Actions(driver);
        action.dragAndDrop(elementA,elementB).build().perform();
    }
    public void dragAndDropByOffsetUsingId(WebDriver driver,WebElement element,Actions action,String id,int a,int b){
        element = driver.findElement(By.id(id));
        action = new Actions(driver);
        action.dragAndDropBy(element,a,b).build().perform();
    }
    public void dragAndDropByOffsetUsingXpath(WebDriver driver,WebElement element,Actions action,String xpath,int a,int b){
        element = driver.findElement(By.xpath(xpath));
        action = new Actions(driver);
        action.dragAndDropBy(element,a,b).build().perform();
    }
    public void dragAndDropByOffsetUsingCssSelector(WebDriver driver,WebElement element,Actions action,String cssSelector,int a,int b){
        element = driver.findElement(By.cssSelector(cssSelector));
        action = new Actions(driver);
        action.dragAndDropBy(element,a,b).build().perform();
    }
}
