package basics;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Multibrowser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		WebDriver driver=null;
				/*
				System.out.println("Enter 1 for chrome and 2 for Firefox");
				int a=sc.nextInt();
				*/
				System.out.println("Enter chrome or firefox");
				String browserType=sc.nextLine();
				if(browserType.equals("chrome"))
				{  driver=new ChromeDriver();
				   driver.get("https://facebook.com");
				   driver.quit();
				}
				else if(browserType.equals("firefox"))
				{  driver=new FirefoxDriver();
				   driver.get("https://facebook.com");
				   driver.quit();
				}
				else
				  System.out.println("You have entered wrong browser");
				
				driver.get("https://facebook.com");
				driver.quit();
			}
}
