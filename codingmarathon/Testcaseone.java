package codingmarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcaseone {

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

		// Click on Account tab

		WebElement account = driver.findElement(By.xpath("//p[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", account);
		// account.click();

		// Click on New button

		WebElement newbut = driver.findElement(By.xpath("//a[@title='New']"));
		newbut.click();

		// Enter 'your name' as account name

		WebElement accountname = driver.findElement(By.xpath("//input[@name='Name']"));
		accountname.sendKeys("Venkatesh");

		// Select Ownership as Public
		WebElement ownership = driver.findElement(
				By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click();", ownership);

		driver.findElement(By.xpath("//span[text()='Public']")).click();

		// click save
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		save.click();

		// verify message

		String text = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"))
				.getText();

		System.out.println(text);

		if (text.contains("was created.")) {
			System.out.println("Account is successfully created");
		} else {

			System.out.println("Account is not created successfully");
		}

		driver.close();

	}

}
