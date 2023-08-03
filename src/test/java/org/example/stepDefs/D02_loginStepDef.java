package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    SoftAssert softAssert = new SoftAssert();
    @Given("user go to login page")
    public void userGotoLoginPage(){
        login.loginPage().click();
    }

    @When("user login with valid email {string}")
    public void userLoginWithValidEmail(String email) throws InterruptedException {
        login.emailField().sendKeys(email);
        Thread.sleep(3000);
    }

    @And("user login with valid password {string}")
    public void userLoginWithValidPassword(String password) {
        login.passwordField().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
    softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    softAssert.assertTrue(login.myAccount().isDisplayed());
    softAssert.assertAll();
    }

    @And("user login with invalid email {string}")
    public void userLoginWithInvalidEmail(String email) {
        login.emailField().sendKeys(email);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        softAssert.assertTrue(login.errorMsg().getText().contains("Login was unsuccessful."));
       String HexColor= Color.fromString(login.errorMsg().getCssValue("color")).asHex();
        System.out.println(HexColor);
        softAssert.assertEquals(HexColor,"#e4434b");
        softAssert.assertAll();
    }
}
