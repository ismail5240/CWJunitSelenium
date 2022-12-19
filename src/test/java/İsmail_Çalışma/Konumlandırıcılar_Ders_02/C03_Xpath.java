package İsmail_Çalışma.Konumlandırıcılar_Ders_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Xpath {

           /*

           Xpath,daha spesifik olup dinamik ögeleri rahatlıkla bulmamızı saglar
           Basic xpath=//tagname[@attribute='value'-----> //etiket adı[@nitelik='deger']

           1.Absolute Xpath
           /html[1]/body[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]

           2.Relative Xpath
           //input[@name='q']

           3.Contains (ait olmak)
           Dinamik degişikliklerin olabilecegi durumlarda;
           Xpath//*[contains(@type,'sub')]---->//etiket adı[contains(@nitelik,'deger')]
           * işareti tüm HTML kodlarını kapsar(Tümü)

           4.Starts-With()
           Aramalarımızda uzun kodları daha kolay bulmamızı saglar.

           5.OR,AND
           OR için iki kısımdan birtanesinin dogru olması yeterli
           AND için iki tarafında dogru olması gerekiyor

            */


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr/b?ie=UTF8&node=20467303031");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='nav-line-2']")).click();

    }

}