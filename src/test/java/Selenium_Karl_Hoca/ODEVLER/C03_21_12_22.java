package Selenium_Karl_Hoca.ODEVLER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_21_12_22 {

    /*
           Go to URL: https://opensource-demo.orangehrmlive.com/
           Login with Username: Admin
           Login with Password: admin123
           Click login button
           Click on PIM
           Click on Employee List
           Employee Name -> Use Faker Class
           ID -> Use Faker Class
           Employment Status -> select by index: 2
           Include -> selectByVisibleText: Current and Past Employees
           Supervisor Name -> Use Faker Class
           Job Title ->selectByValue: IT Manager
           Sub Unit ->selectByValue: 3
           Click search button
           Verify text visible : "No Records Found"


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
