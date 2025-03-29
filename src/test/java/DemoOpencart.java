package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoOpencart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Samar Anwar\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver1=new ChromeDriver();
        driver1.get("http://uitestingplayground.com/");
        driver1.manage().window().maximize();
        List<WebElement>link=driver1.findElements(By.linkText("row"));
        System.out.println("total link" +link.size());
        ///hvhghjjnkk


    }
}
