package hanjiazuoye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lianxi{
	   public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//����Qunar��Ʊ��ҳhttp://flight.qunar.com
			String url="http://flight.qunar.com";
			driver.get(url);
			driver.findElement(By.name("searchType")).click();
			driver.findElement(By.name("fromCity")).click();
	    	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[2]/a")).click();
	    	driver.findElement(By.name("toCity")).sendKeys("�Ϻ�");
	    	driver.findElement(By.className("btn_search")).click();
	   }
   }