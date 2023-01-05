package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.walaastepDefinitions.Hooks.driver;

public class Walaa02_registration {
    public String registerPageURL() {
        return "https://demo.nopcommerce.com/register?returnUrl=%2F";
    }

    public String registerPageResultURL() {
        return "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
    }

    public WebElement femaleCheckBox() {
        By femaleCheckBox = By.id("gender-female");
        return driver.findElement(femaleCheckBox);
    }

    public WebElement firstNameTxtFld() {
        By firstNameTxtFld = By.id("FirstName");
        return driver.findElement(firstNameTxtFld);
    }

    public WebElement lastNameTxtFld() {
        By lastNameTxtFld = By.id("LastName");
        return driver.findElement(lastNameTxtFld);
    }

    public WebElement birthDayScrlPn() {
        By birthDayScrlPn = By.name("DateOfBirthDay");
        return driver.findElement(birthDayScrlPn);
    }

    public WebElement day1() {
        By day1 = By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"1\"]");
        return driver.findElement(day1);
    }

    public WebElement birthMonthScrlPn() {
        By birthMonthScrlPn = By.name("DateOfBirthMonth");
        return driver.findElement(birthMonthScrlPn);
    }

    public WebElement month10() {
        By month10 = By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"10\"]");
        return driver.findElement(month10);
    }

    public WebElement birthYearScrlPn() {
        By birthYearScrlPn = By.name("DateOfBirthYear");
        return driver.findElement(birthYearScrlPn);
    }

    public WebElement year1997() {
        By year1997 = By.cssSelector("option[value=\"1997\"]");
        return driver.findElement(year1997);
    }

    public WebElement emailAddressTxtFld() {
        By emailAddressTxtFld = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtFld);
    }

    public String registerEmail() {
        return "walaa.gamal30@yahoo.com";
    }

    public WebElement passwordTxtFld() {
        By passwordTxtFld = By.id("Password");
        return driver.findElement(passwordTxtFld);
    }

    public String registerPassword() {
        return "Walaa123";
    }

    public WebElement confirmPassTxtFld() {
        By confirmPassTxtFld = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtFld);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement registrationCompletedMsg() {
        By registrationCompletedMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(registrationCompletedMsg);
    }

    public WebElement passwordErrorMsg() {
        By passwordErrorMsg = By.id("Password-error");
        return driver.findElement(passwordErrorMsg);
    }

}
