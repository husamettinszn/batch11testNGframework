package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class D18_WebTablesTekrar extends TestBase {
    //● http://qa-environment.crystalkeyhotels.com/admin/HotelRoomAdmin adresine gidin
    // ○ Username : manager
    // ○ Password : Manager2!
    public void login(){
        driver.get("http://qa-environment.crystalkeyhotels.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager");
        driver.findElement(By.id("Password")).sendKeys("Manager2!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test
    public void a(){
        login();
        WebElement tumBasliklar = driver.findElement(By.xpath("//tbody"));
        System.out.println(tumBasliklar.getText());


    }
}
