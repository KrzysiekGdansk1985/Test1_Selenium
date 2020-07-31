import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.out.println("Before test");
        String driverPath = "C:\\Users\\Krzysztof\\Desktop\\Test31072020_1\\src\\main\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        System.out.println("After test");
        driver.quit();
    }

}