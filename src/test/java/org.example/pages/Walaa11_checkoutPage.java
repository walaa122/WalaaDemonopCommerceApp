package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa11_checkoutPage {
    public String checkoutPageURL() {
        return "https://demo.nopcommerce.com/onepagecheckout#opc-billing";
    }
    public WebElement countryList() {
        By countryList = By.cssSelector("select[data-trigger=\"country-select\"]");
        return driver.findElement(countryList);
    }
    public WebElement country_Egypt() {
        By country_Egypt = By.cssSelector("option[value=\"123\"]");
        return driver.findElement(country_Egypt);
    }
    public WebElement city_textBox() {
        By city_TextBox = By.cssSelector("#BillingNewAddress_City");
        return driver.findElement(city_TextBox);
    }
    public WebElement address1_textBox() {
        By address1_TextBox = By.cssSelector("#BillingNewAddress_Address1");
        return driver.findElement(address1_TextBox);
    }
    public WebElement zipOrPostal_textBox() {
        By zipOrPostal_TextBox = By.cssSelector("#BillingNewAddress_ZipPostalCode");
        return driver.findElement(zipOrPostal_TextBox);
    }
    public WebElement phoneNumber_textBox() {
        By phoneNumber_textBox = By.cssSelector("#BillingNewAddress_PhoneNumber");
        return driver.findElement(phoneNumber_textBox);
    }
    public WebElement shippingAddress_continueButton() {
        By shippingAddress_continueButton = By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button");
        return driver.findElement(shippingAddress_continueButton);
    }
    public WebElement shippingMethod_continueButton() {
        By shippingMethod_continueButton = By.cssSelector("#shipping-method-buttons-container > button");
        return driver.findElement(shippingMethod_continueButton);
    }
    public WebElement paymentMethod_continueButton() {
        By paymentMethod_continueButton = By.cssSelector("#payment-method-buttons-container > button");
        return driver.findElement(paymentMethod_continueButton);
    }
    public WebElement paymentInfo_continueButton() {
        By paymentInfo_continueButton = By.cssSelector("#payment-info-buttons-container > button");
        return driver.findElement(paymentInfo_continueButton);
    }
    public WebElement confirmOrder_Button() {
        By confirmOrder_Button = By.cssSelector("#confirm-order-buttons-container > button");
        return driver.findElement(confirmOrder_Button);
    }
    public String checkoutCompletedURL() {
        return "https://demo.nopcommerce.com/checkout/completed";
    }
    public WebElement orderProceededSuccess_title() {
        By orderProceededSuccess_title = By.cssSelector("div.page-body.checkout-data > div > div.title > strong");
        return driver.findElement(orderProceededSuccess_title);
    }
}
