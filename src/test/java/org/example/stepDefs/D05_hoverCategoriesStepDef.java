package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();
    Actions actions = new Actions(Hooks.driver);


@When("user  select hover on one of the main categories and click on one of the three sub categories")
public void userSelectHoverOnOneOfTheMainCategoriesAndClickOnOneOfTheThreeSubCategories() {
    actions.moveToElement(homePage.mainMenuItems().get(0)).perform();
    String SelectedSubCategory = homePage.subMenuItem().get(0).getText().toLowerCase();
    System.out.println(SelectedSubCategory);
    homePage.subMenuItem().get(0).click();
}
@Then("the page title must be equal selected sub category title")
public void thePageTitleMustBeEqualSelectedSubCategoryTitle (){
    String PageTitle = homePage.pageTitle().getText().toLowerCase();
    System.out.println(PageTitle);
    Assert.assertEquals(PageTitle,"desktops");
}



}
