package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    By LoginPage = By.className("ico-login");
    By EmailField = By.id("Email");
    By PasswordField = By.id("Password");
    By LoginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
    By MyAccount = By.className("ico-account");
    By ErrorMsg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

    public WebElement loginPage(){return Hooks.driver.findElement(LoginPage);}
    public WebElement emailField(){return Hooks.driver.findElement(EmailField);}
    public WebElement passwordField(){return Hooks.driver.findElement(PasswordField);}
    public WebElement loginButton(){return Hooks.driver.findElement(LoginButton);}
    public WebElement myAccount(){return Hooks.driver.findElement(MyAccount);}
    public WebElement errorMsg(){return Hooks.driver.findElement(ErrorMsg);}



}
