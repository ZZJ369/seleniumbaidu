package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lianxitow {
   @Test
   public void openall() {
	   String i="https://www.baidu.com";
	   String x="https://www.v2ex.com";
	   System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
	   WebDriver driver=new ChromeDriver();   
	   driver.get(i);	  
	   driver.navigate().forward();//�������ǰ	
	   
	   driver.get(x);
	   driver.manage().window().maximize();	  	   
	   driver.navigate().back();	   
	   String y=driver.getTitle();
	   System.out.println(y);//��ӡ����
	   driver.navigate().forward();
	   String n=driver.getTitle();
	   System.out.println(n);//��ӡ����
	   
   }
   
}
