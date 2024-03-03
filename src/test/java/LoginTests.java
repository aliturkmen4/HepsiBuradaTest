import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5L)); //koşulların oluşması için bekleyeceğim süre

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myAccount"))); //bahsettiğim element oluşmuş mu kontrolü
        driver.findElement(By.xpath("//*[@id='myAccount']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='login']")));
        driver.findElement(By.xpath("//a[@id='login']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='txtUserName']")));
        driver.findElement(By.xpath("//*[@id='txtUserName']")).sendKeys("aliturkmenn9@gmail.com", Keys.ENTER);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
