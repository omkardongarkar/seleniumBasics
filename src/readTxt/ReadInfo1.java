package readTxt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadInfo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("admin");
        String readInfo=driver.findElement(By.id("email")).getAttribute("value");
        System.out.println(readInfo);
        driver.quit();

	}

}
