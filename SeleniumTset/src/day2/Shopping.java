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
		   //�û���¼
		   WebElement usename=driver.findElement(By.name("name"));
			 usename.sendKeys("1111");
			 WebElement psd=driver.findElement(By.name("password"));
			 psd.sendKeys("111111"); 
			   WebElement buton=driver.findElement(By.className("input1"));
			   buton.click();			   
			   //ѡȡϲ�����ֻ����빺�ﳵ
			   WebElement s=driver.findElement(By.linkText("�鿴��ϸ����"));
					   s.click();
					   
					   
					   //�ര��������
					   String current_handle = driver.getWindowHandle();
					   //���´��ں��ȡ���д��ڵľ����
					   Set all_handles = driver.getWindowHandles();
					  // ͨ��ѭ���ж��ǲ��ǵ�ǰ�Ĵ��ھ����
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
					      //�ص�ԭ���Ĵ���
					      driver.switchTo().window(current_handle);
					      
					      WebElement k1=driver.findElement(By.linkText("�鿴����"));
						   k1.click();
						   Thread.sleep(1000);   
			   WebElement c2=driver.findElement(By.linkText("���ﳵ"));
			   c2.click();
			   WebElement q=driver.findElement(By.linkText("ȥ����̨����"));
			   q.click();
			   WebElement ass=driver.findElement(By.name("address"));
				 ass.sendKeys("11111");
				 WebElement tel=driver.findElement(By.name("tel"));
				 tel.sendKeys("11111");				 
				 WebElement m=driver.findElement(By.name("setMoney"));
				    Select m1=new Select(m);
				    m1.selectByVisibleText("��������");
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
						   WebElement k=driver.findElement(By.linkText("�鿴����"));
						   k.click();
						   Thread.sleep(1000);   
				 
			   
	}
}
