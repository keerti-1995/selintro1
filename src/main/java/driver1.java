import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver1 {


    public static void main(String[] args) {
      System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

              WebDriver driver = new ChromeDriver();
  driver.get("http://rahulshettyacademy.com");
  System.out.println(driver.getTitle());
  System.out.println(driver.getCurrentUrl());
  driver.close();
  driver.quit();


    }

}
