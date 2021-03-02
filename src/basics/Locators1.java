package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://Facebook.com");
		String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("email")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("admin");        
        driver.quit();

	}

}
