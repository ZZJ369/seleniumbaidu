package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo02 {
	/*
	 * 打开网址
	 * 拖动红色方块
	 * 到指定位置上
*/
  @Test
  public void d() {
  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/dragAndDrop.html";
	driver.get(url);
	
	WebElement f=driver.findElement(By.xpath("//*[@id=\"drag\"]"));
	//WebElement w=driver.findElement(By.xpath("/html/body/h1"));
	Actions ac=new Actions(driver);
	ac.dragAndDropBy(f, -182, -30).perform();
	
	
  }
}
