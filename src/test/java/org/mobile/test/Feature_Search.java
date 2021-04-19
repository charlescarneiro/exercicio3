package org.mobile.test;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;

public class Feature_Search
{

    @Test
    public void search_product() throws MalformedURLException, InterruptedException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement noLogin = (MobileElement)driver.driver.findElementById("br.com.petz:id/tv_start_without_login");
        noLogin.click();
        Thread.sleep(5000);

        MobileElement allow = (MobileElement)driver.driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
        allow.click();
        Thread.sleep(4000);

        MobileElement search = (MobileElement)driver.driver.findElementById("br.com.petz:id/menu_search");
        search.click();
        Thread.sleep(3000);

        MobileElement searchProd = (MobileElement)driver.driver.findElementById("br.com.petz:id/et_search");
        searchProd.sendKeys("raçao");
        Thread.sleep(2000);

        List<WebElement> items = driver.driver.findElementsById("br.com.petz:id/tv_suggestion");
        items.get(0).click();
        Thread.sleep(3000);

        assertTrue( true );
    }
}
