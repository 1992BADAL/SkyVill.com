package SkyVillTestDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	@Test
	public void HomepageVerify() throws InterruptedException {
        //Launch Web browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
        //Open Url for skyVill.in
		driver.navigate().to("https://www.skyvill.in/");
		//PageTitle
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

        //Find Email Box
		driver.findElement(By.id("wpforms-2382-field_2")).sendKeys("mondalbadal790@gmial.com");
        driver.findElement(By.id("wpforms-2382-field_4_0")).click();
		driver.findElement(By.xpath("//*[@id=\'wpforms-submit-2382\']")).click();
		
		Thread.sleep(2000);

		driver.getPageSource().contains("Thanks for signing up for the newsletter! We'll be in touch soon.");
		String pageTitle1 = driver.getTitle();
		System.out.println(pageTitle1);
		
		
	}
    
	}


