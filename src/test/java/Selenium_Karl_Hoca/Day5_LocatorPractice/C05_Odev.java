package Selenium_Karl_Hoca.Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Odev {


    //    Go to URL: https://demoqa.com/
    //    Click on Elements.
    //    Click on Checkbox.
    //    Verify if Home checkbox is selected.
    //    Verify that "You have selected" is visible.


    WebDriver driver;

    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //  driver.quit();
    }

    @Test
    public void elements() {
        driver.get("https://demoqa.com/");

        WebElement elements= driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        elements.click();

        WebElement checkbox= driver.findElement(By.xpath("(//span[@class='text'])[2]"));
        checkbox.click();

        WebElement verify=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        verify.click();

    }
}