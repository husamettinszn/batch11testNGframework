package com.techproed.smokeTest;

import com.techproed.pages.CrystalhotelPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositiveTestWithPage extends TestBase {

    @Test
    public void test(){
        driver.get("http://qa-environment.crystalkeyhotels.com");
        driver.findElement(By.linkText("Log in")).click();

        WebElement userTextBox = driver.findElement(By.id("UserName"));
        userTextBox.sendKeys("manager");

        WebElement passwordTextBox= driver.findElement(By.id("Password"));
        passwordTextBox.sendKeys("Manager2!");

        driver.findElement(By.id("btnSubmit")).click();
    }
    @Test
    public void test2(){

        driver.get("http://qa-environment.crystalkeyhotels.com");

        CrystalhotelPage crystalhotelPage = new CrystalhotelPage(driver);

        crystalhotelPage.login.click();

        crystalhotelPage.username.sendKeys("manager");

        crystalhotelPage.password.sendKeys("Manger2!");

        crystalhotelPage.loginOnay.click();
    }
}
