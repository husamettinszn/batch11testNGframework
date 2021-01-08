package com.techproed.smokeTest;

import com.techproed.pages.CrystalhotelPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class PositiveTestPOM extends TestBase {

    @Test
    public void test(){
        driver.get(ConfigReader.getProperty("c_url"));

        CrystalhotelPage crystalhotelPage = new CrystalhotelPage(driver);

        crystalhotelPage.login.click();

        crystalhotelPage.username.sendKeys(ConfigReader.getProperty("valid_user"));

        crystalhotelPage.password.sendKeys(ConfigReader.getProperty("valid_password"));

        crystalhotelPage.loginOnay.click();
    }
}
