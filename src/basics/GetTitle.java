package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://Facebook.com");
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();

	}

}
