package week2.Day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

		// http://leaftaps.com/opentaps/control/main

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2 Enter the username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Demosalesmanager");

		// 3 Enter the password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");

		// 4 Click Login
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		// 5 Click crm/sfa link
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();

		// 6 Click Leads link
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();

		// 7 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// 8 Enter first name
		WebElement firstnm = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		firstnm.sendKeys("venkat");

		// 9 Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 10 Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='10110']")).click();

		// 11 Verify title of the page

		System.out.println(driver.getTitle());
		
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("User can able to access view lead page");
		}
		else {
			System.out.println("User can't access the view page/page title is not as expected");
		}

		// 12 Click Edit

		WebElement Edit = driver.findElement(By.linkText("Edit"));
		Edit.click();

		// 13 Change the company name
		WebElement Companyname = driver.findElement(By.id("updateLeadForm_companyName"));
		Companyname.clear();
		Companyname.sendKeys("deloitte");

		// 14 Click Update

		WebElement Update = driver.findElement(By.className("smallSubmit"));
		Update.click();

		// 15 Confirm the changed name appears

		WebElement updcname = driver.findElement(By.id("viewLead_companyName_sp"));
		if (updcname.getText().contains("deloitte")) {
			System.out.println("Testcase for company update is sucessfully passed");
		} else {
			System.out.println("CAUTION!!!Testcase for company update is Failed");
		}

		// 16 Close the browser (Do not log out)

		driver.close();

	}

}
