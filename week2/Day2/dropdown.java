package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leaftaps.com/opentaps/control/main");

		///WebElement Username = driver.findElement(By.id("username"));
	//Username.sendKeys("Demosalesmanager");
		
		WebElement username = driver.findElement(By.xpath("//input[@id ='username']"));
		username.sendKeys("Demosalesmanager");
		

		//WebElement Password = driver.findElement(By.id("password"));
		//Password.sendKeys("crmsfa");
		
		WebElement pwd = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		pwd.sendKeys("crmsfa");
		
		
		
		//input[contains(@type,'password')]
	

		//WebElement login = driver.findElement(By.className("decorativeSubmit"));
		//login.click();
		
		
		WebElement log = driver.findElement(By.xpath("(//input)[3]"));
		log.click();

				
		//WebElement link = driver.findElement(By.linkText("CRM/SFA"));

		//link.click();
		
		WebElement lin = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')"));

		lin.click();
		
		    

		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("CTS");

		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Venkat");

		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Soundar");

		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source=new Select(elesource);
		
		source.selectByVisibleText("Employee");
		
		WebElement eleInd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Ind = new Select(eleInd);
		Ind.selectByValue("IND_FINANCE");
		
		WebElement eleCorp = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Corp = new Select(eleCorp);
		Corp.selectByIndex(5);
		
		driver.findElement(By.id("createLeadForm_dataSourceId")).getAttribute("value");
	}

}
