package week2.day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver= new ChromeDriver();
     //Load the url http://leaftaps.com/opentaps/control/login
       driver.get("http://leaftaps.com/opentaps/control/login");
       
       //Maximize the browser
       driver.manage().window().maximize();
       
       //Enter Username
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
       
       //Enter the password
       driver.findElement(By.id("password")).sendKeys("crmsfa");
       
       //Click Login button
       driver.findElement(By.className("decorativeSubmit")).click();
       
       //Click on CRM/SFA
     	driver.findElement(By.linkText("CRM/SFA")).click();
     	
     	//Click on contacts
     	driver.findElement(By.linkText("Contacts")).click();
     	
     	//Click on create contact
     	driver.findElement(By.linkText("Create Contact")).click();
     	
     	//Enter First Name
     	driver.findElement(By.id("firstNameField")).sendKeys("Umesh");
     	
     	//Enter Last Name
     	driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
     	
     	//Click on create contact button
     	driver.findElement(By.className("smallSubmit")).click();
     	
     	//Print the first name and browser title
     	System.out.println("My first name : Umesh");
     	//String title = driver.getTitle();  
		System.out.println(driver.getTitle());

      
      
       
       
	}

}
