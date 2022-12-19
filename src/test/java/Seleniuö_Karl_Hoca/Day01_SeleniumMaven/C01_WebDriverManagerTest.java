package Seleniuö_Karl_Hoca.Day01_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_WebDriverManagerTest {

    // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.

    public static void main(String[] args) {

// webdrivermaneger  clasını kullanarak chromedriwer binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();

      //driver objemizi olusturduk
        WebDriver driver = new ChromeDriver();

       //windov u maximize ettik
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        String title = driver.getTitle();

        //title imizi dogruladık
        if (title.equalsIgnoreCase("google")){
            System.out.println("Test passed");
        }else {
            System.out.println("Test FAILED");
        }
        // Driver İMIZI KAPATTIK

        driver.quit();
    }
}
