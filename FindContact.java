package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		
		//setup the chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		
		//Find the user name and enter the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Find the password and enter the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Find the submit button Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Find the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Find the Contact link
		driver.findElement(By.linkText("Contacts")).click();
		
		//Find the Find Contact  link
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Find the Email Tab
		driver.findElement(By.linkText("Email")).click();
	    
	   //Find the Email text box and enter the value
	   driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	   
	   //Find the Create Lead button and click
	   driver.findElement(By.className("x-btn-text")).click();
	   
	   
	  //get the tile 
	  String title = driver.getTitle();
	  System.out.println(title);
	   
	   //Close the browser
	   //driver.close();
		

	}

}
