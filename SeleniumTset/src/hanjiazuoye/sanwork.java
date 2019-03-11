package hanjiazuoye;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1�� ����Qunar��Ʊ��ҳhttp://flight.qunar.com��ѡ�񡰵��̡������������������У�ѡ��today+7�պ�����ڣ��㡰����������ת����Ʊ���������б�ҳ�� 
2�� ���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�������������
3�� ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
4�� ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
*/

public class sanwork {

	@Test
	  public void w126() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//����Qunar��Ʊ��ҳhttp://flight.qunar.com
			String url="http://flight.qunar.com";
			driver.get(url);
			driver.findElement(By.name("searchType")).click();
		        WebElement from_date = driver
		                .findElement(By
		                        .xpath("//*[@id=\"fromDate\"]"));
		        WebElement sigleWayCheckBox = driver
		                .findElement(By
		                        .xpath("//div[@id='js_flighttype_tab_domestic']//input[@class='inp_chk js-searchtype-oneway']"));
		        if (!sigleWayCheckBox.isSelected()) {
		            sigleWayCheckBox.click();
		        }
		        
		        /*
		         * ѡ�񡰵��̡������������������У�
		         * ѡ��today+7�պ�����ڣ��㡰������
		         * ��ת����Ʊ���������б�ҳ�� 
		        */
	    	driver.findElement(By.name("fromCity")).click();
	    	driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/dl/dd/ul/li[2]/a")).click();
	    	driver.findElement(By.name("toCity")).sendKeys("�Ϻ�");
	    	
	    	 from_date.clear();
	         from_date.sendKeys(getDateAfterToday(7));
	         WebElement search = driver
	                 .findElement(By
	                         .xpath("//*[@id=\"dfsForm\"]/div[4]/button"));
	         search.submit();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	         WebElement page2 = driver.findElement(By
	                 .xpath("//*[@id=\"fromDate\"]"));
	         JavascriptExecutor jse = (JavascriptExecutor) driver;
	         jse.executeScript("arguments[0].scrollIntoView()", page2);
	         page2.click();
	         //���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�������������
               driver.findElement(By.className("btn_search")).click();
               driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
               
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
/*	         
	          ������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť��
	          ��չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ�� 
              ��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
	         */
	         driver.findElement(
	                 By.xpath("(//div[@class='avt_trans']//p[contains(text(),'ÿ�κ���������˰��')]/ancestor::div//div[@class='a_booking']/a)[3]"))
	                 .click();
	         driver.findElement(
	                 By.xpath("//div[@id='flightbarXI883']//div[@class='t_bk']/a"))
	                 .click();
	     }

	     public static String getDateAfterToday(int dateAfterToday) {
	         Calendar cal = Calendar.getInstance();
	         cal.add(Calendar.DATE, +dateAfterToday);
	         System.out.println(cal.getTime().toString());
	         Date date = cal.getTime();
	         SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	         System.out.println(df.format(date));
	         return df.format(date);
	     }
		 public static boolean isElementPresent(WebDriver driver, final By by,
		            int timeOut) throws InterruptedException {
		        boolean isPresent = false;
		        Thread.sleep(timeOut * 1000);
		        List we = (List) driver.findElements(by);
		        if (we.size() != 0) {
		            isPresent = true;
		        }
		        return isPresent;
		
}
}