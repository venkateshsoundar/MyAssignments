package week2.LeafGroundAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Your most favorite browser");
		WebElement favbrowser = driver
				.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[4]/div[1]/div[2]/span[1]"));
		favbrowser.click();

		System.out.println("UnSelectable");
		WebElement unselect = driver
				.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		unselect.click();
		unselect.click();
		boolean status = unselect.isSelected();
		if (!status) {
			System.out.println("Radio button is unselectable");
		} else {
			System.out.println("Radio button is selectable");
		}

		System.out.println("defaultbrowser");

		WebElement defbrowse = driver.findElement(By
				.xpath("(//input[@name='j_idt87:console2']/following::input[@checked='checked']/following::label)[1]"));
		System.out.println(defbrowse.getText());

		System.out.println("Select the age group (only if not selected)");
		driver.findElement(By.xpath("(//h5[text()='Select the age group (only if not selected)']/following::span)[1]"))
				.click();

		driver.close();
	}

}
