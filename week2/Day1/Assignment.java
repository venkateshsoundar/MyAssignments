package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup(); 
		
		ChromeDriver driver=new ChromeDriver();
		
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
		FirstName.sendKeys("Venkat");
		
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
		
		WebElement CreateLead = driver.findElement(By.className("smallSubmit"));
		CreateLead.click();
		
		String title = driver.getTitle();
		System.out.println(title);	
		
	}
	
}
