package org.mobile.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverConfig {
    public final AppiumDriver driver;

    public AppiumDriverConfig() throws MalformedURLException {
        File apk = new File("C:\\Users\\charles.carneiro\\Documents\\seleçao\\mobile_test\\src\\main\\resources\\Petz.apk");
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
        config.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        config.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL urlConnection = new URL( "http:127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<>(urlConnection, config);

    }

}
