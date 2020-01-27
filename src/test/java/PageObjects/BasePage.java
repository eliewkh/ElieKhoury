package PageObjects;

import Steps.AdditionsStepdefs;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private Logger logger = Logger.getLogger(BasePage.class);
    protected WebDriverWait wait;
    protected WebDriver browser;

    public BasePage(WebDriver browser) {
        logger.info("Entered constructor BasePage");
        this.browser = browser;
        wait= new WebDriverWait(browser, 120);
        PageFactory.initElements(browser, this);
        logger.info("Exited constructor BasePage");
    }
    protected Actions moveTo(WebElement webElement, int xOffset, int yOffset ) {
        Actions action = new Actions(browser);
        Actions move = action.moveToElement(webElement, xOffset, yOffset);
        return move;
    }
}
