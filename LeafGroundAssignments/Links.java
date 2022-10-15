package week2.LeafGroundAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 Launch the browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.leafground.com/link.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		System.out.println("Take me to dashboard");
		driver.findElement(By.linkText("Go to Dashboard")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println("Find my destination");
		String url=driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
		System.out.println(url);
		
		
		System.out.println("Am I broken link?");
		driver.findElement(By.linkText("Broken?")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if (title.contains("Error 404")) {
			System.out.println("Link is Broken");
		}
		else {
			System.out.println("Link is not Broken");	
		}
		
		driver.navigate().back();
		
		System.out.println("Duplicate Link");
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println("Count Links");
		
		List<WebElement> clinks = driver.findElements(By.tagName("a"));
		System.out.println(clinks.size());
		
		System.out.println("Count Layout Links");
		
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		List<WebElement> llinks = driver.findElements(By.tagName("a"));
		System.out.println(llinks.size());
		
		
		driver.close();

	}

}
