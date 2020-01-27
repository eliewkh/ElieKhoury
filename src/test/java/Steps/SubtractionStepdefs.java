package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class SubtractionStepdefs extends BaseTests {
    private Logger logger = Logger.getLogger(SubtractionStepdefs.class);
    @Before("@Sub.01, @Sub.02")
    public void AccessWebPageToSubstract(){
        logger.info("Entered AccessWebPageToSubstract");
        SetUPBeforeAll();
        logger.info("Exited AccessWebPageToSubstract");

    }

    @When("^I click on number nine$")
    public void iClickOnNumberNine() {
        logger.info("Entered iClickOnNumberNine");
        calculatorPage.moveToNumber9().click().build().perform();
        logger.info("Exited iClickOnNumberNine");
    }

    @And("^Click on the subtraction sign$")
    public void clickOnTheSubtractionSign() {
        logger.info("Entered clickOnTheSubtractionSign");
        calculatorPage.moveToSubtractSign().click().build().perform();
        logger.info("Exited clickOnTheSubtractionSign");
    }

    @And("^Click on the equal sign$")
    public void clickOnTheEqualSign() {
        logger.info("Entered clickOnTheEqualSign");
        calculatorPage.moveToEqualSign().click().build().perform();
        logger.info("Exited clickOnTheEqualSign");
    }

    @Then("^Compare the actual screenshot to the expected \"([^\"]*)\" sub screenshot$")
    public void compareTheActualScreenshotToTheExpectedSubScreenshot(String arg0) throws Throwable {
        logger.info("Entered compareTheActualScreenshotToTheExpectedSubScreenshot");
        Assert.assertFalse( "Test failed actual screenshot was not" +
                "matching the screenshot " + arg0, calculatorPage.shootWebElement(arg0)) ;
        logger.info("Exited compareTheActualScreenshotToTheExpectedSubScreenshot");
    }

    @After("@Sub.01, @Sub.02")
    public void Clear(){
        logger.info("Entered Clear");
        for(int i=0; i<2;i++)
        {
            calculatorPage.moveToCE().click().build().perform();
        }
        logger.info("Exited Clear");
    }

}
