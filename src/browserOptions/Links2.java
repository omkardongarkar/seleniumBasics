package browserOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		System.out.println(allLinks.size());
		//1st Approach
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement element=allLinks.get(i);
			System.out.println(element.getText());
		}
		//2nd Approach
		for(WebElement element:allLinks)
		{
			System.out.println(element.getText()+" "+ element.isDisplayed());
		}
		driver.quit();

	}

}
