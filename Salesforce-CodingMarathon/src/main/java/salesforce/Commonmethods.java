package salesforce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonmethods {

	RemoteWebDriver driver;
	String sheetname;
	
	@Parameters({ "url", "username", "password", "browsername" })
	@BeforeMethod
	public void launchBrowser(String url, String username, String password, String browsername) {

		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--disable-notifications");
			driver = new ChromeDriver(ch);
		}
		
		else if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions eh = new EdgeOptions();
			eh.addArguments("--disable-notifications");
			driver = new EdgeDriver(eh);
		}
		
	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);

		// enter username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys(username);

		// enter password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);

		// click login button
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}

	@AfterMethod
	public void Closebrowser() {
		driver.close();
	}


	@DataProvider	
	public String[][] provideData() throws IOException {		
		String[][] data=ExcelReaddata.exceldata(sheetname);		
		return data;
	}
	
}
