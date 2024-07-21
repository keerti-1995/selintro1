import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//Testng is testing framework
public class checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //count the number of checkboxes
        System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
        //calender
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        //enabled or disabled
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("Div1")).getAttribute("style");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        System.out.println(driver.findElement(By.id("ctl00$mainContent$view_date2")).isEnabled());
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }






        driver.findElement(By.id("divpaxinfo")).click();//2 adults
        Thread.sleep(2000);
        // we can use either while loop or for loop
        // int i=1;
        //while (i<5)
        //{
        //  driver.findElement(By.id("divpaxinfo")).click();
        // i++;
        //}
        //for loop
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");


    }

}
