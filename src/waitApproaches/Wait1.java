package waitApproaches;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actiTime.com/login.do");
		String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("pwd")).sendKeys("admin");
        driver.findElement(By.id("loginbutton")).click();        
        title=driver.getTitle();
        System.out.println(title);
        driver.quit();

	}

}
