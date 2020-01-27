package PageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.comparison.PointsMarkupPolicy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CalculatorPage extends BasePage {
    private WebElement calculatorCanvas;
    public CalculatorPage (WebDriver browser)
    {
        super (browser);
        PageFactory.initElements(browser, this);
        WebElement iframe = browser.findElement(By.id("fullframe"));
        browser.switchTo().frame(iframe);
        calculatorCanvas = browser.findElement(By.id("canvas"));

    }

    public Actions moveToNumber9(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2 - 40 ,
                200);
    }

    public Actions moveToNumber8(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2 - 100 ,
                200);
    }

    public Actions moveToAddSign(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2,
                400);
    }

    public Actions moveToZero(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2 - 200,
                400);
    }

    public Actions moveToCE(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2  + 100, 150);
    }
    public Actions moveToSubtractSign(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2,
                350);
    }
    public Actions moveToDivisionSign(){
        return moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2,
                200);
    }

    public Actions moveToEqualSign(){
        return  moveTo(calculatorCanvas, calculatorCanvas.getLocation().getX()/2 + 100 ,
                400);
    }

    /**
     * This function compares the actual screenshot of the calcculator canvas to the expected one
     * in the resources package
     * @param fileName
     * @return
     * @throws IOException
     */
    public boolean shootWebElement(String fileName) throws IOException {
        File take = ((TakesScreenshot) browser).getScreenshotAs(OutputType.FILE);

        Point p = calculatorCanvas.getLocation();

        int width = calculatorCanvas.getSize().getWidth();
        int height = calculatorCanvas.getSize().getHeight();

        BufferedImage browserActualImg = ImageIO.read(take);
        BufferedImage canvasCalcuatorActualImg = browserActualImg.getSubimage(p.getX(), p.getY(), width, height);

        ImageIO.write(canvasCalcuatorActualImg, "png", take);

        File expectedFileImage = new File("src/main/resources/"+ fileName);

        BufferedImage expectedImage = ImageIO.read(expectedFileImage);
        return compareTowImages(expectedImage, canvasCalcuatorActualImg);
    }


    private boolean compareTowImages(BufferedImage expectedImage, BufferedImage actualImage) {
        ImageDiffer imageDiffer = new ImageDiffer();
        ImageDiff diff = imageDiffer
                .withDiffMarkupPolicy(new PointsMarkupPolicy()
                        .withDiffColor(Color.YELLOW))
                .withIgnoredColor(Color.MAGENTA)
                .makeDiff(expectedImage, actualImage);
       return diff.hasDiff();

    }
}
