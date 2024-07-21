import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticdropdown {
    public static void main(String[] args) throws InterruptedException {
                System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

                WebDriver driver = new ChromeDriver();
                driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
                driver.findElement(By.id("divpaxinfo")).click();//2 adults
                Thread.sleep(2000);
                // we can use either while loop or for loop
               // int i=1;
                //while (i<5)
        //{
          //  driver.findElement(By.id("hrefIncAdt")).click();
            // i++;
        //}
        //for loop
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
                driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }


}
