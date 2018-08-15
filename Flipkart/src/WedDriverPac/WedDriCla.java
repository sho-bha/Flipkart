package WedDriverPac;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WedDriCla {

	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.gecko.driver";
	    String value = "./softwares/geckodriver.exe";
	    System.setProperty(key,value);
	    
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//div/input[@type='text'and @class='_2zrpKA']")).sendKeys("8884972711");
	    
	    driver.findElement(By.xpath("//div/input[@type='password'and @class='_2zrpKA _3v41xv']")).sendKeys("Welcome@123");
	    
	    driver.findElement(By.xpath("(//div/button[@type='submit'])[2]")).click();
	    
	    Thread.sleep(6000);
	    
	    WebElement ele = driver.findElement(By.xpath("//span[.='Women' and @class='_1QZ6fC _3Lgyp8']"));
	    
	    Actions ac = new Actions(driver);
	    
	    ac.moveToElement(ele).perform();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("(//li/a[@title='Watches'])[2]")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//label/div[.='Titan']")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//div[@class='_1GEhLw' and .='Women']")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("(//a[@class='_2cLu-l'])[3]")).click();
	    
	    Thread.sleep(6000);
	    
	    String win = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        allwindows.remove(win);
        for(String eachwindow : allwindows)
        {
        	driver.switchTo().window(eachwindow);
        	String title = driver.getTitle();
        	System.out.println(title);
        	
        }
        
        driver.findElement(By.xpath("//li/button")).click();
        
        Thread.sleep(4000);
        
        WebElement ele1 = driver.findElement(By.xpath("//div/span[contains(.,'My Cart')]"));
        
        Thread.sleep(2000);
        
        ele1.isDisplayed();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div/span[.='Remove']")).click();
        
        Thread.sleep(4000);
        
       // WebElement ele2 = driver.findElement(By.xpath("//div/div[@class='_1qL_13']"));
        
        WebElement el = driver.findElement(By.xpath("//div/span[contains(.,'My Cart')]"));
        
        el.isDisplayed();
        
        Thread.sleep(2000);
        
        //WebElement ele3 = driver.findElement(By.xpath("//span/div[.='My Account']"));
        
        //Actions acc = new Actions(driver);
       
        //acc.moveToElement(ele3).perform();
        driver.findElement(By.xpath("//span/div[.='My Account']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[.='Logout']")).click();
        
        driver.close();
        
        
	}
	
     
	  
}
	    
	  