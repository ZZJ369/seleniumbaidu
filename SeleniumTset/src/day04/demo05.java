package day04;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class demo05 {
	/*
	 * 打开网址
	 * ctrl+s
	 * 点击取消
*/
  @Test
  public void d() throws AWTException, InterruptedException {
  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
	driver.get(url);
	
	WebElement f=driver.findElement(By.id("user"));
	Robot a=new Robot();
	a.keyPress(KeyEvent.VK_CONTROL);
	a.keyPress(KeyEvent.VK_S);
	Thread.sleep(2000);
	a.keyRelease(KeyEvent.VK_S);
	Thread.sleep(2000);
	a.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	a.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	a.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
  }
}
