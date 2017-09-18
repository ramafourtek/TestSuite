package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup extends Login

{
	public static void main(String[] args) 
	{

		Signup mm=new Signup();
		mm.log();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

    	driver.findElement(By.xpath("//*[@id='loginform']/div[5]/div/p/a/b")).click();
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("first_name")).sendKeys("rama");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("last_name")).sendKeys("sharma");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("company")).sendKeys("Testingcomplany");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select dp=new Select(driver.findElement(By.name("industry")));
        dp.selectByVisibleText("Computers/Technology/Software");
    	driver.findElement(By.id("email")).sendKeys("rama@fourtek.com");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("number")).sendKeys("1234567898");
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	driver.findElement(By.id("password")).sendKeys("Testingsite");
    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	driver.findElement(By.id("password-confirm")).sendKeys("Testingsite");
		
	}
	

}
