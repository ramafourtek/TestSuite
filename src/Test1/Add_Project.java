package Test1;

import org.openqa.selenium.By;

/**
* This code will help the user to login 
* @author  Rama Sharma
* @version  selenium 3 
* @since	9/18/2017

*/
public class Add_Project extends Login

{
	
	public static void main(String[] args) 
	{
	     //Create the constructor
		
		 Add_Project ad=new Add_Project();
		 //Inherit the login function
		   ad.log();
		   
		   //Clicling on the start button
		   driver.findElement(By.xpath("//*[@id='main-wrapper']/div/div/div[1]/div[4]/div/div/div/a")).click();
		
      
	}

}
