package com.orangehrm.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class PageUtility {
    public void selectValue(List<WebElement> dropdownValue, String valueToSelect){
        for(int i=0;i< dropdownValue.size();i++){
            String value=dropdownValue.get(i).getText();
            if(value.equals(valueToSelect)){
                dropdownValue.get(i).click();
                break;
            }
        }
    }
}
