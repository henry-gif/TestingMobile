package MobileDriverManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileDriverManager {
    private static AppiumDriver<MobileElement> driver;
 public static  void  CrearDriver() throws MalformedURLException {
     DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
     desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
     desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
     desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
     desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 8");
     desiredCapabilities.setCapability(MobileCapabilityType.UDID,"fcfd16");
     desiredCapabilities.setCapability("appActivity","com.spotify.music.MainActivity");
     desiredCapabilities.setCapability("appPackage","com.spotify.music");
     desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
     driver =new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);

     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 public  static AppiumDriver getDriver(){
     return driver;
 }
 public static void StopApllication(){
     driver.quit();
 }

}
