package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxione {
	@Test
	public void openbaidu() {
		String a="https://www.baidu.com";
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
		   WebDriver driver=new ChromeDriver();
		   driver.get(a);
		  // String b=driver.getTitle();
		  // System.out.println(b);//打印标题
		  // String c=driver.getCurrentUrl();
		   //System.out.println(c);
		   //WebElement input=driver.findElement(By.className("s_ipt"));
		  //input.sendKeys("selenium");
		   //WebElement buton=driver.findElement(By.id("su"));
		   //buton.click();
		  driver.findElement(By.linkText("新闻")).click();
	  driver.findElement(By.cssSelector("#imgView > a > img")).click();
	  //int y=driver.findElements(By.tagName("a")).size();
		  //System.out.println(y);
		  
	}

}
