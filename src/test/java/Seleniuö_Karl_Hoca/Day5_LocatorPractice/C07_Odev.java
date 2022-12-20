package Seleniuö_Karl_Hoca.Day5_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Odev {

    //Go to URL: https://demoqa.com/radio-button
  //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
 //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.


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
    public void radioButton() {

        driver.get("https://demoqa.com/radio-button");


        WebElement yesRadio= driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement noRadio= driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        WebElement impressive= driver.findElement(By.xpath("//label[@for='noRadio']"));

        yesRadio.click();
        noRadio.click();
       impressive.click();

        Assert.assertTrue(!yesRadio.isSelected());
        Assert.assertFalse(noRadio.isSelected());
        Assert.assertTrue(!impressive.isSelected());

        System.out.println(yesRadio.getText());
        System.out.println(noRadio.getText());
        System.out.println(impressive.getText());

    }


}
