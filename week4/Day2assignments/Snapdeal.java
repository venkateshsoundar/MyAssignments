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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions builder = new Actions(driver);
		WebElement mensfashion = driver
				.findElement(By.xpath("//div[text()='Top Categories']//../li/a/span[contains(text(),'Men')]"));
		builder.moveToElement(mensfashion).perform();

		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		// String noofshoes = driver.findElement(By.xpath("//div[text()='Sports
		// Fashion']//following-sibling::div[1]"))
		// .getText();

		String noofshoes = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']//following::div[1]"))
				.getText();

		System.out.println("No of sports shoes:" + noofshoes);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		WebElement sortby = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		sortby.click();

		List<WebElement> sortbydd = driver
				.findElements(By.xpath("//div[@class='sort-drop clearfix']/following-sibling::ul/li"));

		for (WebElement srtdd : sortbydd) {
			if (srtdd.getText().contains("Price Low To High")) {
				srtdd.click();
			}
		}

		Thread.sleep(5000);
		List<WebElement> pricedetails = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<Integer> pricelist = new ArrayList<Integer>();
		for (WebElement priced : pricedetails) {

			String price = priced.getText();
			price = price.substring(3).trim().replaceAll(",", "");
			pricelist.add(Integer.parseInt(price));

		}

		boolean flag = true;

		for (int i = 0; i < pricelist.size() - 1; i++) {
			if (pricelist.get(i) > pricelist.get(i + 1)) {
				flag = false;
				System.out.println("Confirm price is not sorted low to high");
				break;
			}
		}

		if (flag) {
			System.out.println("Confirm price is sorted low to high");
		}

		WebElement fromvalue = driver.findElement(By.name("fromVal"));
		fromvalue.clear();
		fromvalue.sendKeys("900");

		WebElement tovalue = driver.findElement(By.name("toVal"));
		tovalue.clear();
		tovalue.sendKeys("1200");

		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();

		/*
		 * WebElement leftdrag = driver.findElement(By.
		 * xpath("//a[contains(@class,'price-slider-scroll left-handle')]"));
		 * System.out.println(leftdrag.getLocation()); builder.dr(leftdrag, 81, 674);
		 * WebElement rightdrag = driver.findElement(By.
		 * xpath("//a[contains(@class,'price-slider-scroll right-handle')]"));
		 * System.out.println(rightdrag.getLocation()); builder.dragAndDropBy(rightdrag,
		 * -116, 674);
		 */

		Thread.sleep(2000);
		List<WebElement> filtersapplied = driver
				.findElements(By.xpath("//div[@class='filters']//following-sibling::a"));
		System.out.println("Filters Applied:");
		for (int i = 0; i < filtersapplied.size(); i++) {
			System.out.println(filtersapplied.get(i).getText());
		}

		WebElement movetoresult = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		builder.moveToElement(movetoresult).perform();

		String defaultwindow = driver.getWindowHandle();
		System.out.println(defaultwindow);

		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

		Thread.sleep(5000);
		/*
		 * Set<String> windowHandles=new
		 * LinkedHashSet<String>(driver.getWindowHandles()); List<String> winlist=new
		 * ArrayList<String>(windowHandles); driver.switchTo().window(winlist.get(1));
		 */

		WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println("Price: " + price.getText());

		WebElement perct = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		System.out.println("Offer: " + perct.getText());

		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

		driver.close();

	}

}
