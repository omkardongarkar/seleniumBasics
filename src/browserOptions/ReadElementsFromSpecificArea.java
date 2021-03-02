//Question: Write a selenium script to extract objects/elements from a specific area
package browserOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadElementsFromSpecificArea {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://cnn.com");
		WebElement webArea=driver.findElement(By.xpath("//section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]"));
		List<WebElement> webAreaLinks=webArea.findElements(By.xpath("//a"));
		System.out.println(webAreaLinks.size());
		webAreaLinks=webArea.findElements(By.tagName("a"));
		System.out.println(webAreaLinks.size());		
		driver.quit();

	}

}
