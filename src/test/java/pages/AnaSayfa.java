package pages;

import org.openqa.selenium.WebDriver;
import pages.Sayfa;

public class AnaSayfa extends Sayfa {
    public final String hesabim="myAccount"; //final ile verdiğim string in farklı sınıflarda değiştirilmesi engellenir!
    public final String girisYap="login";
    public final String cookies="onetrust-accept-btn-handler";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
