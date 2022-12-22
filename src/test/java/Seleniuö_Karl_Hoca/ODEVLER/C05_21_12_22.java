package Seleniuö_Karl_Hoca.ODEVLER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_21_12_22 {

/*
           Launch the browser.
           Open "https://demoqa.com/select-menu".
           Select the Standard Multi-Select using the element id.
           Verifying that the element is multi-select.
           Select 'Opel' using the index and deselect the same using index.
           Select 'Saab' using value and deselect the same using value.
           Deselect all the options.
           Close the browser.


 */
WebDriver driver;

    @Before
    public void setup(){
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //driver.quit();
    }

    @Test
    public void basicAuth() {

        // https:// USERNAME : PASSWORD @ URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }

}
