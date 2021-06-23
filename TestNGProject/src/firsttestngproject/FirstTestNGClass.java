package firsttestngproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGClass {
	public WebDriver driver;
	public String ExpectedTitle = "Guru99 Bank Manager HomePage";
	public String ActualTitle ;
	public String CustomerCreationPage ;
	  @Test
	  public void openingBrowser() {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   System.out.println("opening chrome driver");
		  driver.manage().window().maximize();
		  driver.get("http://www.demo.guru99.com/V4/");
		  driver.findElement(By.name("uid")).sendKeys("mngr334527");
		  driver.findElement(By.name("password")).sendKeys("YdEraqY");
		  driver.findElement(By.name("btnLogin")).click();
		  ActualTitle = driver.getTitle();
		  System.out.println("Title of application:" +ActualTitle);
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  //New customer page
		  
		  driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
		  driver.findElement(By.name("name")).sendKeys("Priya");
		  driver.findElement(By.xpath("//input[@value='f']")).click();
		  driver.findElement(By.name("dob")).sendKeys("15121993");
		  driver.findElement(By.name("addr")).sendKeys("Ruby Homes Rajakilpakkam chennai");
		  driver.findElement(By.name("city")).sendKeys("Banglore");
		  driver.findElement(By.name("state")).sendKeys("TamilNadu");
		  driver.findElement(By.name("pinno")).sendKeys("600001");
		  driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
		  driver.findElement(By.name("emailid")).sendKeys("nnhjerk@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Naghul@123");
	   	 // driver.findElement(By.name("sub")).click();
	   	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	//  CustomerCreationPage = driver.getTitle();
	   	  
	   	  //View customer page
	   	  
	   	  System.out.println("Title after creating new customer is:" +CustomerCreationPage);
	   	  driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
	   	  
	   	  //Delete customer page
	   	  
	   	  /*driver.findElement(By.xpath("//a[normalize-space()='Delete Customer']")).click();
	   	  String DeleteCustomerPage = driver.getTitle();
	   	  System.out.println("Title of current page is :" +DeleteCustomerPage);
	   	  
	   	driver.findElement(By.name("cusid")).sendKeys("80647");
	   	driver.findElement(By.name("AccSubmit")).click();*/
	   	
	   	//New account
	   	  
	   	  driver.findElement(By.xpath("//a[normalize-space()='New Account']")).click();
	      String NewAccountPage = driver.getTitle();
	   	  System.out.println("Title of current page is :" +NewAccountPage);
	   	  
	   	 driver.findElement(By.name("cusid")).sendKeys("80647");
	   	 Select sel = new Select(driver.findElement(By.name("selaccount")));
	   	 sel.selectByVisibleText("Current");
	   	 driver.findElement(By.name("inideposit")).sendKeys("10000");
	   	 driver.findElement(By.name("button2")).click();
	   	 driver.navigate().back();
	   	 
	   	 
	   	 
	   	
	   	  
	   	  
	   	  
		 
	  
	  } 	}
 