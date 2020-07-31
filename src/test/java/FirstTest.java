import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() {

        driver.get("http://krzysztofgobis.pl/");
        WebElement linkTest = driver.findElement(By.xpath("//*[@id=\"container\"]/article/a"));
        linkTest.click();

        WebElement linkTest1 = driver.findElement(By.xpath("/html/body/a"));
        linkTest1.click();

        WebElement number1 = driver.findElement(By.id("num1"));
        number1.sendKeys("5");
        WebElement number2 = driver.findElement(By.id("num2"));
        number2.sendKeys("18");

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"sum\"]/button"));
        btn.click();

        int parseInt = Integer.parseInt(driver.findElement(By.id("displayvalue")).getText());
        Assert.assertEquals(parseInt, 18);

    }

}