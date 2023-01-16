package Selenium_Karl_Hoca.ODEVLER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_21_12_22 {

    /*

         Go to URL: https://the-internet.herokuapp.com/dropdown
         Create method selectByIndexTest and Select Option 1 using index .
         Create method selectByValueTest Select Option 2 by value.
         Create method selectByVisibleTextTest Select Option 1 value by visible text.
         Create method printAllTest Print all dropdown value.
         Verify the dropdown has Option 2 text.
         Create method printFirstSelectedOptionTest Print first selected option.
         Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

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
