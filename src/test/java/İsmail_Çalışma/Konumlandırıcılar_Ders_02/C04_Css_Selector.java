package İsmail_Çalışma.Konumlandırıcılar_Ders_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C04_Css_Selector {


    public static void main(String[] args) {

      //  System.setProperty("webdriver.gecko.driver");


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://www.google.com");



    }
}
