package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    Actions actions = new Actions(Hooks.driver);

    @When("user  select random one of the main categories and hover on it")
    public void userSelectRandomOneOfTheMainCategoriesAndHoverOnIt() {
        int Count = homePage.mainMenuItems().size();
        int min = 0 ;
        int max = Count - 1;
        int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Selected item is " + homePage.mainMenuItems().get(selectedCategory).getText());
        actions.moveToElement(homePage.mainMenuItems().get(selectedCategory)).perform();
    }

    @And("select random one of the three sub categories")
    public void selectRandomOneOfTheThreeSubCategories() {

    }

    @And("Click on selected category")
    public void clickOnSelectedCategory() {
    }

    @Then("the page title must be equal selected sub category title")
    public void thePageTitleMustBeEqualSelectedSubCategoryTitle() {
    }




}
