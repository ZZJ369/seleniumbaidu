package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shouji {
@Test
public void opshouji() {
	String a="http://localhost:8080/mobile_mysql/index.jsp";
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
	   WebDriver driver=new ChromeDriver();
	   driver.get(a);
	   WebElement name=driver.findElement(By.name("name"));
		 name.sendKeys("111");
		 WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("111111");  
		   WebElement buton=driver.findElement(By.className("input1"));
		   buton.click();
}
}
