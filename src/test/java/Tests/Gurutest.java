package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gurutest {
	
	WebDriver driver;
	
	@Test
	void  Openapp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4");
	}
	
	@Test(priority=1)
	void Login() {
		driver.findElement(By.name("uid")).sendKeys("mngr532503");
		driver.findElement(By.name("password")).sendKeys("EjAtAqU");
		driver.findElement(By.name("btnLogin")).click();
	}

	@Test(priority=2)
	void Closeapp(){
		driver.close();
	}

}
