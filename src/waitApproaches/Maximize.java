package waitApproaches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//OR
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--start-maximized");
		driver.get("http://yahoo.com");
		driver.quit();
		}
}

// We can use any one of way to maximize window both will work same way
