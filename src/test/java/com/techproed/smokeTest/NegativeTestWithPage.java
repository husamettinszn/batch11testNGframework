package com.techproed.smokeTest;

import com.techproed.pages.CrystalhotelPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class NegativeTestWithPage extends TestBase {

    @Test
    public void test(){
        driver.get("http://qa-environment.crystalkeyhotels.com");

        CrystalhotelPage crystalhotelPage = new CrystalhotelPage(driver );

        crystalhotelPage.login.click();

        crystalhotelPage.username.sendKeys("husamettin");

        crystalhotelPage.password.sendKeys("hs123");

        crystalhotelPage.loginOnay.click();

    }
}
