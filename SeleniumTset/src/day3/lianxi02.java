package day3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lianxi02 {
/*
 * �򿪰ٶ�
 * ����ƶ����������Ʒ
 * �����������һ������
	
	
	*/
	@Test
	public void op() {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.baidu.com";
	driver.get(url);
	WebElement input=driver.findElement(By.linkText("�����Ʒ"));
	Actions a=new Actions(driver);
    a.moveToElement(input).perform();
    //tj_nuomi
   driver.findElement(By.name("tj_nuomi")).click();
	
	}
}
