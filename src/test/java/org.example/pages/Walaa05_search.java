package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa05_search {
    public WebElement lenovoIdeaCentre600Ele() {
        By lenovoIdeaCentre600 = By.cssSelector("h2[class=\"product-title\"] > a[href=\"/lenovo-ideacentre-600-all-in-one-pc\"]");
        return driver.findElement(lenovoIdeaCentre600);
    }
}
