package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class walaa07_categories {
    public String desktopsSubCategoryURL() {
        return "https://demo.nopcommerce.com/desktops";
    }
    public WebElement digitalStormPCProductTitle() {
        By digitalStormPCProductTitle = By.cssSelector("h2[class=\"product-title\"] > a[href=\"/digital-storm-vanquish-3-custom-performance-pc\"]");
        return driver.findElement(digitalStormPCProductTitle);
    }
    public WebElement shoesSubCategory() {
        By shoesSubCategory = By.cssSelector("li[class=\"inactive\"] > a[href=\"/shoes\"]");
        return driver.findElement(shoesSubCategory);
    }
    public WebElement shoesRedCheckBox() {
        By shoesRedCheckbox = By.cssSelector("li[class=\"item color-item\"] > input[id=\"attribute-option-15\"]");
        return driver.findElement(shoesRedCheckbox);
    }
    public WebElement adidasConsortiumCampus80sProduct() {
        By adidasConsortiumCampus80sProduct = By.cssSelector("h2[class=\"product-title\"] > [href=\"/adidas-consortium-campus-80s-running-shoes\"]");
        return driver.findElement(adidasConsortiumCampus80sProduct);

    }
    public WebElement awesomeTag() {
        By awesomeTag = By.cssSelector("a[href=\"/awesome\"]");
        return driver.findElement(awesomeTag);
    }
    public String awesomeTagURL() {
        return "https://demo.nopcommerce.com/awesome";
    }
    public WebElement tagsPageTitle() {
        By tagsPageTitle = By.cssSelector("div[class=\"page-title\"]:first-child");
        return driver.findElement(tagsPageTitle);
    }
    public WebElement coolTag() {
        By coolTag = By.cssSelector("a[href=\"/cool\"]");
        return driver.findElement(coolTag);
    }
    public String coolTagURL() {
        return "https://demo.nopcommerce.com/cool";
    }
    public WebElement digitalStormVanquish3_addToCartButton() {
        By digitalStormVanquish3_addToCartButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button");
        return driver.findElement(digitalStormVanquish3_addToCartButton);
    }
    public WebElement barNotification() {
        By barNotification = By.cssSelector("#bar-notification > div > p");
        return driver.findElement(barNotification);
    }
    public WebElement barNotification_closeButton() {
        By productAddedToCartMsg_closeButton = By.cssSelector("#bar-notification > div > span");
        return driver.findElement(productAddedToCartMsg_closeButton);
    }
    public WebElement lenovoIdeaCentre600_addToCartButton() {
        By lenovoIdeaCentre600_addToCartButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button");
        return driver.findElement(lenovoIdeaCentre600_addToCartButton);
    }
    public WebElement shoppingCart_header() {
        By shoppingCart_header =  By.cssSelector("a[href=\"/cart\"] > span[class=\"cart-label\"]");
        return driver.findElement(shoppingCart_header);
    }
    public WebElement digitalStormVanquish3_wishListButton() {
        By digitalStormVanquish3_WishListButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
        return driver.findElement(digitalStormVanquish3_WishListButton);
    }
    public WebElement lenovoIdeaCentre600_wishListButton() {
        By lenovoIdeaCentre600_wishListButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button");
        return driver.findElement(lenovoIdeaCentre600_wishListButton);
    }
    public WebElement wishList_headerLabel() {
        By wishList_headerLabel = By.cssSelector("span[class=\"wishlist-label\"]");
        return driver.findElement(wishList_headerLabel);
    }
    public WebElement digitalStormVanquish3_compareListButton() {
        By digitalStormVanquish3_compareListButton = By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button");
        return driver.findElement(digitalStormVanquish3_compareListButton);
    }

    public WebElement lenovoIdeaCentre600_compareListButton() {
        By lenovoIdeaCentre600_compareListButton = By.cssSelector("div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button");
        return driver.findElement(lenovoIdeaCentre600_compareListButton);
    }

    public WebElement productComparison_barNotification() {
        By productComparison_barNotification = By.cssSelector("#bar-notification > div > p > a");
        return driver.findElement(productComparison_barNotification);
    }

}
