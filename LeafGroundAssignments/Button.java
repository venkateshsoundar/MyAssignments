package week2.LeafGroundAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::button[1]")).click();
		if (driver.getTitle().contentEquals("Dashboard")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println(driver.getTitle());

		driver.navigate().back();

		Boolean disabled = driver
				.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button[1]"))
				.isEnabled();
		System.out.println(disabled);

		Point position = driver
				.findElement(By.xpath("//h5[text()='Find the position of the Submit button']/following::button[1]"))
				.getLocation();
		System.out.println(position.getX());
		System.out.println(position.getY());

		String savecolor = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("color");
		System.out.println(savecolor);

		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size.height + "," + size.width);

		WebElement sucesshover = driver.findElement(By.xpath("(//span[text()='Success'])[1]"));

		String color1=sucesshover.getCssValue("background-color");
		Actions act = new Actions(driver);
		
		act.moveToElement(sucesshover).perform();
		
		String color2=sucesshover.getCssValue("background-color");
		if(!(color1.contentEquals(color2))) {
			System.out.println("Mousehover color changed");
		}
		else {
			System.out.println("Mousehover color not changed");
		}
		
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
		
		
		List<WebElement> roundedbutton = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::span"));
		System.out.println(roundedbutton.size());
		
		
		driver.close();

	}
}
