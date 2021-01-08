package com.techproed.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CrystalhotelPage {

    WebDriver driver;

    public CrystalhotelPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);
    }
   @FindBy(linkText = "Log in")
   public WebElement login;

    @FindBy(id = "UserName")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement loginOnay;


}
