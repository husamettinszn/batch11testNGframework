package com.techproed.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbSignUpPage {

    WebDriver driver;  //instance yaptik,classin heryerinden ulasilabilsin

    public GlbSignUpPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);

    }
    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(id="email") // = driver.findElement();
    public WebElement userTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(className = "btn btn-lg btn-warning btn-blockbtn btn-lg btn-warning btn-block")
    public WebElement login;

}
