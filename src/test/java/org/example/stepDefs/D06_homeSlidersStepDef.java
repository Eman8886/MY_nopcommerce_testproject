package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    @When("user click on first slider galaxy mobile")
    public void userClickOnFirstSliderGalaxyMobile(){
        homePage.HomeSlider().get(0).click();

}

    @Then("the page must move to galaxy mobile page and URL must be changed")
    public void thePageMustMoveToGalaxyMobilePageAndURLMustBeChanged() {
    wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/nokia-lumia-1020"));
    softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    softAssert.assertAll();
    }

    @When("user click on second slider iphone mobile")
    public void userClickOnSecondSliderIphoneMobile() {
        wait.until(ExpectedConditions.invisibilityOf(homePage.HomeSlider().get(1)));
        homePage.HomeSlider().get(1).click();
    }

    @Then("the page must move to iphone mobile page and URL must be changed")
    public void thePageMustMoveToIphoneMobilePageAndURLMustBeChanged() {
    softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
