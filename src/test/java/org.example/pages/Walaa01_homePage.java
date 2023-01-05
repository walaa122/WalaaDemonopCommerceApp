package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa01_homePage {
    public String homepageURL() {
        return "https://demo.nopcommerce.com/";

    }

    public WebElement searchTxtFld() {
        By searchTxtFld = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");
        return driver.findElement(searchTxtFld);
    }

    public WebElement searchButton() {
        By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return driver.findElement(searchButton);
    }

    public WebElement computersCategory() {
        By computersCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > [href=\"/computers\"]");
        return driver.findElement(computersCategory);
    }

    public WebElement desktopsSubCategory() {
        By desktopsSubCategory = By.cssSelector("ul[class=\"sublist\"] > li[class=\"inactive\"] > [href=\"/desktops\"]");
        return driver.findElement(desktopsSubCategory);
    }

    public WebElement apparelCategory() {
        By apparelCategory = By.cssSelector("ul[class=\"top-menu notmobile\"] > li > a[href=\"/apparel\"]");
        return driver.findElement(apparelCategory);
    }


}
