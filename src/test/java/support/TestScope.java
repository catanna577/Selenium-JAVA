package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.OptionalDataException;

public class TestScope {

    private static WebDriver driver = null;

    private static WebElement element = null;

    public static WebDriver getWebDriver() {

        return driver;

    }

    public static void initialize() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    public static void tearDownTest() {

        driver.close();
        driver.quit();
    }

    public static void navigateUrl(String url) {

        getWebDriver().navigate().to(url);

    }

    public static WebElement elementWithXpath(String path) {

        element = driver.findElement(By.xpath(path));
        return element;

    }

    public static void inputWord(String guess) throws InterruptedException {

        char[] arr = guess.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            elementWithXpath("//body").sendKeys(Character.toString(arr[i]));
            Thread.sleep(200);
        }

        elementWithXpath("//body").sendKeys(Keys.RETURN);

    }

}
