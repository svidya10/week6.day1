package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;

	@BeforeMethod()
	public void beforeMethod() {
		
		System.out.println("@BeforeMethod Method");
		
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

	@AfterMethod
	public void afterMethod() {
		// Close browser
		System.out.println("@AfterMethod Method");
		driver.close();

	}
}
