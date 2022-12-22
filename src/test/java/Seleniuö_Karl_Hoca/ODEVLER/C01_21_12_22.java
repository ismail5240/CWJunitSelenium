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

public class C01_21_12_22 {
/*
            - https://demoqa.com/select-menu sitesine gidin
            - Multiple select yapabileceginiz <select> elementini locate edin
            - Birden fazla secim yapip secimlerinizi DOGRULAyin


 */

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
        //driver.quit();
    }

    @Test
    public void multipleSelect() {


        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select multiselectMenu = new Select(dropdown);
        System.out.println("multiselectMenu.isMultiple() = " + multiselectMenu.isMultiple());

        multiselectMenu.selectByIndex(0);
        multiselectMenu.selectByValue("volvo");
        multiselectMenu.selectByVisibleText("Volvo");
        multiselectMenu.selectByIndex(2);
        multiselectMenu.selectByValue("opel");
        multiselectMenu.selectByVisibleText("Opel");

        multiselectMenu.getOptions().stream().forEach(t -> System.out.println(t.isSelected() ? t.getText() + " = is seleected" : t.getText() + "= is not selected"));


    }
    /*
          multiselectMenu.isMultiple() = true
          Volvo = is seleected
          Saab= is not selected
          Opel = is seleected
          Audi= is not selected
     */

}
