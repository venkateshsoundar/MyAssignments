package week4.Day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundmw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String defaultwhan = driver.getWindowHandle();

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = new LinkedHashSet<String>(driver.getWindowHandles());

		List<String> winlist = new ArrayList<String>(windowHandles);

		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());

		if (driver.getTitle().contentEquals("Dashboard")) {
			System.out.println("TC001-Pass");
		}

		else {
			System.out.println("TC001-Fail");
		}

		driver.close();
		// driver.switchTo().defaultContent();
		driver.switchTo().window(defaultwhan);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		windowHandles.clear();
		winlist.clear();

		windowHandles = driver.getWindowHandles();
		winlist.addAll(windowHandles);

		int size = winlist.size() - 1;

		System.out.println("No of Opened Windows:" + size);

		for (String str : winlist) {
			if (!(str.contentEquals(defaultwhan))) {
				driver.switchTo().window(str);
				driver.close();
			}

		}

		driver.switchTo().window(defaultwhan);

		windowHandles.clear();
		winlist.clear();

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		windowHandles = driver.getWindowHandles();
		winlist.addAll(windowHandles);

		for (String str : winlist) {
			if (!(str.contentEquals(defaultwhan))) {
				driver.switchTo().window(str);
				System.out.println("Closing Window:" + driver.getTitle());
				driver.close();
			}

		}

		driver.switchTo().window(defaultwhan);

		windowHandles.clear();
		winlist.clear();

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		windowHandles = driver.getWindowHandles();
		winlist.addAll(windowHandles);

		for (String str : winlist) {
			if (!(str.contentEquals(defaultwhan))) {
				driver.switchTo().window(str);
				System.out.println("Delay Windows:" + driver.getTitle());
				driver.close();
			}

		}

		driver.switchTo().window(defaultwhan);
		driver.close();

	}

}
