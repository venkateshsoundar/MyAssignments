package week4.Day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
	public static void main(String[] args) {
		// driver setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Draggable Element
		WebElement drag = driver.findElement(By.id("form:conpnl"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 400, 0).perform();
		// Drag and Drop an element
		WebElement dragdropsource = driver.findElement(By.id("form:drag"));
		WebElement dragdroptarget = driver.findElement(By.xpath("//p[text()='Drop here']"));
		builder.dragAndDrop(dragdropsource, dragdroptarget).perform();
	}
}