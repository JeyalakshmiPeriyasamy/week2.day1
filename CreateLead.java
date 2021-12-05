package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		
		//Find the Lead link
		driver.findElement(By.linkText("Leads")).click();
		
		//Find the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//************************* Create Lead Information ***************************
		
		//Find the CompanyName and enter the value
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technology");
	    
	   //Find the FirstName and enter the value
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeyalakshmi");
	   
	   //Find the LastName and enter the value
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periyasamy");
	   
	  //Find the Date of Birth and enter the value
	  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("7/7/85");
	  
	  
	  
	  
	   //Find the First Name (Local) and enter the value
	   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jeyalakshmi");
	   
	 //Find the Last Name (Local) and enter the value
	   driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Periyasamy");
	   
	 //Find the Salutation and enter the value
	   driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	   
	 //Find the Title and enter the value
	   driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Jeya");
	   
	 //Find the Department and enter the value
	   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	   
	 //Find the Annual Revenue and enter the value
	   driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
	   
	 //Find the Number Of Employees and enter the value
	   driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
	   
	 //Find the SIC Code and enter the value
	   driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5555555");
	   
	 //Find the Ticker Symbol and enter the value
	   driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("aaaa");

	 //Find the Description and enter the value
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("Description Description Description Description Description ");
	   
	 //Find the Important Note and enter the value
	   driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nothing");
	   
	    //Find the Source dropdown and select the source
	    WebElement eleSourceDropDown =  driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select selectSource =new Select(eleSourceDropDown);
	    selectSource.selectByVisibleText("Conference");
	    
	  //Find the Marketing Campaign and select the Marketing Campaign
	    WebElement eleMarketingDropDown =  driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select selectMarketing =new Select(eleMarketingDropDown);
	    selectMarketing.selectByVisibleText("Automobile");
	    
	    
	    //Find the Preferred Currency and select the Preferred Currency
	    WebElement eleCurrencyDropDown =  driver.findElement(By.id("createLeadForm_currencyUomId"));
	    Select selectCurrency =new Select(eleCurrencyDropDown);
	    selectCurrency.selectByVisibleText("USD - American Dollar");
	    
	    
	    //Find the Industry dropdown and select the Industry
	    WebElement eleIndustryDropDown =  driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select selectIndustry =new Select(eleIndustryDropDown);
	    selectIndustry.selectByVisibleText("Distribution");
	    
	    //Find the Ownership dropdown and select the Ownership
	    WebElement eleOwnershipDropDown =  driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select selectOwnership =new Select(eleOwnershipDropDown);
	    selectOwnership.selectByVisibleText("Partnership");
	   
	   
	   
	  
	  
	  //*********************Contact Information*********************
	  
	  //Find the Date of Birth and enter the value
	  driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
	  
	  //Find the Area Code and enter the value
	  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0442");
	  
	  //Find the Extension and enter the value
	  driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("111");
	   
	  //Find the Extension and enter the value
	  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aaa@com.com");
	   
	  //Find the Primary phone number and enter the value
	  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2222222222");
	  
	  //Find the Person to as so for and enter the value
	  driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("friend");
	  
	  //Find the Web URL and enter the value
	  driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testabc.com");
	  
	  
	  //*********************Primary Address*********************
	  
	  //Find the To Name and enter the value
	  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Jeyalakshmi");
	  
	 //Find the Attention Name and enter the value
	  driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Periyasamy");
	  
	  //Find the Address Line1 and enter the value
	  driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("cccccccccccc");
	  
	  //Find the Address Line2 and enter the value
	  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ddddddddd");
	  
	  //Find the City and enter the value
	  driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
	  
	 //Find the Post Code and enter the value
	  driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("73");
	  
	 //Find the Post Code Extension and enter the value
	  driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6000");
	 
	  //Find the State dropdown and select the state name
	    WebElement eleStateDropDown =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select selectState =new Select(eleStateDropDown);
	    selectState.selectByVisibleText("Alaska");
	   
	  //Find the Country dropdown and select the Country name
	    WebElement eleCountryDropDown =  driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select selectCountry =new Select(eleCountryDropDown);
	    selectCountry.selectByVisibleText("United States");
	   
	   //Find the Create Lead button and click
	   driver.findElement(By.name("submitButton")).click();
	   
	   //Print the first Name
	   System.out.println("First Name: "+driver.findElement(By.id("viewLead_firstName_sp")).getText());
	   
	   //get the tile 
	   String title = driver.getTitle();
	   System.out.println("\nPage Title: "+(title));
	   
	   //Close the browser
	   //driver.close();
		

	}

}
