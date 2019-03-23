package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webdriverfunctions {
	
	@Test
	public void run()
	{
	
	System.setProperty("webdriver.chrome.driver", "E:\\New\\jar\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("#login1")).sendKeys("username123"); //using cssselector ---> #id
	
	driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pass123");
	
	System.out.println("login successfully");
	
	}

}
