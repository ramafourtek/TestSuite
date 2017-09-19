package Test1;
/**
* This code will help the user to login 
* @author  Rama Sharma
* @version  selenium 3 
* @since	9/18/2017

*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login
{
	public static WebDriver driver;
	public static void log()
	{
		//Set the path of the geckodriver
		    System.setProperty("webdriver.gecko.driver","E:\\Rama\\2\\geckodriver.exe");
		      driver=new FirefoxDriver();
		  //Launching the browser  
	    	driver.get("http://test.devanagri.co.in/login");
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	driver.findElement(By.id("email")).sendKeys("tarunmanik@fourtek.com");
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	driver.findElement(By.id("password")).sendKeys("secret");
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 	
	    	driver.findElement(By.xpath("//*[@id='loginform']/div[4]/div/button")).click();

		}
	
	public static void main(String[] args) 
	{
		Login l=new Login();
		l.log();
		
		
	}

}
