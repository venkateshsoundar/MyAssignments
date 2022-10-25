package week4.Day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		Set<String> windowHandles = new LinkedHashSet<String>(driver.getWindowHandles());

		List<String> winlist = new ArrayList<String>(windowHandles);

		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		System.out.println(driver.getTitle());

		driver.switchTo().window(winlist.get(0));

		System.out.println(driver.getTitle());

		// driver.quit();

	}

}
