package Selenium_Karl_Hoca.ODEVLER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_21_12_22 {


    /*
           Go to URL: http://demo.automationtesting.in/Alerts.html
           Click "Alert with OK" and click 'click the button to display an alert box:’
           Accept Alert(I am an alert box!) and print alert on console.
           Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
           Cancel Alert  (Press a Button !)
           Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
           And then sendKeys «BootcampCamp» (Please enter your name)
           Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.

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
