package chromeFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageStrategyEager {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://Facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.quit();
	}
}
//for EAGER: When partial html/css gets loaded then selenium will perform operations
