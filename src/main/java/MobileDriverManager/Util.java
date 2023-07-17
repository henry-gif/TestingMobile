package MobileDriverManager;

import MobileDriverManager.MobileDriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Util {
    public Util() {
        PageFactory.initElements(new AppiumFieldDecorator(MobileDriverManager.getDriver(), Duration.ofSeconds(50)), this);
    }
}
