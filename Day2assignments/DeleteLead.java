package week2.Day2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {

		// http://leaftaps.com/opentaps/control/main

		// creating lead from another class
		Createlead cld = new Createlead();
		String lead = cld.createlead();

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

		// 8 Click on Phone
		WebElement phonetab = driver.findElement(By.xpath("//span[text()='Phone']"));
		phonetab.click();
		// 9 Enter phone number
		WebElement phonenum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phonenum.sendKeys("9597661212");

		// 11 Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 12 Click on first resulting lead
		WebElement elemtlist = driver
				.findElement(By.xpath("//a[text()='"+lead+"']"));
		elemtlist.click();

		// 13 Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();

		// 14 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// 15 Enter captured lead ID
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(lead);

		// 16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 17 Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
			
		boolean nrverify=driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();

		if(nrverify) {
			System.out.println("Lead has been sucessfully deleted");
		}
		else {
			System.out.println("Lead is not  deleted");
		}
		

		driver.close();

	}

}
