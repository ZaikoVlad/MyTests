package Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple Test.
 */
public class GoogleTest {
    WebDriver driver;
    HomePage homePage;

    private String googlePage = "https://www.google.com/intl/en/about/products/";


    @org.junit.Test
    public void myTest(){
        System.setProperty("webdriver.chrome.driver","/home/vlad/chromedriver/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.openGooglePage(googlePage);
        homePage.scrollToTableOfAllGoogleProducts();
        homePage.getAllLinksAndClickOnIt();
    }
}
