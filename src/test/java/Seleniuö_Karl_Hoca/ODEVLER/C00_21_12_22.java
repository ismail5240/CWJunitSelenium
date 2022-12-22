package Seleniuö_Karl_Hoca.ODEVLER;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C00_21_12_22 {
/*
            - https://demoqa.com/select-menu sitesine gidin
            - <select> elementini locate edin
            - <select> elementinin seceneklerini yazdirin
            - Sirasiyla selectByIndex, selectByValue, selectByVisibleText methodlarini kullanarak;
            * Yellow (index)
            * Purple (value)
            * Black  (text)
            seceneklerini secin

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
    public void SelectMethods() {

        driver.get("https://demoqa.com/select-menu");

        WebElement select=driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]"));

        Select select1=new Select(select);
        select1.selectByIndex(3);
        select1.selectByValue("4");
        select1.selectByVisibleText("Black");

    }
}
