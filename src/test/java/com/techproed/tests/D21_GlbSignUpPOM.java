package com.techproed.tests;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class D21_GlbSignUpPOM extends TestBase {

   @Test
   public void test(){
      driver.get("https://www.glbtrader.com/register.html");

      driver.findElement(By.linkText("Sign In")).click();
      WebElement userNameBox = driver.findElement(By.id("email"));
      userNameBox.sendKeys("husamettin@gmail");

      WebElement passWordBox= driver.findElement(By.id("password"));
      passWordBox.sendKeys("hs123", Keys.ENTER);

      driver.findElement(By.className("btn btn-lg btn-warning btn-blockbtn btn-lg btn-warning btn-block")).click();
   }
   @Test
   public void test2(){
      driver.get("https://www.glbtrader.com/register.html");

      GlbSignUpPage glbSignUpPage = new GlbSignUpPage(driver);

      glbSignUpPage.signIn.click();

      glbSignUpPage.userTextBox.sendKeys("husamettin@gmail");

      glbSignUpPage.passwordTextBox.sendKeys("hs123");

      glbSignUpPage.login.click();



   }

}