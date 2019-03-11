package day2;



import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Caozuo {
	public static WebDriver driver;
	 public static String url;
@Test
public void open() throws InterruptedException, MalformedURLException {
	DesiredCapabilities a=DesiredCapabilities.chrome();
	driver=new RemoteWebDriver(new URL("http://192.168.123.1:4654/wd/hub"),a);
	url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
	driver.get(url);
	WebElement input=driver.findElement(By.id("user"));
       input.sendKeys("小骚骚");
       WebElement s=driver.findElement(By.id("moreSelect"));
       Select s1=new Select(s);
       //第一种方法，按照索引来选，第一个选择的内容从零开始
       //s1.selectByIndex(3); 
       //第二种方法，根据Value属性来选择  <input type="checkbox" name="checkbox3">
       //s1.selectByValue("vivo");<input type="checkbox" name="checkbox1">
       //第三种方法，通过看见的值  <input type="radio" name="identity" class="Saab">
       Thread.sleep(3000);
       s1.selectByVisibleText("huawei");
       WebElement r=driver.findElement(By.className("Saab"));
       System.out.println(r.isSelected());
       r.click();
      // r.isSelected();
       System.out.println(r.isSelected());
       WebElement r1=driver.findElement(By.name("checkbox1"));
       if(!r1.isSelected()) {//如果r1没有被点击，那么就帮他点击
       r1.click();}
       
       WebElement r2=driver.findElement(By.name("checkbox3"));
       r2.click();//
       WebElement b=driver.findElement(By.name("buttonhtml"));
      System.out.println(b.isEnabled());
     // assertTrue("false",b.isEnabled());
      WebElement b1=driver.findElement(By.className("alert"));
      b1.click(); 
      Thread.sleep(3000);
      Alert alert=driver.switchTo().alert();
      alert.accept();
      WebElement c=driver.findElement(By.className("confirm"));
      c.click();
      Alert c1=driver.switchTo().alert();
      c1.dismiss();
      Thread.sleep(3000);
      c1.accept();
      
      //输入后再点击 
      WebElement p=driver.findElement(By.className("prompt"));
      p.click();
      Alert p1=driver.switchTo().alert();
      p1.sendKeys("哈哈");
      System.out.println(p1.getText()); 
      Thread.sleep(3000);
      p1.accept();
      p1.accept();
      
      
      //定义文件路径
      String lu="F:\\演讲稿\\qtp项目答辩.docx";
      WebElement up=driver.findElement(By.id("load"));
      up.sendKeys(lu);
      
      
      
      
      
}
}












