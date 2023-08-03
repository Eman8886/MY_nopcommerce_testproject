package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
    @When("user click on wishlist button on the product")
    public void userClickOnWishlistButtonOnTheProduct(){
         homePage.wishlistButton().get(2).click();
    }

    @Then("the success msg will be shown")
    public void theSuccessMsgWillBeShown() {
        softAssert.assertTrue(homePage.wishlistSuccessmsg().isDisplayed());
        String HexMsgColor = Color.fromString(homePage.wishlistSuccessmsg().getCssValue("background-color")).asHex();
        System.out.println("color is" + HexMsgColor);
        softAssert.assertTrue(HexMsgColor.contains("#4bb07a"));
        softAssert.assertAll();
    }

    @And("wait success msg to disappear click on Wishlist Tab on the top of the page")
    public void waitSuccessMsgToDisappear() {
        wait.until(ExpectedConditions.invisibilityOf(homePage.wishlistSuccessmsg()));
        homePage.wishlistTab().click();
    }

    @And("get Qty value")
    public void getQtyValue() {
        homePage.wishlistQytValue().getAttribute("value");
        System.out.println("Qty value is " +homePage.wishlistQytValue().getAttribute("value"));
    }

    @Then("Qty value must be it's bigger than zero")
    public void qtyValueMustBeItSBiggerThan() {
        softAssert.assertNotEquals(homePage.wishlistQytValue().getAttribute("value"),"0");
    }
}
