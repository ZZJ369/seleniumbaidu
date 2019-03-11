package day04;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo03 {
	/*
	 * 
*/
  @Test
  public void d() {
  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
	driver.get(url);
	
	WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	//获取选择内容
	List<WebElement> option=select.findElements(By.tagName("option"));
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.CONTROL).click(option.get(2)).click(option.get(3)).perform();
	
	
  }
}
