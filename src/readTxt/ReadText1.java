package readTxt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText1 {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://cnn.com");
        String readText=driver.findElement(By.xpath("//a[@class='link-banner']/h2")).getText();
        System.out.println(readText);
        driver.quit();

	}

}
