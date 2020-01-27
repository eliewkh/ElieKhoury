package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class CEStepdefs extends BaseTests{
    private Logger logger = Logger.getLogger(CEStepdefs.class);

    @Before("@CE.01, @CE.02")
    public void AccessWebPageToTestClear(){
        logger.info("Entered AccessWebPageToTestClear");
        SetUPBeforeAll();
        logger.info("Exited AccessWebPageToTestClear");
    }

    @When("^I click the number nine$")
    public void iClickTheNumberNine() {
        logger.info("Entered iClickTheNumberNine");
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited iClickTheNumberNine");
    }

    @And("^Click on division sign$")
    public void clickOnDivisionSign() {
        logger.info("Entered clickOnDivisionSign");
        calculatorPage.moveToDivisionSign().click().build().perform();
        logger.info("Exited clickOnDivisionSign");
    }

    @And("^Click zero$")
    public void clickZero() {
        logger.info("Entered clickZero");
        calculatorPage.moveToZero().click().build().perform();
        logger.info("Exited clickZero");
    }

    @And("^Clear$")
    public void clear() {
        logger.info("Entered clear");
        calculatorPage.moveToCE().click().build().perform();
        logger.info("Exited clear");
    }

    @And("^Click on equal$")
    public void clickOnEqual() {
        logger.info("Entered clickOnEqual");
        calculatorPage.moveToEqualSign().click().build().perform();
        logger.info("Exited clickOnEqual");

    }

    @Then("^Compare the actual screenshot to the expected \"([^\"]*)\" CE screenshot$")
    public void compareTheActualScreenshotToTheExpectedCEScreenshot(String arg0) throws Throwable {
        logger.info("Entered compareTheActualScreenshotToTheExpectedCEScreenshot");
        Assert.assertFalse( "Test failed actual screenshot was not" +
                "matching the screenshot " + arg0, calculatorPage.shootWebElement(arg0)) ;
        logger.info("Exited compareTheActualScreenshotToTheExpectedCEScreenshot");
    }

    @And("^I click the number eight$")
    public void iClickTheNumberEight() {
        logger.info("Entered iClickTheNumberEight");
        calculatorPage.moveToNumber8().click().build().perform();
        logger.info("Exited iClickTheNumberEight");
    }

    @When("^I click the minus nine$")
    public void iClickTheMinusNine() {
        logger.info("Entered iClickTheMinusNine");
        calculatorPage.moveToSubtractSign().click().build().perform();
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited iClickTheMinusNine");
    }

    @After("@CE.01, @CE.02")
    public void Clear(){
        logger.info("Entered Clear");
        for(int i=0; i<2;i++)
        {
            calculatorPage.moveToCE().click().build().perform();
        }
        logger.info("Exited Clear");
    }
}
