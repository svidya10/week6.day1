package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksLeaftaps extends BaseClassLeaftaps {
	@Before
	public void before() {
		
		System.out.println("@Before");	
		WebDriverManager.chromedriver().setup();
		// Open browser
		driver = new ChromeDriver();
		// Load url
		driver.get("http://leaftaps.com/opentaps/");
		// maxi
		driver.manage().window().maximize();
		// enter username
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("DemoCSR");
		// enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@After
	public void after() {
		// Close browser
		System.out.println("@After");
		driver.close();
	}
}
