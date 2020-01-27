package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class DivisionStepdefs extends BaseTests {
    private Logger logger = Logger.getLogger(DivisionStepdefs.class);

    @Before("@Div.01, @Div.02, @Div.03")
    public void AccessWebPageToDivide(){
        logger.info("Entered AccessWebPageToDivide");
        SetUPBeforeAll();
        logger.info("Exited AccessWebPageToDivide");
    }

    @When("^I click on the number nine$")
    public void iClickOnTheNumberNine() {
        logger.info("Entered iClickOnTheNumberNine");
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited iClickOnTheNumberNine");
    }

    @And("^Click on the division sign$")
    public void clickOnTheDivisionSign() {
        logger.info("Entered clickOnTheDivisionSign");
        calculatorPage.moveToDivisionSign().click().build().perform();
        logger.info("Exited clickOnTheDivisionSign");
    }


    @And("^Click on zero$")
    public void clickOnZero() {
        logger.info("Entered clickOnZero");
        calculatorPage.moveToZero().click().build().perform();
        logger.info("Exited clickOnTheDivisionSign");
    }

    @And("^Click the equal sign$")
    public void clickTheEqualSign() {
        logger.info("Entered clickTheEqualSign");
        calculatorPage.moveToEqualSign().click().build().perform();
        logger.info("Exited clickTheEqualSign");
    }

    @Then("^Compare the actual screenshot to the expected \"([^\"]*)\" div screenshot$")
    public void compareTheActualScreenshotToTheExpectedDivScreenshot(String arg0) throws Throwable {
        logger.info("Entered compareTheActualScreenshotToTheExpectedDivScreenshot");
        Assert.assertFalse( "Test failed actual screenshot was not" +
                "matching the screenshot " + arg0, calculatorPage.shootWebElement(arg0)) ;
        logger.info("Exited compareTheActualScreenshotToTheExpectedDivScreenshot");
    }

    @When("^I click on the substract sign$")
    public void iClickOnTheSubstractSign() {
        logger.info("Entered iClickOnTheSubstractSign");
        calculatorPage.moveToSubtractSign().click().build().perform();
        logger.info("Exited iClickOnTheSubstractSign");
    }

    @After("@Div.01, @Div.02, @Div.03")
    public void Clear(){
        logger.info("Entered Clear");
        for(int i=0; i<2;i++)
        {
            calculatorPage.moveToCE().click().build().perform();
        }
        logger.info("Exited Clear");

    }
}
