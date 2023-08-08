package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")
    public void goRegisterPage()
    {
     register.registerPage().click();
    }


    @When("user select gender type")
    public void userSelectGenderType() {
        register.femaleGender().click();
    }

    @And("user enter first name {string}")
    public void userEnterFirstName(String firstName) {
        register.firstName().sendKeys(firstName);
    }

    @And("user enter last name {string}")
    public void userEnterLastName(String lastName) {
        register.lastName().sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select Day = new Select(register.dateOfBirthDay());
        Day.selectByValue("11");
        Select Month = new Select(register.dateOfBirthMonth());
        Month.selectByValue("8");
        Select Year = new Select(register.dateOfBirthYear());
        Year.selectByValue("1998");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        register.email().sendKeys(email);
    }

    @And("user fills Password field {string}")
    public void userFillsPasswordField(String Password) {
        register.password().sendKeys(Password);
    }

    @And("user fills Confirm Password field {string}")
    public void userFillsConfirmPasswordField(String ConfirmPassword) {
        register.confirmPassword().sendKeys(ConfirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        softAssert.assertEquals(register.resultMessage().getText(),"Your registration completed");
        System.out.println("color is" + register.resultMessage().getCssValue("color"));
        softAssert.assertTrue(register.resultMessage().getCssValue("color").contains("(76, 177, 124, 1)"));
        softAssert.assertAll();
    }
}
