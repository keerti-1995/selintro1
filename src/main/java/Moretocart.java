import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moretocart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");
        WebDriver driver = new ChromeDriver();
        //use arraylist add more items to cart
        int j=0;
        String[] Itemsneeded={"Cucumber","Brocoli","Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
            //Brocoli - 1kg need to extract only Brocoli not 1 kg,first split it then trim the spaces
            // split ->Brocoli[0]
            //1 kg[1]
            String[] name=products.get(i).getText().split("-");
             String formattedName=name[0].trim();
            //format it to get the actual vegetable name
            //convert array into arraylist for easy search
            //bcz check whether extracted item is present in arraylist or not
            List itemsneededList = Arrays.asList(Itemsneeded);


            if(itemsneededList.contains("formattedName"))
            {
                j++;
                //click and add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                //to avoid the multiple excutions when we add the require items add j
                if(j==Itemsneeded.length)//instead of giving just number use length so how many items are added no problem
                {
                    //to stop the excution
                    break;
                }

            }
        }

    }
}

