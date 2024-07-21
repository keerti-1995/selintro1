import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemstocart {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");
        //only cucumber to cart

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
             String name=products.get(i).getText();
             if(name.contains("Cucumber"))
             {
                 //click and add to cart
                 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                 break;
             }
        }

    }
}
