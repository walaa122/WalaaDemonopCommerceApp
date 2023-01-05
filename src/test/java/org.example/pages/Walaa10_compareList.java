package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa10_compareList {
    public String compareProductsURL() {
        return "https://demo.nopcommerce.com/compareproducts";
    }

    public WebElement digitalStormVanquish3_textLabel() {
        By digitalStormVanquish3_textLabel = By.cssSelector("tr.product-name > td:nth-child(2) > a");
        return driver.findElement(digitalStormVanquish3_textLabel);
    }

    public WebElement lenovoIdeaCentre600_textLabel() {
        By lenovoIdeaCentre600_textLabel = By.cssSelector("tr.product-name > td:nth-child(3) > a");
        return driver.findElement(lenovoIdeaCentre600_textLabel);
    }
}
