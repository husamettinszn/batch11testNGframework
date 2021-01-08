package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D26_AmazonSatirSutunSayisi {

    @Test
    public void satirSayisi() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.enAltaGit();

        Assert.assertTrue(amazonPage.satirlarListesi.size()==10);


        Thread.sleep(10000);
        Driver.closeDriver();

    }
    @Test
    public void sutunSayisi(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.enAltaGit();

        System.out.println(amazonPage.birinciSatirElementleri.size());
        Assert.assertTrue(amazonPage.birinciSatirElementleri.size()==14);
        Driver.closeDriver();
    }
}
