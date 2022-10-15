package week2.LeafGroundAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Which is your favorite UI Automation tool?");
		WebElement favtool = driver.findElement(By.className("ui-selectonemenu"));
		Select sel = new Select(favtool);
		sel.selectByVisibleText("Puppeteer");

		System.out.println("Choose your preferred country.");
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		Thread.sleep(2000);

		System.out.println("Confirm Cities belongs to Country is loaded");
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		WebElement city1 = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		city1.click();
		System.out.println(city1.getText());

		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		WebElement city2 = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		city2.click();
		System.out.println(city2.getText());
		Thread.sleep(2000);

		System.out.println("Choose the Course");

		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//li[text()='AWS']")).click();

		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//li[text()='Appium']")).click();

		Thread.sleep(2000);
		
		System.out.println("Choose language randomly");
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Select 'Two' irrespective of the language chosen");
		
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
