package week2.Day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public String createlead() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Demosalesmanager");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		WebElement link = driver.findElement(By.linkText("CRM/SFA"));

		link.click();

		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("CTS");

		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Testdelete");

		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Soundar");

		WebElement FirstnameLoc = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstnameLoc.sendKeys("Venki");

		WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("Testing");

		WebElement Description = driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("Learning Selenium");

		WebElement Email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		Email.sendKeys("venkimech1992@gmail.com");
		
		WebElement phonenumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phonenumber.sendKeys("9597661212");

		WebElement CreateLead = driver.findElement(By.className("smallSubmit"));
		CreateLead.click();
		
		

		String title = driver.getTitle();
		System.out.println(title);
	
		
		String leadid=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		leadid=leadid.replaceAll("[()]","");
		leadid=leadid.substring(leadid.length()-5);
		System.out.println(leadid);
		driver.close();
			return leadid;
			
	
		

	}

}
