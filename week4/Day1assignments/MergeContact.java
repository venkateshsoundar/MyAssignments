package week4.Day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		WebElement link = driver.findElement(By.linkText("CRM/SFA"));

		link.click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		String mainWindowHandle = driver.getWindowHandle();
		System.out.println(mainWindowHandle);

		driver.findElement(By.xpath("(//span[text()='From Contact']/following::img)[1]")).click();

		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String> windhand = new ArrayList<String>(allWindowHandles);

		for (String str : windhand) {
			if (!str.contentEquals(mainWindowHandle)) {
				driver.switchTo().window(str);
			}

		}

		System.out.println(driver.getTitle());

		WebElement findcon = driver.findElement(By.xpath("(//a[@class='linktext'])[1]"));
		findcon.click();

		driver.switchTo().window(mainWindowHandle);

		driver.findElement(By.xpath("(//span[text()='To Contact']/following::img)[1]")).click();

		allWindowHandles.clear();
		windhand.clear();
		
		allWindowHandles = driver.getWindowHandles();
		windhand = new ArrayList<String>(allWindowHandles);

		for (String str : windhand) {
			if (!str.contentEquals(mainWindowHandle)) {
				driver.switchTo().window(str);
			}

		}

		driver.switchTo().window(windhand.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[9]")).click();

		driver.switchTo().window(mainWindowHandle);
		
		driver.findElement(By.className("buttonDangerous")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
