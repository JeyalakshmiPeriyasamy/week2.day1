package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		
		//setup the chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//get the tile 
		String title = driver.getTitle();
		System.out.println(title);
		
		//Find the user name and enter the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Find the password and enter the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Find the submit button Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Find the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Find the Lead link
		driver.findElement(By.linkText("Leads")).click();
		
		//Find the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Find the CompanyName and enter the value
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technology");
	    
	   //Find the FirstName and enter the value
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeyalakshmi");
	   
	   //Find the LastName and enter the value
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periyasamy");
	   
	   
	   
	   //Step1: Find the dropdown element
	   WebElement eleDropDown =  driver.findElement(By.id("createLeadForm_dataSourceId"));
	   
	   //Step2: Convert that as a select class
	   Select select =new Select(eleDropDown);
	   
	   //Step3: Choose the value based on the option
	   select.selectByVisibleText("Conference");
	   
	   
	   
	   //Find the Create Lead button and click
	   driver.findElement(By.name("submitButton")).click();
	   
	   System.out.println(driver.findElement(By.id("viewLead_dataSources_sp")).getText());
	   
	   //Close the browser
	   //driver.close();
		

	}

}
