package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;

public class EditLeadstep extends BaseClassLeaftaps {
	
	@Given("Enter leadfirstname {string}")
	public void leadfirstname(String fName) {
		// Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys((fName));

	}
	
	@Given("Click on Lead button")
	public void leadbutton() throws InterruptedException {
		// Click find leads button
				driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
				Thread.sleep(1000);
	}
	
	@Given("Click on firstLead Result")
	public void firstLead() {
		// Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

		// Verify the title of page
		System.out.println(driver.getTitle());
	}
		
	@Given("Click on Edit")
	public void edit() {
		// Click Edit
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Enter companyname as {string}")
	public void companyName(String cName) {
		// Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys((cName));
	}
	
	@Given("Click on Update button")
		public void update() {
		// Click Update
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Given("Verify company name {string}")
	public void verify(String cName) {
		// Confirm the changed name appears
		if (driver.findElement(By.id("viewLead_companyName_sp")).getText().contains(cName))
			System.out.println("Changed company name appears");
		else
			System.out.println("Changed company name does not appear");
	}
}
