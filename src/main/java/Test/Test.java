package Test;

import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 */
public class Test {
    WebDriver driver;
    public HomePage homePage;
    public NextPage nextPage;

    public Test(WebDriver webDriver){
        this.driver = webDriver;
        homePage = new HomePage(driver);
        nextPage = new NextPage(driver);
    }
}
