package week4.Day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[contains(text(),'STOCK MARKET')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals')]")).click();
		
		List<WebElement> securitynames = driver.findElements(
				By.xpath("//h2[text()='NSE Bulk Deals From Last Trading Session']//following::table/tbody/tr"));
		
		int rowsize = securitynames.size();
		List<String> names = new ArrayList<String>();
		for (int i = 1; i < rowsize; i++) {
			String columndata = driver.findElement(By.xpath(
					"//h2[text()='NSE Bulk Deals From Last Trading Session']//following::table/tbody/tr[" + i + "]/td[3]"))
					.getText();
			names.add(columndata);
		}
		Set<String> uniquenames = new LinkedHashSet<String>();
		for (String str : names) {
			if (!uniquenames.add(str)) {
				System.out.println(str);
			}
		}
		if (names.size() != uniquenames.size()) {
			System.out.println("Some securitynames are Duplicate");
		} else {
			System.out.println("No securitynames are Duplicate");
		}
		
		
	}

}
