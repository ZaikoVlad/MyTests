package Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
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
    public void myTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/vlad/chromedriver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

        homePage = new HomePage(driver);
        homePage.openGooglePage(googlePage);
        driver.manage().window().maximize();
        homePage.scrollToTableOfAllGoogleProducts();
        homePage.getAllLinksAndClickOnIt();
    }

    @After
    public void close(){
        homePage.closePage();
    }
}
