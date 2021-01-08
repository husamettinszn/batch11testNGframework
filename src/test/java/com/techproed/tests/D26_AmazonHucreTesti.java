package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D26_AmazonHucreTesti {

    @Test
    public void hucreTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.enAltaGit();

        String hucreYazisi = amazonPage.hucreYazisiGetir(3,7);
        //System.out.println(hucreYazisi);

        Assert.assertTrue(hucreYazisi.contains(ConfigReader.getProperty("aranan_hucre")));
    }
    @Test
    public void amazonYazisi(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.enAltaGit();

        int kelimeSayaci=0;

        for(int i=1; i<=amazonPage.satirlarListesi.size(); i+=2){
            for (int j=1; j<=amazonPage.birinciSatirElementleri.size(); j+=2){
                if(amazonPage.hucreYazisiGetir(i, j).contains(ConfigReader.getProperty("aranan_kelime"))){
                    kelimeSayaci++;

                }
            }
        }
        System.out.println(kelimeSayaci);

        Driver.closeDriver();
    }
}
