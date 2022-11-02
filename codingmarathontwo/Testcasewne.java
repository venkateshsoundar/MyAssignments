package codingmarathontwo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Testcasewne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		// disable notifications

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		// manage ur window
		driver.manage().window().maximize();
		// add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		
		String defaultwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles= new LinkedHashSet<String>(driver.getWindowHandles());
		List<String> winlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	
		Shadow shdw=new Shadow(driver);
		shdw.setImplicitWait(10);
		shdw.findElementByXPath("//span[text()='Learning']").click();
		
		Actions builder = new Actions(driver);	
		
		WebElement trailhead = shdw.findElementByXPath("//span[text()='Learning on Trailhead']");
		builder.moveToElement(trailhead).perform();
		
		
		shdw.findElementByXPath("//a[text()='Salesforce Certification']").click();		
		System.out.println(driver.getTitle());
		System.out.println("Certification List:");
		
	List<WebElement> certificateList = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		for(WebElement lst:certificateList) {
			System.out.println(lst.getText());
		}
		
		driver.quit();
		
		
		
		

		
	}

}
