package day3;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo01 {
  @Test
  public void w126() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/pop.html";
		driver.get(url);
		String s=driver.getWindowHandle();
	driver.findElement(By.linkText("click me")).click();
	Set<String>w=driver.getWindowHandles();//接收句柄
	for(String handle:w) {//随机在句柄中选取一个
		Thread.sleep(2000);
		driver.switchTo().window(handle);		
		String title=driver.getTitle();//通过所获取的标题来确定是否是我想要的
		if("百度一下，你就知道".equals(title)) {//如果是我想要的，就进行操作
			
			driver.findElement(By.name("wd")).sendKeys("小骚骚");
			driver.findElement(By.id("su")).click();	
	
		}
		
	}
	driver.switchTo().window(s);
		
  }
}
