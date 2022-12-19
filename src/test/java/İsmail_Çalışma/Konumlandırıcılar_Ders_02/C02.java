package İsmail_Çalışma.Konumlandırıcılar_Ders_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {


/*  link text-->Baglantı metni
    partial link text-->kısmi bağlantı metni
    css selector



 */


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://login.yahoo.com/");
        driver.manage().window().maximize();


        Thread.sleep(2000);

        //link text-->Baglantı metni

       // driver.findElement(By.linkText("Kullanıcı adınızı mı unuttunuz?")).click();--->Tamamı ile


        //partial link text-->kısmi bağlantı metni
        driver.findElement(By.partialLinkText("Kullanıcı")).click();//-->Birkısmı ile


        Thread.sleep(2000);
        driver.findElement(By.className("phone-no")).sendKeys("itopdas@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.name("verifyYid")).click();


    }
}