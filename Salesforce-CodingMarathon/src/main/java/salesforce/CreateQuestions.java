package salesforce;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateQuestions extends Commonmethods {
	
	@Test(dataProvider = "provideData")
	public void createquest(String question,String detail) throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement toggle = driver.findElement(By.className("slds-icon-waffle"));
		toggle.click();
		// Click view All and click Sales from App Launcher

		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", chatter);

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']"))
				.sendKeys(question);

		driver.findElement(By.xpath("//span[text()='Details']//following::p[1]"))
				.sendKeys(detail);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();

		Thread.sleep(5000);

		String Quest = driver.findElement(By.xpath(
				"(//article[contains(@class,'cuf-feedElement')])[1]/div[contains(@class,'forceChatterFeedBodyQuestionWithoutAnswer')]/span"))
				.getText();
		System.out.println(Quest);

		String Quest1 = driver.findElement(By.xpath(
				"(//article[contains(@class,'cuf-feedElement')])[1]/div[contains(@class,'cuf-questionBody')]//span"))
				.getText();
		System.out.println(Quest1);

	}
	
	@BeforeTest
	public void setdata() {
		sheetname="CreateQuestion";
	}
	


}
