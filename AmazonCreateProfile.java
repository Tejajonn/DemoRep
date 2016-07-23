package tejaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCreateProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement element = driver.findElement(By.id("nav-link-yourAccount"));
		 
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
 
        driver.findElement(By.linkText("Start here.")).click();
        System.out.println(driver.getTitle());
        String handle =driver.getWindowHandle();
        driver.switchTo().window(handle);
       WebElement yourName = driver.findElement(By.id("ap_customer_name")); 
        yourName.clear();
        yourName.sendKeys("Teja");
        
        WebElement eMail = driver.findElement(By.id("ap_email")); 
        eMail.clear();
        eMail.sendKeys("tejaj27@gmail.com");
        
        WebElement passWord = driver.findElement(By.id("ap_password")); 
        passWord.clear();
        passWord.sendKeys("Jonnalgadda");
        
        WebElement passWordAgain = driver.findElement(By.id("ap_password_check")); 
        passWordAgain.clear();
        passWordAgain.sendKeys("Jonnalgadda");
        
        driver.findElement(By.id("continue")).click();
        String handle1 =driver.getWindowHandle();
        driver.switchTo().window(handle1);
        System.out.println(driver.getTitle());
        driver.quit();

	}

}