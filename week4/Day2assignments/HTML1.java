package week4.Day2assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath(
				"//table/caption[text()='The Three Most Popular JavaScript Libraries']/following-sibling::tbody/tr"));
		System.out.println("No of rows " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table/caption[text()='The Three Most Popular JavaScript Libraries']/following-sibling::tbody/tr[1]/td"));
		System.out.println("No of columns " + columns.size());
	}

}
