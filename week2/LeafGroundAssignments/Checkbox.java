package week2.LeafGroundAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Basic Checkbox");

		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		System.out.println("Notification");
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String Notification = driver.findElement(By.className("ui-growl-title")).getText();

		System.out.println("Message: " + Notification);

		System.out.println("Choose your favorite language(s)");
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();

		System.out.println("Tri State Checkbox");
		WebElement tristatecheck = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
		
		tristatecheck.click();		
		String message1 = driver.findElement(By.className("ui-growl-title")).getText();
		String state1 = driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		System.out.println(message1);
		System.out.println(state1);
		
		/*
		 * tristatecheck.click(); String message2 =
		 * driver.findElement(By.className("ui-growl-title")).getText(); String state2 =
		 * driver.findElement(By.
		 * xpath("//span[text()='State has been changed.']/following-sibling::p")).
		 * getText(); System.out.println(message2); System.out.println(state2);
		 */
	
		driver.close();
		
	}

}
