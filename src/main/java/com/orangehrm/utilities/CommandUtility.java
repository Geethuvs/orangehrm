package com.orangehrm.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CommandUtility {
    public void switchToAlert(WebDriver driver, Alert alert) {
        driver.switchTo().alert();
    }

    public void acceptAlert(Alert alert) {
        alert.accept();
    }

    public void dismissAlert(Alert alert) {
        alert.dismiss();
    }

    public String getTextAlert(Alert alert) {
        return alert.getText();
    }

    public void sendValuesAlert(Alert alert, String valueToPass) {
        alert.sendKeys(valueToPass);
    }

    public void selectFromDropdownUsingText(Select select, String dropdownValueToSelect) {
        select.selectByVisibleText(dropdownValueToSelect);
    }

    public void selectFromDropdownUsingValueAttribute(Select select, String dropdownValueToSelect) {
        select.selectByValue(dropdownValueToSelect);
    }

    public void selectFromDropdownUsingIndex(Select select, int index) {
        select.selectByIndex(index);
    }

    public List<WebElement> getAllDropdownValue(Select select) {
        return select.getOptions();
    }

    public boolean multiSelect(Select select) {
        return select.isMultiple();
    }
}
