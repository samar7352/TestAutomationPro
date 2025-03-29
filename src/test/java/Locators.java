package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    private static Object headerElement;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Samar Anwar\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //Name element
       // driver.findElement(By.name("q")).sendKeys("mac");

        //id element
       // Boolean displayedlogo=driver.findElement(By.id("container")).isDisplayed();
       // System.out.println(displayedlogo);

        //class
        //linkText and partialLink text
      //  driver.findElement(By.linkText("Cart")).click();
      //  List<WebElement>headerlink=driver.findElements(By.linkText("_1krdK5 _3jeYYh"));
      //  System.out.println("Total link Element" +headerlink.size());

        //tagName
      //  List<WebElement> link=driver.findElements(By.linkText("a"));
      //  System.out.println("total link " +link.size());
        List<WebElement> link=driver.findElements(By.linkText("row"));

        System.out.println("Total number of image" +link.size());


    }
}
