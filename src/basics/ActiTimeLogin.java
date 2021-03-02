package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actiTime.com/login.do");
		String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("pwd")).sendKeys("admin");
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(3000);
        title=driver.getTitle();
        System.out.println(title);
        driver.quit();

	}

}
