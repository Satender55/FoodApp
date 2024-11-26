package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logins {
	 WebDriver driver;
	 String expected;
	 String actual;
	 String username;
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
     	
     	expected =driver.getCurrentUrl();
     	Thread.sleep(5000);
     }
     	@Test(priority = 1)
     	 @Parameters({"username", "Password"})
     public void logiin(String username,String Password) throws InterruptedException
     	{
     		this.username=username;
     		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
    		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
    		driver.findElement(By.xpath("//button[.='Login']")).click();
    			
    		Thread.sleep(3000);   		 
    		actual=driver.getCurrentUrl();	
    
     	 }
         @Test(priority = 2)
     	public void checkLoginStatus() {
            if (expected.equals(actual)) {
                System.out.println(username + " is not logged in.");
            } else if(!expected.equalsIgnoreCase(actual)) {
            	
                System.out.println(username + " has successfully logged in.");
            }
         }
         @Test(priority = 3)
        public void loginfailed() throws InterruptedException
         {
        	Thread.sleep(3000);
         	driver.findElement(By.xpath("//button[.='OK']")).click();
         	Thread.sleep(2000);
         	driver.findElement(By.xpath("//input[@type='text']"));
         }
         
        

     	
     
}







