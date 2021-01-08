package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D09_Priority {
    /*
    1) Bir class oluşturun: YoutubeAssertions
    2) https://www.youtube.com adresine gidin
    3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri  yapin
        ○ titleTest  => Sayfa başlığının “YouTube” oldugunu test edin
        ○ imageTest  => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        ○ wrongTitleTest=> Sayfa basliginin “youtube” olmadigini dogrulayin
     */

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void titelTest() {
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitel = "YouTube";
        Assert.assertEquals(actualTitle, expectedTitel);
    }

    @Test
    public void imageTest() {
        driver.get("https://youtube.com");
        driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope yt-button-renderer style-text size-small']")).click();
        driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();

    }


    @AfterClass
    public void tearDown() {
        //driver.close();
    }
}
