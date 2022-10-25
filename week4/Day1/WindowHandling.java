package week4.Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.irctc.co.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
				//1. Navigate to https://www.irctc.co.in/
				//	2. Click Ok in the alert
				
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				
				//3. Click on FLIGHTS link
				
				driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
				
				//4. Switch to the Flights window
				
				Set<String> windowHandles = driver.getWindowHandles();
				
				List<String> windhand=new ArrayList<String>(windowHandles);
				
				driver.switchTo().window(windhand.get(1));
				
				//5. Print the Title of the Flights window
				
				System.out.println(driver.getTitle());
				
				
				//6. Close the Flights window alone
				driver.close();
				
				//7. Print the Train search window title (First window)
				
				driver.switchTo().window(windhand.get(0));
				
				System.out.println(driver.getTitle());
				
				
		
	}

}
