package chromeFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Profiling1 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		//SSL Certificate
		options.setAcceptInsecureCerts(true);
		//Profiling
		options.addArguments("--user-data-dir=C:\\Users\\Asus\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		//OR
		//options.addArguments("--user-data-dir=C:\\Users\\Asus\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://Facebook.com");		
		//driver.quit();

	}

}
