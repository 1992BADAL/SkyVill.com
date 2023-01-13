package SkyVillTestDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactPage {
	WebDriver driver;
	@BeforeMethod
	public void BeforeTest01() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	@Test
	public void VerifyContact() {
		System.out.println("dfghj");
		driver.navigate().to("https://www.skyvill.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
		
		//Assert.assertEquals(driver.getTitle(), "Contact - SkyVill");
	}
	
}
	
	
