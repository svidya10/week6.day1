package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadstep extends BaseClassLeaftaps{

/*	@Given("Launch the Browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();

		// Open browser
		driver = new ChromeDriver();
	
	}

	@Given("Load the application url")
	public void loadURL() {
		// Load url
		driver.get("http://leaftaps.com/opentaps/");

		// maxi
		driver.manage().window().maximize();
	}
	
	@Given("Enter Username as {string}")
	public void enterUsername(String uName) {
		// enter username
		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys(uName);

	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String pwd) {
		// enter password
		driver.findElement(By.id("password")).sendKeys(pwd);

	}
	
*/

	@Then("Click on Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Click on {string}")
	public void clickOn(String login) {
		System.out.println("Click on : " + login);
		
		driver.findElement(By.linkText(login)).click();
	}
	
	/* @Given("Click on {string}")
	public void clickCRMSFA(String button) {
		// Click CRM/SFA
		driver.findElement(By.linkText(button)).click();
	}
	
	@Given("Click on Create Contacts")
	public void clickCreateContact() {
		// Click Contact tab
		driver.findElement(By.linkText("Contacts")).click();

		// Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
	} */

	@Given("Enter firstname as {string}")
	public void enterFirstName(String fName) {
		// Enter first name
		WebElement firstname = driver.findElement(By.id("firstNameField"));
		firstname.sendKeys(fName);

		System.out.println(firstname.getAttribute("value"));

	}
	
	@Given("Enter lastname as {string}")
	public void enterLastName(String lName) {
		// Enter last name
		WebElement lastname = driver.findElement(By.id("lastNameField"));
		lastname.sendKeys(lName);
	}
	
	@When("Click on Submit button")
	public void clickOnSubmit() {
		// Click Create Contact Button
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Then("View Lead Page should be displayed")
	public void viewLeadPageDisplayed() {
		// Print First Name and Title
		//String firstNameText = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		//System.out.println("First name string is : " + firstNameText);

		String title = driver.getTitle();
		System.out.println("Browser title is : " + title);
		
		Assert.assertEquals(title.contains("View Contact"), true);

	}
}
