package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("Select Euro currency from the dropdown list on the top left of home page")
    public void SelectEuroCurrencyFromTheDropdownListonTheTopLeftofHomePage(){
        Select currenciesDropDown = new Select(homePage.currenciesDropDown());
        currenciesDropDown.selectByIndex(1);
    }

    @Then("Euro Symbol \\(€) is shown on the products displayed in Home page")
    public void euroSymbol€IsShownOnTheProductsDisplayedInHomePage() {
        int NofProducts = homePage.productPrice().size();
        for (int i =0 ; i <NofProducts ; i++ ){
            String NameOfProduct = homePage.productPrice().get(i).getText();
            System.out.println(NameOfProduct);
            Assert.assertTrue(NameOfProduct.contains("€"));
        }
    }
}
