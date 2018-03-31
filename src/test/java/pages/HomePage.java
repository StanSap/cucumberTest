package pages;

import helpers.WaitTool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static glue.steps.Browser.driver;

/**
 * Created by Progres on 24.3.2018 г..
 */
public class HomePage {
    public void verifyAllButons() {
        WaitTool waitTool = new WaitTool();
        WebElement Btn1 = waitTool.waitForElement(driver, By.xpath("//*[@id=\"menu-item-2912\"]/a"), 10);
        String firstStep = Btn1.getText();
        Assert.assertEquals("Начало \n първа стъпка", firstStep);

        WebElement Btn2 = waitTool.waitForElement(driver, By.className("sf-with-ul"), 10);
        String whoWeAre = Btn2.getText();
        Assert.assertEquals("За нас \n Кои сме ние", whoWeAre);

        WebElement Btn3 = waitTool.waitForElement(driver, By.xpath("//*[@id=\"menu-item-5671\"]/a"), 10);
        String whatWeOffer = Btn3.getText();
        Assert.assertEquals("Програми \n Какво предлагаме", whatWeOffer);
    }
}
