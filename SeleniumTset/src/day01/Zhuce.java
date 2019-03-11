package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zhuce {
@Test
public void openall() throws InterruptedException{
	String mn="http://localhost:8080/mobile_mysql/index.jsp";
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
	   WebDriver driver=new ChromeDriver();
	   driver.get(mn);
	   driver.findElement(By.linkText("×¢²á")).click();
	   WebElement name=driver.findElement(By.name("name"));
		 name.sendKeys("11111");
		 Thread.sleep(10000);
		 WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("111111");
		 Thread.sleep(10000);
		 WebElement passwordone=driver.findElement(By.name("passwordOne"));
		 passwordone.sendKeys("111111");
		 Thread.sleep(10000);
		 WebElement reallyname=driver.findElement(By.name("reallyName"));
		 reallyname.sendKeys("111");
		 Thread.sleep(10000);
		 WebElement age=driver.findElement(By.name("age"));
		 age.sendKeys("1");
		 Thread.sleep(10000);
		 WebElement profession=driver.findElement(By.name("profession"));
		 profession.sendKeys("Ñ§Éú");
		 Thread.sleep(10000);
		 WebElement email=driver.findElement(By.name("email"));
		 email.sendKeys("2298644127@qq.com");
		 Thread.sleep(10000);
		 WebElement question=driver.findElement(By.name("question"));
		 question.sendKeys("111");
		 Thread.sleep(10000);
		 WebElement result=driver.findElement(By.name("result"));
		 result.sendKeys("111");
		 Thread.sleep(10000);
		 WebElement button=driver.findElement(By.className("input1"));
		   button.click();
		   Thread.sleep(10000);
		   WebElement usename=driver.findElement(By.name("name"));
			 usename.sendKeys("1111");
			 WebElement psd=driver.findElement(By.name("password"));
			 psd.sendKeys("111111"); 
			   WebElement buton=driver.findElement(By.className("input1"));
			   buton.click();
}
}









