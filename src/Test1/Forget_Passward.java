package Test1;
/**
* The SignUp program will help us to signup every new user
* We are using the inheritance to inherit the login class.
* @author  Rama Sharma
* @version  selenium 3 
* @since	9/18/2017 

*/

import org.openqa.selenium.By;

public class Forget_Passward extends Login
{

	public static void main(String[] args)
	{
	     //Create the constructor
		  Forget_Passward FP=new Forget_Passward();
		 //Inherit the login function
		   FP.log();
		
		   try
			{
				Thread.sleep(3000);
			} 
		
		catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		//Click on the forget password link
		 driver.findElement(By.xpath("//*[@id='to-recover']")).click();

	}

}
