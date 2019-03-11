package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo04 {
	/*
	 * 打开网址
	 * 拖动红色方块
	 * 到第一行上
*/
  @Test
  public void d() {
  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/day2/dragAndDrop.html";
	driver.get(url);
	
	WebElement f=driver.findElement(By.id("drag"));
	Actions ac=new Actions(driver);
	ac.dragAndDropBy(f, -190, -40).perform();
	
	
	
  }
}
