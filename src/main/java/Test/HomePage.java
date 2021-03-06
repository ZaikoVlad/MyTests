package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by vlad on 01.05.17.
 */
public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void openGooglePage(String myUrl) {

        driver.get(myUrl);
        driver.manage().window().maximize();
    }

    @FindBy(xpath = "//h2[@class='section-title' and contains(text(), 'See all products')]")
    WebElement titleOfTheTable;
    @FindBy(xpath = "(//a[@class= 'lazy-img-loaded']//p)[1]")
    WebElement android;

    public void scrollToTableOfAllGoogleProducts() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleOfTheTable);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void getAllLinksAndClickOnIt() {
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='product-icon-list']//a"));
        for (WebElement element : elements) {


            element.click();
            long start = System.currentTimeMillis();
            element.getText();

            long finish = System.currentTimeMillis();
            long totalTime = finish - start;
            System.out.println(element.getText());
            System.out.println("Total Time for page load - " + totalTime);
        }
    }




    public void closePage() {
        driver.close();
    }
}

