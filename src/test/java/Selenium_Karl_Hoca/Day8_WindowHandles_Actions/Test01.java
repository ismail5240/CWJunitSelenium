package Selenium_Karl_Hoca.Day8_WindowHandles_Actions;

public class Test01 {


     /*
    1- https://www.amazon.com/ sayfasına gidelim.
    2- Arama kutusunu locate edelim.
    3- "Samsung headphones" ile arama yapalım.
    4- Bulunan sonuç sayısını yazdıralım.
    5- İlk ürünü tıklayalım.
    6- Sayfadaki tüm ürün başlıklarını yazdıralım.
 *


     driver.get("https://www.amazon.com/");

    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung headphones" + Keys.ENTER);

    WebElement result = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("Result: " + result.getText());

    WebElement firstProduct = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        firstProduct.click();

        driver.navigate().back();

    List <WebElement> allProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement each: allProducts){
        System.out.println(each.getText());

      */
    }


