package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    //elements
    By RegisterPage = By.className("ico-register");
    By MaleGender = By.className("male");
    By FemaleGender = By.className("female");
    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By DateOfBirthDay = By.name("DateOfBirthDay");
    By DateOfBirthMonth = By.name("DateOfBirthMonth");
    By DateOfBirthYear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");
    By ResultMessage = By.className("result");




    //actions
    public WebElement registerPage(){return Hooks.driver.findElement(RegisterPage);}
    public WebElement maleGender(){return Hooks.driver.findElement(MaleGender);}
    public WebElement femaleGender(){return Hooks.driver.findElement(FemaleGender);}
    public WebElement firstName(){return Hooks.driver.findElement(FirstName);}
    public WebElement lastName(){return Hooks.driver.findElement(LastName);}
    public WebElement dateOfBirthDay(){return Hooks.driver.findElement(DateOfBirthDay);}
    public WebElement dateOfBirthMonth(){return Hooks.driver.findElement(DateOfBirthMonth);}
    public WebElement dateOfBirthYear(){return Hooks.driver.findElement(DateOfBirthYear);}
    public WebElement email(){return Hooks.driver.findElement(Email);}
    public WebElement password(){return Hooks.driver.findElement(Password);}
    public WebElement confirmPassword(){return Hooks.driver.findElement(ConfirmPassword);}
    public WebElement registerButton(){return Hooks.driver.findElement(RegisterButton);}
    public WebElement resultMessage(){return Hooks.driver.findElement(ResultMessage);}


}
