package Steps;
import PageObjects.CalculatorPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private Logger logger = Logger.getLogger(BaseTests.class);
    public WebDriver browser;
    private static boolean dunit = false;
    protected static CalculatorPage calculatorPage;
    //For login: only open browser and set the url, filling the paassword and the username should be befopre each feature
    protected void SetUPBeforeAll() {
        logger.info("Entered SetUPBeforeAll");
            if(!dunit)
            {
                //ChromeOptions options = new ChromeOptions();

                //Chrome driver
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

                //Create a Chrome driver. All test and page classes use this driver.
                browser = new ChromeDriver();

                //Implicitly wait
                browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                //Delete all cookies
                browser.manage().deleteAllCookies();

                //Maximize Window
                browser.manage().window().maximize();

                browser.get("https://www.online-calculator.com/full-screen-calculator/");
                calculatorPage= new CalculatorPage(browser);
                dunit = true;
            }
        logger.info("Exited SetUPBeforeAll");
    }
}