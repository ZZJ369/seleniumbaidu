package hanjiazuoye;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*1�� ����Qunar��Ʊ��ҳhttp://flight.qunar.com��ѡ�񡰵��̡������������������У�ѡ��today+7�պ�����ڣ��㡰����������ת����Ʊ���������б�ҳ�� 
2�� ���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�������������
3�� ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
4�� ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
*/
public class sanhomework {
	static WebDriver driver;
	static String url;
	static String getDateAfterToday;
    @BeforeTest
    public void setup() {
    System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
 	   driver=new ChromeDriver();
 	   url="http://flight.qunar.com";
    	 }
    @Test
    public void login() {
    	driver.get(url);
    	driver.findElement(By.name("searchType")).click();
    	driver.findElement(By.name("fromCity")).click();
    	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[2]/a")).click();
    	driver.findElement(By.name("toCity")).sendKeys("�Ϻ�");
    	
    	WebElement date=driver.findElement(By.name("fromDate"));
    	 date.sendKeys(getDateAfterToday(7));
         WebElement search = driver
                 .findElement(By
                         .xpath("//div[@id='js_flighttype_tab_domestic']//button[@class='btn_search']"));
         search.submit();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         WebElement page2 = driver.findElement(By
                 .xpath("//div[@id='hdivPager']/a[@value='2']"));
         JavascriptExecutor jse = (JavascriptExecutor) driver;
         jse.executeScript("arguments[0].scrollIntoView()", page2);
         page2.click();
    
    }
	private CharSequence getDateAfterToday(int dateAfterToday) {
		
		 Calendar cal = Calendar.getInstance();	        
			cal.add(Calendar.DATE, +dateAfterToday);
	        System.out.println(cal.getTime().toString());
	        Date date = cal.getTime();
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        System.out.println(df.format(date));
	        return df.format(date);
	}	    
   
}
