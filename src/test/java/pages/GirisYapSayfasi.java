package pages;

import org.openqa.selenium.WebDriver;
import pages.Sayfa;

public class GirisYapSayfasi extends Sayfa {
    public final String emailAdresi="txtUserName";
    public final String girisYapTusu="btnLogin";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
