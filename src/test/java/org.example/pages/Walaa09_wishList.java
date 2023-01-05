package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa09_wishList {
    public String wishListURL() {
        return "https://demo.nopcommerce.com/wishlist";
    }
    public WebElement digitalStormVanquish3_productTxtLabel() {
        By digitalStormVanquish3_wishList_productTxtLabel = By.cssSelector("td[class=\"product\"] > a[href=\"/digital-storm-vanquish-3-custom-performance-pc\"]");
        return driver.findElement(digitalStormVanquish3_wishList_productTxtLabel);
    }
    public WebElement lenovoIdeaCentre600_productTxtLabel() {
        By lenovoIdeaCentre600_productTxtLabel = By.cssSelector("td[class=\"product\"] > a[href=\"/lenovo-ideacentre-600-all-in-one-pc\"]");
        return driver.findElement(lenovoIdeaCentre600_productTxtLabel);
    }
    public WebElement digitalStormVanquish3_wishListRemoveButton() {
        By digitalStormVanquish3_wishListRemoveButton = By.cssSelector("tr:nth-child(1) > td.remove-from-cart > button");
        return driver.findElement(digitalStormVanquish3_wishListRemoveButton);
    }
}
