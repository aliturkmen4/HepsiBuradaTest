package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AnaSayfa;
import pages.GirisYapSayfasi;

import java.time.Duration;

public class LoginTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;

    @BeforeEach
    public void setUp() throws Exception {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa=new AnaSayfa(driver);
        girisYapSayfasi=new GirisYapSayfasi(driver);
        driver.get("https://www.hepsiburada.com");
    }


    @Test
    public void hepsiburadaLoginTesti() throws InterruptedException {

        anaSayfa.elementGoruneneKadarBekle(anaSayfa.hesabim);
        anaSayfa.butonaTikla(anaSayfa.hesabim);

        anaSayfa.elementGoruneneKadarBekle(anaSayfa.girisYap);
        anaSayfa.butonaTikla(anaSayfa.girisYap);

        girisYapSayfasi.elementGoruneneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailAdresi,"aliturkenn9@gmail.com");

        girisYapSayfasi.elementGoruneneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.butonaTikla(girisYapSayfasi.girisYapTusu);
    }

    @Test()
    public void hepsiburadaUrunAramaTesti() throws InterruptedException {

        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.urunArama);
        anaSayfa.alanaYaziYazCss(anaSayfa.urunArama, "Araba");
        anaSayfa.klavyeTusunaBas(anaSayfa.urunArama, Keys.ENTER);
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }
}
