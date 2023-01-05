package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa08_shoppingCart {
    public String shoppingCartURL() {
        return "https://demo.nopcommerce.com/cart";
    }
    public WebElement firstProductLabel() {
        By firstProductLabel = By.cssSelector("tr:nth-child(1) > td.product > a");
        return driver.findElement(firstProductLabel);
    }
    public WebElement firstProduct_RemoveButton() {
        By firstProduct_RemoveButton = By.cssSelector("tbody > tr:nth-child(1) > td.remove-from-cart > button");
        return driver.findElement(firstProduct_RemoveButton);
    }
    public WebElement secondProductLabel() {
        By secondProductLabel = By.cssSelector("tr:nth-child(2) > td.product > a");
        return driver.findElement(secondProductLabel);
    }
    public WebElement firstProductQuantity() {
        By firstProductQuantity = By.cssSelector("td[class=\"quantity\"] > input:nth-child(2)");
        return driver.findElement(firstProductQuantity);
    }
    public WebElement updateCartButton() {
        By updateCartButton = By.cssSelector("#updatecart");
        return driver.findElement(updateCartButton);
    }
    public WebElement firstProduct_SubTotalLabel() {
        By firstProduct_SubTotalLabel = By.cssSelector(".product-subtotal");
        return driver.findElement(firstProduct_SubTotalLabel);
    }
    public WebElement cartTotalLabel() {
        By cartTotalLabel = By.cssSelector("span > strong");
        return driver.findElement(cartTotalLabel);
    }
    public WebElement termsOfService_checkbox() {
        By termsOfService_checkbox = By.cssSelector("input[id=\"termsofservice\"]");
        return driver.findElement(termsOfService_checkbox);
    }
    public WebElement checkout_Button() {
        By checkout_Button = By.cssSelector("button[id=\"checkout\"]");
        return driver.findElement(checkout_Button);
    }


}
