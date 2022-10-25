package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement tryitframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(tryitframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//driver.switchTo().defaultContent();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Venkatesh");
		alert.accept();
		
		//driver.switchTo().frame(tryitframe);
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);

	}

}
