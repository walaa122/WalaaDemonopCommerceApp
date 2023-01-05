package org.example.walaastepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.Walaa01_homePage;
import org.example.pages.walaa07_categories;
import org.testng.Assert;

public class Walaa06_categoriesStepDefinition {
    Walaa01_homePage home = new Walaa01_homePage();
    walaa07_categories categories = new walaa07_categories();

    @And("user press on Computers from homepage.")
    public void user_press_on_Computers_from_homepage() {
        home.computersCategory().click();
    }


    @And("user press on Desktops option.")
    public void user_press_on_Desktops_option() {
        home.desktopsSubCategory().click();
    }

    @Then("webpage redirects to Desktops subcategory.")
    public void webpage_redirects_to_Desktops_subcategory() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = categories.desktopsSubCategoryURL();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #10 (Categories) | Categories URL Redirect Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }

    // confirms the second option is visible of the available desktop computers.
    @And("webpage shows a Desktop computer.")
    public void webpage_shows_a_Desktop_computer() {
        String actualResult = categories.digitalStormPCProductTitle().getText();
        String expectedResult = "Digital Storm VANQUISH 3 Custom Performance PC";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("\n--- TS #9 (Categories) | Desktop Computer Shown Comparison: ---");
        System.out.println("** Actual Result = " + actualResult);
        System.out.println("** Expected Result = " + expectedResult);
    }
}
