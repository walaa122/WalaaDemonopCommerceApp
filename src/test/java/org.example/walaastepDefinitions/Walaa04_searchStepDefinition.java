package org.example.walaastepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.Walaa01_homePage;
import org.example.pages.Walaa05_search;
import org.testng.Assert;

public class Walaa04_searchStepDefinition {
    Walaa01_homePage home = new Walaa01_homePage();
    Walaa05_search search = new Walaa05_search();

    @And("user uses the search text field and enters lenovo.")
    public void user_users_the_search_text_field_and_enters_lenovo() {
        home.searchTxtFld().sendKeys("Lenovo");
    }

    @Then("user clicks on the search button.")
    public void user_clicks_on_the_search_button() {
        home.searchButton().click();
    }


    @And("user redirected to a search webpage with the text entered.")
    public void user_redirected_to_a_search_webpage_with_the_textEntered() {
        String actualURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=Lenovo";
        Assert.assertTrue(actualURL.contains(expectedURL));
        System.out.println("\n--- TS #7 (Search) | Keyword Searching URL Comparison: ---");
        System.out.println("** Actual URL = " + actualURL);
        System.out.println("** Expected URL = " + expectedURL);
        String actualDisplayedOption = search.lenovoIdeaCentre600Ele().getText();
        String expectedDisplayedOption = "Lenovo";
        Assert.assertTrue(actualDisplayedOption.contains(expectedDisplayedOption));
        System.out.println("\n--- TS #7 (Search) | Displayed Option Comparison: ---");
        System.out.println("** Actual Displayed Option = " + actualDisplayedOption);
        System.out.println("** Expected Displayed Option = " + expectedDisplayedOption);
    }
}
