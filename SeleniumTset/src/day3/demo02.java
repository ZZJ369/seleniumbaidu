package day3;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo02 {
  @Test
  public void w126() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
		driver.get(url);
		//driver.switchTo().frame("aa");第一种方式
		driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("骚波");
		//跳回到主页面，两种方法
		//跳回到父类   1---2---3
		//driver.switchTo().parentFrame();
		//直接跳到最外层   3---1
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("小骚骚");
		
  }
}

