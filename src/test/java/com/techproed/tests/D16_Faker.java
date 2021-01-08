package com.techproed.tests;

import com.github.javafaker.Faker;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class D16_Faker extends TestBase {

    @Test
    public void test(){

        Faker faker = new Faker();
        System.out.println(faker.internet().password());
    }
    @Test
    public void facebookUserTest() throws InterruptedException {
        /*
        1."https://facebook.com" Adresine gidin
        2.“create new account” butonuna basin
        3.“firstName” giris kutusuna bir isim yazin
        4.“surname” giris kutusuna bir soyisim yazin
        5.“email” giris kutusuna bir email yazin
        6.“email” onay kutusuna emaili tekrar yazin
        7.Bir sifre girin
        8.Tarih icin gun secin
        9.Tarih icin ay secin
        10.Tarih icin yil secin
        11.Cinsiyeti secin
        12.Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        13.Sayfayi kapatin
         */
        driver.get("https://facebook.com");
        driver.findElement(By.id("u_0_h")).click();
        driver.findElement(By.id("u_0_2")).click();

        WebElement isimBox = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);
        Faker faker = new Faker();

        String email = faker.internet().emailAddress();

        actions.click(isimBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .perform();

        WebElement gunDropDown= driver.findElement(By.name("birthday_month"));

        Select select = new Select(gunDropDown);
        select.selectByValue("8");

        WebElement ayDropDown = driver.findElement(By.name("birthday_day"));

        Select select1 = new Select(ayDropDown);
        select1.selectByValue("6");

        WebElement yilDropDown = driver.findElement(By.name("birthday_year"));

        Select select2 = new Select(yilDropDown);
        select2.selectByVisibleText("1977");

        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
        driver.findElement(By.name("websubmit")).click();






        Thread.sleep(10000);
    }

}
