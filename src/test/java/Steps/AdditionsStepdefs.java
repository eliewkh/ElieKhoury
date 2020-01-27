package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class AdditionsStepdefs extends BaseTests {
    private Logger logger = Logger.getLogger(AdditionsStepdefs.class);

    @Before("@Add.01, @Add.02")
    public void AccessWebPageForAddition(){
        logger.info("Entered AccessWebPageForAddition");
        SetUPBeforeAll();
        logger.info("Exited AccessWebPageForAddition");
    }

    @When("^I click on a number$")
    public void iClickOnANumber() {
        logger.info("Entered iClickOnANumber");
        Actions action = new Actions(browser);
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited iClickOnANumber");
    }

    @And("^Click on th addition sign$")
    public void clickOnThAdditionSign() {
        logger.info("Entered clickOnThAdditionSign");
        calculatorPage.moveToAddSign().click().build().perform();
        logger.info("Exited clickOnThAdditionSign");
    }

    @And("^Click on a second number$")
    public void clickOnASecondNumber() {
        logger.info("Entered clickOnASecondNumber");
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited clickOnASecondNumber");
    }

    @And("^Click on equal sign$")
    public void clickOnEqualSign() {
        logger.info("Entered clickOnEqualSign");
        calculatorPage.moveToEqualSign().click().build().perform();
        logger.info("Exited clickOnEqualSign");
    }

    @When("^I click on nine nine times$")
    public void iClickOnNineNineTimes() {
        logger.info("Entered iClickOnNineNineTimes");
        for (int i=0; i<9; i++)
        {
            calculatorPage.moveToNumber9().click().build().perform();
        }
        logger.info("Exited iClickOnNineNineTimes");
    }

    @Then("^Compare the actual screenshot to the expected \"([^\"]*)\" add screenshot$")
    public void compareTheActualScreenshotToTheExpectedAddScreenshot(String arg0) throws Throwable {
        logger.info("Entered compareTheActualScreenshotToTheExpectedAddScreenshot");
        Assert.assertFalse( "Test failed actual screenshot was not" +
                "matching the screenshot " + arg0, calculatorPage.shootWebElement(arg0)) ;
        logger.info("Exited compareTheActualScreenshotToTheExpectedAddScreenshot");
    }

    @After("@Add.01, @Add.02")
    public void Clear(){
        logger.info("Entered Clear");
        for(int i=0; i<2;i++)
        {
            calculatorPage.moveToCE().click().build().perform();
        }
        logger.info("Exited Clear");
    }

}
