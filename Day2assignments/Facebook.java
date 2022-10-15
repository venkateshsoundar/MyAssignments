package week2.Day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement newacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		newacc.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("Monisha");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		lastname.sendKeys("Manikandan");
		

		WebElement mobnum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		mobnum.sendKeys("9545655563");
		

		WebElement pwd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		pwd.sendKeys("Monkey");

		WebElement dd1 = driver.findElement(By.id("day"));
		
		Select dayobj = new Select(dd1);
		
		dayobj.selectByValue("2");
		
		WebElement dd2 = driver.findElement(By.id("month"));
		
		Select dayobj2 = new Select(dd2);
		
		dayobj2.selectByVisibleText("Apr");
		
		
		WebElement dd3 = driver.findElement(By.id("year"));
		
		Select dayobj3 = new Select(dd3);
		
		dayobj3.selectByValue("2021");
		
		
		WebElement fem = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		
		fem.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
