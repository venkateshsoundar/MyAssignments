package week2.LeafGroundAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) throws InterruptedException {		

		// 1 Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 2 Type ur name
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
		name.sendKeys("Venkateshwaran");
		
		
		// Append the country
		
		WebElement append=driver.findElement(By.id("j_idt88:j_idt91"));
		append.click();	
		append.sendKeys(",India");
			
			//verify disabled placedholder
		
		WebElement plholder = driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following::div)[2]"));
		Boolean enable =plholder.isEnabled();
		if (enable) {
			System.out.println("Placeholder field is disabled");
		}
		else {
			System.out.println("Placeholder field is not disabled");
		}
		
		
		// clear the typed text
		
		WebElement hypetext = driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input"));
		hypetext.click();
		hypetext.clear();
		
		
		//Retrieve the typed text.
		
		WebElement typetext = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input"));
		 
		System.out.println(typetext.getAttribute("value"));
		
		//type email and tab
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		email.sendKeys("venkimech1992@gmail.com",Keys.TAB);
			
		
		WebElement activeElement = driver.switchTo().activeElement();
		String text=activeElement.getAttribute("placeholder");
		
		System.out.println(text);
		
		if(text.contains("About yourself")) {
			System.out.println("Tab function Works");
		}
		else {
			System.out.println("Testcase failed");
		}
		
		// Validate Error Message
		WebElement enterandconfirm = driver.findElement(By.id("j_idt106:thisform:age"));
		enterandconfirm.sendKeys(Keys.ENTER);
		
		WebElement errormessage = driver.findElement(By.className("ui-message-error-detail"));
		String errordisplay =errormessage.getText();
		
		if(errordisplay.contains("Age is mandatory")) {
			System.out.println("Confirmed Error Message");
		}
		else {
			System.out.println("Not Confirmed Error Message");
		}
		
		// Position Change
		
		WebElement postionchange = driver.findElement(By.xpath("(//h5[text()='Click and Confirm Label Position Changes']/following::input)[1]"));
		Point location=postionchange.getLocation();
		postionchange.click();
		WebElement changepos = driver.findElement(By.xpath("(//h5[text()='Click and Confirm Label Position Changes']/following::input)[1]"));
		
		Point location2=changepos.getLocation();		
		if(!(location.equals(location2))) {
			System.out.println("Position not been changed");
		}		
		else {
			System.out.println("Position been changed");
		}
		
		
		//Drop down suggestion
		
		WebElement search = driver.findElement(By.id("j_idt106:auto-complete_input"));
		search.sendKeys("venkatesh");		
	   WebElement select = driver.findElement(By.xpath("(//span[@class='ui-autocomplete-query'])[3]"));
	   select.click();
	   
	   //Type your DOB (mm/dd/yyyy) and confirm date chosen

	   WebElement dateofbirth = driver.findElement(By.id("j_idt106:j_idt116_input"));
	   
	   dateofbirth.sendKeys("24/05/1992",Keys.TAB);
	   
	  
	   //Type number and spin to confirm value changed
	   
	   WebElement spinelement = driver.findElement(By.xpath("//h5[text()='Type number and spin to confirm value changed']/following::input"));
	   spinelement.sendKeys("5");
	   String attr1=spinelement.getAttribute("value");
	   
	   WebElement dropdowntria = driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a[2]/span[1]/span[1]"));
	   dropdowntria.click();
	   String attr2=spinelement.getAttribute("value");
	   if(!(attr1.equals(attr2))) {
		   System.out.println("confirmed value changed");
	   }
	   else {
		   System.out.println("value not changed");
	   }
	   
	   //Type random number (1-100) and confirm slider moves correctly
	   
	   WebElement indicator = driver.findElement(By.xpath("//div[contains(@class,'ui-slider ui-corner-all')]//span[1]"));
	   Point loc1=indicator.getLocation();
	   
	   driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("50");
	   Point loc2=indicator.getLocation();
	   
	   if(!(loc1.equals(loc2))) {
			System.out.println("Position been changed");
		}		
		else {
			System.out.println("Position not been changed");
		}
	   
	   //Click and Confirm Keyboard appears
	   driver.findElement(By.id("j_idt106:j_idt122")).click();
	   Boolean keyboard=driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed();	   
		System.out.println(keyboard);
	   
	   // 16 Close the browser (Do not log out)

				driver.close();
		
				
	}

}
