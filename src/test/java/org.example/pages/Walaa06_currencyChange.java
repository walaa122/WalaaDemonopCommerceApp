package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa06_currencyChange {
    public WebElement currencyChangeList() {
        By currencyChangeList = By.cssSelector("select[id=\"customerCurrency\"]");
        return driver.findElement(currencyChangeList);
    }

    public WebElement euroCurrency() {
        By euroCurrency = By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fsearch%3Fq%3DLenovo\"]");
        return driver.findElement(euroCurrency);
    }

    public WebElement lenovoIdeaCentre600Price() {
        By lenovoIdeaCentre600Price = By.cssSelector("div:nth-child(1) > div > div.details > div.add-info > div.prices > span");
        return driver.findElement(lenovoIdeaCentre600Price);
    }

    public WebElement lenovoIdeaCentre600USDCurrencyChange() {
        By lenovoIdeaCentre600USDCurrencyChange = By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fsearch%3Fq%3DLenovo\"]");
        return driver.findElement(lenovoIdeaCentre600USDCurrencyChange);

    }
}
