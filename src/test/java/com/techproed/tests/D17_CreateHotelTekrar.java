package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;

public class D17_CreateHotelTekrar extends TestBase {

    @Test
    public void createHotel(){
        //1. Tests packagenin altına class olusturun: D17_CreateHotel
        //2. Bir metod olusturun: createHotel
        //3. https://www.qa-environment.crystalkeyhotels.com adresine git.
        driver.get("http://qa-environment.crystalkeyhotels.com");
        driver.findElement(By.linkText("Log in")).click();
        WebElement usernameTextBox = driver.findElement(By.id("UserName"));
        usernameTextBox.sendKeys("manager");

        WebElement passwordTextBox = driver.findElement(By.id("Password"));
        passwordTextBox.sendKeys("Manager2!");
        driver.findElement(By.id("btnSubmit")).click();

        driver.findElement(By.xpath("//*[text()='Hotel Management']")).click();
        driver.findElement(By.partialLinkText("Hotel List")).click();
    }

}
