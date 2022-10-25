package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	///	1. Navigate to https://erail.in/
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	///	2. Clear the text in source and enter "ms" and tab
	
		WebElement source = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		source.clear();
		source.sendKeys("MS",Keys.TAB);
		
	///	3. Clear the text in destination and enter "mdu" and tab
		
		WebElement dest = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		dest.clear();
		dest.sendKeys("MDU",Keys.TAB);
		
	///	4. Uncheck sort on date
		
		WebElement sortdate = driver.findElement(By.xpath("//table[@id='tableTopMenu']//tr[1]/td[6]/input[@id='chkSelectDateOnly']"));
		sortdate.click();
	
	///	5. Get all  the train names and verify whether any duplicate train name is there or not
		
		List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));

		int rowsize= trainnames.size();
		List<String> names=new ArrayList<String>();
		
		for (int i=2;i<=rowsize;i++) {
			
	String columndata = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
	names.add(columndata);	
	}
		
		Set<String> uniquenames= new LinkedHashSet<String>();
		
		for(String str:names){
			
			if(!uniquenames.add(str)) {
				System.out.println(str);
			}
			
		}
		if(names.size()!=uniquenames.size()) {
		System.out.println("Some Train Names are Duplicate");
		}
		else {
			System.out.println("No Train Names are Duplicate");
		}
		
}
	
}
