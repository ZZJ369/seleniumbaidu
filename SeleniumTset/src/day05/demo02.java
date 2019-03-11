package day05;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo02 {
	@Test
	public void pp() {
	  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="http://localhost:8080/Banksys_ssh/login.jsp";
			driver.get(url);
			
			   WebElement input=driver.findElement(By.id("loginValidate_userNO"));
		       input.sendKeys("1545622515848");
		       WebElement pad=driver.findElement(By.id("loginValidate_password"));
		       pad.sendKeys("123456");
		       WebElement button=driver.findElement(By.id("loginValidate_0"));
		       button.click(); 
		       
		       driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1000");
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
		   	   WebElement s=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(s.getText());
	           
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   	   WebElement aa=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(aa.getText());
		   	   		   	   	   
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	   driver.switchTo().defaultContent(); 
		   	   driver.switchTo().frame(2);
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys("10000");
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
		   	   
			  
			   WebElement q=driver.findElement(By.xpath("/html/body/center"));
		       System.out.println(q.getText());
	}
}
