package day3;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo01 {
  @Test
  public void w126() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/pop.html";
		driver.get(url);
		String s=driver.getWindowHandle();
	driver.findElement(By.linkText("click me")).click();
	Set<String>w=driver.getWindowHandles();//���վ��
	for(String handle:w) {//����ھ����ѡȡһ��
		Thread.sleep(2000);
		driver.switchTo().window(handle);		
		String title=driver.getTitle();//ͨ������ȡ�ı�����ȷ���Ƿ�������Ҫ��
		if("�ٶ�һ�£����֪��".equals(title)) {//���������Ҫ�ģ��ͽ��в���
			
			driver.findElement(By.name("wd")).sendKeys("Сɧɧ");
			driver.findElement(By.id("su")).click();	
	
		}
		
	}
	driver.switchTo().window(s);
		
  }
}
