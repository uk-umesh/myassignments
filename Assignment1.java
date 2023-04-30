package week2.day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver= new ChromeDriver();
       driver.get("http:leaftaps.com/opentaps/");
       //maximize the browser
       driver.manage().window().maximize();
       //find the element username and enter username
       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
       //find the element password and enter password 
       driver.findElement (By.id("password")).sendKeys("crmsfa");
		//click login button 
       driver.findElement(By.className("decorativeSubmit")).click();
       //click on CRM/SFA link
       driver.findElement(By.partialLinkText("CRM")).click();
       //click on leads button 
       driver.findElement(By.linkText("Leads")).click();
       //click on create lead 
       driver.findElement(By.partialLinkText("Create Lead")).click();
       //enter company name field using id locator 
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleafumesh");
       //enter first name 
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Umesh");
       //enter lastname 
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
       //enter firstnamelocal 
       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("UK");
       //enter departmentfield 
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
       //enter description
       driver.findElement(By.id("createLeadForm_description")).sendKeys("Marketing Researc and Analytics professional");
       //enter email address 
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Umeshkr218@gmail.com");
       //click on create button 
       driver.findElement(By.name("submitButton")).click();
       //get title of resulting page 
       String title = driver.getTitle();
       System.out.println(title);
    
       
       
       
		
		
		
		
	}

}
