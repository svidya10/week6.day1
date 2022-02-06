package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadstep extends BaseClassLeaftaps {
	
	@Given("Click on Email")
	public void clickLogin() {
		driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']/li[3]")).click();
	}
	
	@Given("Enter Email {string}")
	public void clickEmail(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
	
	@Given("Capture first result")
	public void capture() {
		String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		System.out.println("Lead name is : " + leadName);
	}
	
	@Given("Click first lead result")
	public void clickFirstlead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	}
	
	@Given("Click Duplicate Lead")
	public void clickDuplicate() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Given("Verify duplicate lead")
	public void verifyDuplicate() {
		if (driver.getTitle().contains("Duplicate Lead"))
			System.out.println("Duplicate Lead Page Title confirmed");
		else
			System.out.println("Duplicate Lead Page Title not confirmed");
	}
	

	/*// Click Leads Link
			driver.findElement(By.linkText("Leads")).click();

			// Click Find Leads
			driver.findElement(By.linkText("Find Leads")).click();

			// Click on Email
			driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']/li[3]")).click();

			// Enter Email
			driver.findElement(By.name("emailAddress")).sendKeys(("abc@gmail.com"));

			// Click find leads button
			driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();

			Thread.sleep(1000);

			// Capture name of First Resulting lead
			String leadName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
					.getText();
			System.out.println("Lead name is : " + leadName);

			// Click First Resulting lead
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

			// Click Duplicate Lead
			driver.findElement(By.linkText("Duplicate Lead")).click();

			// Verify the title as 'Duplicate Lead'
			if (driver.getTitle().contains("Duplicate Lead"))
				System.out.println("Duplicate Lead Page Title confirmed");
			else
				System.out.println("Duplicate Lead Page Title not confirmed");

			// Click Create Lead
			driver.findElement(By.className("smallSubmit")).click();

			// Confirm the duplicated lead name is same as captured name
			if (driver.findElement(By.id("viewLead_firstName_sp")).getText().equalsIgnoreCase(leadName))
				System.out.println("Duplicated Lead Name = Captured Name");
			else
				System.out.println("Duplicated Lead Name != Captured Name"); */


}
