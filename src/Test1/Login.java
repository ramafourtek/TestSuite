package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login
{
	public static WebDriver driver;
	public static void log()
	{
		    System.setProperty("webdriver.gecko.driver","E:\\Rama\\2\\geckodriver.exe");
		      driver=new FirefoxDriver();
	    	driver.get("http://test.devanagri.co.in/login");
	    	//System.out.println("Application title is ============="+driver.getTitle());
	    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
	public static void main(String[] args) 
	{
		Login l=new Login();
		l.log();
		
		
	}

}
