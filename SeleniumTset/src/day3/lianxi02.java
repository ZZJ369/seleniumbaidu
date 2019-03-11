package day3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lianxi02 {
/*
 * 打开百度
 * 鼠标移动到：更多产品
 * 点击下面任意一个链接
	
	
	*/
	@Test
	public void op() {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.baidu.com";
	driver.get(url);
	WebElement input=driver.findElement(By.linkText("更多产品"));
	Actions a=new Actions(driver);
    a.moveToElement(input).perform();
    //tj_nuomi
   driver.findElement(By.name("tj_nuomi")).click();
	
	}
}
