package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	ChromeDriver driver;

	@Given("Open a browser- maximize and set the timeouts")
	public void browsersetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@And("Load the application URL {string}")
	public void loadurl(String url) {
		driver.get(url);
	}

	@Given("Enter the username {string}")
	public void enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter the password {string}")
	public void enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Click Submit and verify login")
	public void clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@And("Click CRM-SFA")
	public void clickcrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click Leads")
	public void clickleads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click Create Lead")
	public void clickcreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter the lead form details {string}, {string}, {string}")
	public void enterleadformdetails(String companyName, String firstname, String lastname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@And("Submit button is clicked")
	public void creatleadsubmit() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Lead should be created sucessfully")
	public void creatleadsucess() {
		System.out.println(driver.getTitle());
	}

}
