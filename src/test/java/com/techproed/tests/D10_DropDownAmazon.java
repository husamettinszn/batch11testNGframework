package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
● https://www.amazon.com/ adresine gidin.
        - Test 1
        Arama kutusunun yanindaki kategori menusundeki kategori sayisinin  45 oldugunu test edin
        -Test 2
        1. Kategori menusunden Books secenegini  secin
        2. Arama kutusuna Java yazin ve aratin
        3. Bulunan sonuc sayisini yazdirin
        4. Sonucun Java kelimesini icerdigini test edin

 */

public class D10_DropDownAmazon {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void sayfayaGit(){
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void test01(){
        WebElement dropDown = driver.findElement(By.xpath("twotabsearchtextbox"))  ;
        Select select = new Select(dropDown);

        List<WebElement> tumListe = select.getOptions();

        int kategoriSayisi = tumListe.size()-1;
        Assert.assertEquals(kategoriSayisi,45);

    }
    @Test
    public void javaTest(){
        WebElement dropDown = driver.findElement(By.xpath("twotabsearchtextbox")) ;
        Select select = new Select(dropDown);
        select.selectByVisibleText("Books");


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java" + Keys.ENTER);

        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@class='"));
    }


    @AfterClass
    public void tearDown(){
       // driver.close();
    }
}
