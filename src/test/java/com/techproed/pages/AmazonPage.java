package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {
    /*
    Soru 1 :
ØAmazon anasayfaya gidebilecek sekilde bir page sayfasi olusturun : AmazonPage
ØAmazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin AmazonPage clasinda en altta gitme isini yapacak bir method olusturun
ØTests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi
ØBu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu test edin
ØYeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu

ØAmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda bana hucredeki yaziyi getirecek bir method olusturun
ØTests paketi altinda yeni bir class olusturun: D26_AmazonHucreTesti
ØBu class’in altinda bir test method olusturun : hucretesti() ve webtable’da 3. satir 2.sutundaki yazinin “Home Services” yazisi icerdigini test edin
ØYeni bir method olusturun : AmazonYazisi() ve tabloda 9 Hucrede “Amazon” yazisi bulundugunu test edin
     */

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "tr")
    public List<WebElement> satirlarListesi;

    @FindBy(xpath = "//tr[1]//td")
    public List<WebElement> birinciSatirElementleri;

    public void enAltaGit(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }
    public String hucreYazisiGetir(int satir, int sutun){

        //  /tr[5]//td[5] mesela

        String hucreXpath = "//tr["+satir+"]//td["+sutun+"]";

        String hucredekiYazi= Driver.getDriver().findElement(By.xpath(hucreXpath)).getText();
        return hucredekiYazi;



    }

}
