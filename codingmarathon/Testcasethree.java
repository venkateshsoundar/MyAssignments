package codingmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcasethree {

	public static void main(String[] args) {

		// setup the path

		WebDriverManager.chromedriver().setup();

		// disable notifications

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		// manage ur window

		driver.manage().window().maximize();

		// add wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Load url : https://login.salesforce.com

		driver.get("https://login.salesforce.com");

		// enter username

		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("ramkumar.ramaiah@testleaf.com");

		// enter password

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Password#123");

		// click login button

		WebElement login = driver.findElement(By.id("Login"));
		login.click();

		// Click on toggle menu button from the left corner

		WebElement toggle = driver.findElement(By.className("slds-icon-waffle"));
		toggle.click();

		// Click view All and click Sales from App Launcher

		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();

		// Type task and select task
		
		WebElement task = driver.findElement(By.xpath("//input[@class='slds-input']"));
		task.sendKeys("task");
		
		WebElement tasklink = driver.findElement(By.xpath("//p[@class='slds-truncate']/mark[text()='Task']"));
		tasklink.click();
		
		//Click New Task under dropdown icon
		
		WebElement dropdown = driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[3]"));
		dropdown.click();
		
		WebElement newtask = driver.findElement(By.xpath("//span[@class='slds-truncate']//span[text()='New Task']"));
		driver.executeScript("arguments[0].click();", newtask);
		
		
	   // Enter subject as "Bootcamp "                                               
		
		WebElement subject = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']"));
		subject.click();
		
		
		WebElement Subjboot = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']"));
		Subjboot.sendKeys("Bootcamp");
		
		
		//Select status as 'Waiting on someone else'
		
		WebElement statusdrop = driver.findElement(By.xpath("(//a[@class='select'])[1]"));
		statusdrop.click();
		
		
		WebElement wait = driver.findElement(By.xpath("(//a[text()='Waiting on someone else'])[1]"));
		wait.click();
		
		// Save and verify the 'Task created' message
		
	
		// click save
		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
		save.click();

		// verify message

		String text = driver
				.findElement(By.xpath("//span[contains(@class,'toastMessage')]"))
				.getText();

		System.out.println(text);

		if (text.contains("was created.")) {
			System.out.println("Task is successfully created");
		} else {

			System.out.println("Task is not created successfully");
		}

		driver.close();

	}

}
