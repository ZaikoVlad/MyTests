package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class NextPage {
    WebDriver driver;

    public NextPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        WebDriver driver1 = new ChromeDriver();
    }
}
