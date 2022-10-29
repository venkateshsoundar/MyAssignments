package week4.Day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// driver setup
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions builder = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(brands).perform();
		WebElement lorealparis = driver.findElement(
				By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']"));
		lorealparis.click();
		if (driver.getTitle().contains("L'Oreal Paris")) {
			System.out.println("Confirm the page is launched");
		} else {
			System.out.println("Confirm the page is not launched");
		}
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']//following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		WebElement hair = driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair']"));
		hair.click();
		// driver.executeScript("arguments[0].click();", hair);
		// driver.findElement(By.xpath("//span[text()='Category']/following::span)[3]")).click();
		driver.findElement(By.xpath("//span[text()='Hair']//following::span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']//following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']//following::div[1]")).click();
		List<WebElement> filterapplied = driver
				.findElements(By.xpath("//span[text()='Filters Applied']/..//following-sibling::div//span"));
		for (WebElement fap : filterapplied) {
			if (fap.getText().contentEquals("Shampoo")) {
				System.out.println("Confirm the filter is applied");
				break;
			} else {
				System.out.println("Confirm the filter is not applied");
			}
		}
		String defaultwindow = driver.getWindowHandle();
		// driver.findElement(By.xpath("//div[contains(text()='Oreal Paris Colour
		// Protect Shampoo')]")).click();
		driver.findElement(By.xpath("//a[@href='/l-oreal-paris-color-protect-shampoo/p/6282?productId=6282&pps=1']"))
				.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1));
		String mrp = driver.findElement(By.xpath("(//span[text()='MRP:'])[1]//following-sibling::span")).getText();
		System.out.println("Mrp of the product:" + mrp);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.id("view_bag_snackbar")).click();
		WebElement bagframe = driver.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(bagframe);
		WebElement grandtotal = driver.findElement(By.xpath("(//span[text()='Grand Total']//..//..//span)[1]"));
		String gtotal = grandtotal.getText();
		gtotal = gtotal.substring(gtotal.length() - 3);
		System.out.println("Grandtotal:" + gtotal);
		WebElement proceed = driver.findElement(By.xpath("//span[text()='Grand Total']//following::button/div/span"));
// Need to Check
		Thread.sleep(5000);
		// driver.executeScript("arguments[0].click();", proceed);
		proceed.click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		String finalgtotal = driver.findElement(By.xpath("//div[text()='Grand Total']//following::span[1]")).getText();
		System.out.println("finalGrandtotal:" + finalgtotal);
		if (gtotal.contentEquals(finalgtotal)) {
			System.out.println("Confirm the amounts are correct");
		} else {
			System.out.println("Confirm the amounts are not correct");
		}
	}
}
