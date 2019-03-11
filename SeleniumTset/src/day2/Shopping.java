package day2;


import java.util.Iterator;
import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping {
	@Test
	public void shop() throws InterruptedException {
		String mn="http://localhost:8080/mobile_mysql/index.jsp";
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
		   WebDriver driver=new ChromeDriver();
		   driver.get(mn);
		   //用户登录
		   WebElement usename=driver.findElement(By.name("name"));
			 usename.sendKeys("1111");
			 WebElement psd=driver.findElement(By.name("password"));
			 psd.sendKeys("111111"); 
			   WebElement buton=driver.findElement(By.className("input1"));
			   buton.click();			   
			   //选取喜欢的手机加入购物车
			   WebElement s=driver.findElement(By.linkText("查看详细内容"));
					   s.click();
					   
					   
					   //多窗口问题解决
					   String current_handle = driver.getWindowHandle();
					   //打开新窗口后获取所有窗口的句柄，
					   Set all_handles = driver.getWindowHandles();
					  // 通过循环判断是不是当前的窗口句柄，
					   Iterator<String> it = ((java.util.Set<String>) all_handles).iterator();
					   while(it.hasNext()){
					   if(it.next() == current_handle){
					   continue;
					   }
					   WebDriver new_driver = driver.switchTo().window(it.next());
					   }
					   Thread.sleep(1000);
					   WebElement c=driver.findElement(By.name("Submit"));
					      c.click();
					      Thread.sleep(1000);
					      Alert c1=driver.switchTo().alert();
					      c1.dismiss();		
					      Thread.sleep(1000);
					      //回到原来的窗口
					      driver.switchTo().window(current_handle);
					      
					      WebElement k1=driver.findElement(By.linkText("查看订单"));
						   k1.click();
						   Thread.sleep(1000);   
			   WebElement c2=driver.findElement(By.linkText("购物车"));
			   c2.click();
			   WebElement q=driver.findElement(By.linkText("去收银台结账"));
			   q.click();
			   WebElement ass=driver.findElement(By.name("address"));
				 ass.sendKeys("11111");
				 WebElement tel=driver.findElement(By.name("tel"));
				 tel.sendKeys("11111");				 
				 WebElement m=driver.findElement(By.name("setMoney"));
				    Select m1=new Select(m);
				    m1.selectByVisibleText("邮政付款");
					 WebElement p=driver.findElement(By.className("textarea"));
					    Select p1=new Select(p);
					    p1.selectByIndex(2);
					    WebElement z=driver.findElement(By.name("bz"));
						 z.sendKeys("11111");
					    WebElement b=driver.findElement(By.name("Submit2"));
						   b.click();
						   Alert b1=driver.switchTo().alert();
						   b1.accept();
						   b1.accept();	
						   Thread.sleep(1000);   
						   WebElement k=driver.findElement(By.linkText("查看订单"));
						   k.click();
						   Thread.sleep(1000);   
				 
			   
	}
}
