package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D12_AllertsTesti {

        WebDriver driver;
        @BeforeClass
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }
        @Test
        public void acceptAllert() throws InterruptedException {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            String sonucYazisi = driver.findElement(By.id("result")).getText();

            Assert.assertEquals(sonucYazisi, "You successfuly clicked an alert");

        }
        @Test
        public void dismissAllert() throws InterruptedException {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
            Thread.sleep(3000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(3000);

            String sonucYazisi = driver.findElement(By.id("result")).getText();



        }
        @AfterClass
        public void tearDown(){
            //driver.close();
    }

}
