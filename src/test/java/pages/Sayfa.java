package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;
    public Sayfa(WebDriver driver){
        this.driver=driver;
    }
    public void elementGoruneneKadarBekle(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }
}
