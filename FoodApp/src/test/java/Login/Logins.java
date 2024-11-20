package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logins {
	 WebDriver driver;
     @Test(priority = 0)
     @Parameters("browser")
     public void setup(String browser) throws InterruptedException
     {
     	if(browser.equalsIgnoreCase("chrome")) {
     		driver=new ChromeDriver();
     		driver.manage().window().maximize();
     		driver.get("http://13.127.212.148/#/login");
     	}
     	else if(browser.equalsIgnoreCase("edge"))
     	{
     		driver=new EdgeDriver();
     		driver.manage().window().maximize();
     		driver.get("http://13.127.212.148/#/login");
     	}
     	
     	Thread.sleep(5000);
     }
     	@Test(priority = 1)
     public void logiin() throws InterruptedException
     	{
     		String expected =driver.getCurrentUrl();
     		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("use");
    		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pas122");
    		driver.findElement(By.xpath("//button[.='Login']")).click();
    		
    		Thread.sleep(5000);
    		
    		 
    		String actual=driver.getCurrentUrl();
    		
    		
    		Assert.assertNotEquals(expected, actual);
    		
    		 System.out.println("login is successfully verified");
    		
    		
    	
    
     	}
     	
     }







