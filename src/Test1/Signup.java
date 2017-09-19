package Test1;

/**
* The SignUp program will help us to signup every new user
* We are using the inheritance to inherit the login class.
* @author  Rama Sharma
* @version  selenium 3 
* @since	9/18/2017 

*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup extends Login

{
	public static void main(String[] args) 
	{
      //Create the constructor
		Signup mm=new Signup();
		mm.log();
		try
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      //Click on the signup link
    	driver.findElement(By.xpath("//*[@id='loginform']/div[5]/div/p/a/b")).click();
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     //Sending first name value in text box
    	driver.findElement(By.id("first_name")).sendKeys("rama");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    // Sending last name value in the text box
    	driver.findElement(By.id("last_name")).sendKeys("sharma");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //Selecting the value of company
    	driver.findElement(By.id("company")).sendKeys("Testingcomplany");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //Selecting the value from the dropdown
        Select dp=new Select(driver.findElement(By.name("industry")));
        dp.selectByVisibleText("Computers/Technology/Software");
    //Sending the email address in the textbox
    	driver.findElement(By.id("email")).sendKeys("rama@fourtek.com");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //Sending the number in the textbox
    	driver.findElement(By.id("number")).sendKeys("1234567898");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //Sending the password in the textbox
    	driver.findElement(By.id("password")).sendKeys("Testingsite");
    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    //Sending the confirm password in the textbox
    	driver.findElement(By.id("password-confirm")).sendKeys("Testingsite");
		
	}
	

}
