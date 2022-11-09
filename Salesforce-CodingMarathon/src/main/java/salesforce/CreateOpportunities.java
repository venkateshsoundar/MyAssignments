package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateOpportunities extends Commonmethods {

	@Test(dataProvider = "provideData")
	public void createopportunity(String name, String Type, String LeadSource, String amount, String Stage, String Days)
			throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement toggle = driver.findElement(By.className("slds-icon-waffle"));
		toggle.click();
		// Click view All and click Sales from App Launcher
		Thread.sleep(5000);
		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		driver.findElement(
				By.xpath("//a[contains(@title,'Opportunities')]/following-sibling::one-app-nav-bar-item-dropdown"))
				.click();
		WebElement newopp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		driver.executeScript("arguments[0].click();", newopp);

		driver.findElement(By.xpath("//label[text()='Opportunity Name']")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div/input")).sendKeys(name);
		driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div//span[@title='" + Type + "']"))
				.click();
		driver.findElement(By.xpath("//label[text()='Lead Source']/following-sibling::div")).click();
		driver.findElement(
				By.xpath("//label[text()='Lead Source']/following-sibling::div//span[@title='" + LeadSource + "']"))
				.click();

		driver.findElement(By.xpath("//label[text()='Stage']//following-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Stage']//following-sibling::div//span[@title='" + Stage + "']"))
				.click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);

		driver.findElement(By.xpath("//label[text()='Primary Campaign Source']//following-sibling::div//input"))
				.click();

		driver.findElement(By.xpath("//h3[text()='Recent Campaigns']//following::li//span[text()='BootCamp']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[@title='Next Month']")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//td/span[text()='" + Days + "']"))
				.click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(3000);
		String ActualResult = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();

		System.out.println(ActualResult);
		if (ActualResult.contains(name)) {
			System.out.println("Confirm the opportunity is created");
		} else {
			System.out.println("Confirm the opportunity is not created");
		}

	}

	@BeforeTest
	public void setdata() {
		sheetname = "CreateOpportunities";
	}

}
