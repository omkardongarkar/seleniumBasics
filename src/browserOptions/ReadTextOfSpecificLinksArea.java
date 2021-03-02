package browserOptions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextOfSpecificLinksArea {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://cnn.com");
		String str1="//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String str2="]/article/div/div";		
		for(int i=2;i<9;i++)
		{  String locxpath=str1+i+str2;
		System.out.println(driver.findElement(By.xpath(locxpath)).getText());
		driver.findElement(By.xpath(locxpath)).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		}
		//driver.quit();
		}
}
