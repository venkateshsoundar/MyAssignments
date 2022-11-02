package codingmarathontwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcasetwoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		// manage ur window
		driver.manage().window().maximize();
		// add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.redbus.in/");

		WebElement src = driver.findElement(By.id("src"));
		src.click();
		src.sendKeys("Chennai");
		// src.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='src']//following-sibling::ul/li[text()='Chennai']")).click();

		WebElement dest = driver.findElement(By.id("dest"));
		dest.click();
		dest.sendKeys("Bangalore");
		// dest.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dest']//following-sibling::ul/li[text()='Bangalore']")).click();

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("(//input[@id='onward_cal']//following::table//tr//td[@class='wd day'])[1]"))
				.click();

		driver.findElement(By.id("search_btn")).click();

		String busfound = driver.findElement(By.xpath("//span[contains(@class,'busFound')]")).getText();
		System.out.println(busfound);
		
		//driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
		driver.findElement(By.xpath("//div[text()='BUS TYPES']/following-sibling::ul[1]/li[2]/label[text()='SLEEPER']")).click();
		
		String secondresult = driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[2]//div[contains(@class,'travels')]")).getText();
		System.out.println("Second Result After filter: "+secondresult);
		
		driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[2]/following-sibling::div/div[text()='View Seats']")).click();

		driver.close();
	}

}
