package İsmail_Çalışma.Konumlandırıcılar_Ders_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {


    /* name
       class name
       ıd


     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();

        // -->name
        driver.findElement(By.name("q")).sendKeys("java");

        Thread.sleep(2000);

        //-->class name
        driver.findElement(By.className("gNO89b")).click();

        //-->ıd
        Thread.sleep(2000);
        driver.findElement(By.id("dimg_9")).click();




    }
}