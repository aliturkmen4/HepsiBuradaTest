import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTests {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void hepsiburadaLoginTesti() throws InterruptedException {

        driver.get("https://www.hepsiburada.com");

        WebElement cookies= driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
        cookies.click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='myAccount']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='login']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("aliturkmenn9@gmail.com", Keys.ENTER);

        Thread.sleep(2000);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
