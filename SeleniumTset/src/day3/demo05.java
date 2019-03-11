package day3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class demo05 {
@Test
public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
	driver.get(url);
	//user
	//WebElement input=driver.findElement(By.id("user"));
	//Actions ac=new Actions(driver);
//	ac.contextClick(input).perform();
//	Thread.sleep(2000);
	//ac.contextClick().perform();//¹È¸èÔÚ×óÉÏ½ÇÓÒ»÷
//	 WebElement button=driver.findElement(By.className("wait"));
//	    Actions ac=new Actions(driver);
//	    ac.doubleClick(button).perform();
//	    Thread.sleep(2000);
//	    WebElement output=driver.findElement(By.className("red"));
//	    System.out.println(output.getText());
	
	WebElement input=driver.findElement(By.className("over"));
	Actions ac=new Actions(driver);
	ac.moveToElement(input).perform();//
	Thread.sleep(2000);
	WebElement output=driver.findElement(By.id("over"));
	
	System.out.println(output.getText());
}
}
