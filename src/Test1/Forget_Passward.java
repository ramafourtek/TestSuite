package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Forget_Passward extends Login
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Forget_Passward FP=new Forget_Passward();
		FP.log();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='to-recover']")).click();

	}

}
