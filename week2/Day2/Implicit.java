package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.facebook.com");
		
		WebElement CreateNewAcc = driver.findElement(By.linkText("Create New Account"));
		
		CreateNewAcc.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("venkat");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Babu");
	}

}
