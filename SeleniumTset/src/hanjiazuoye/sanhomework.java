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

/*1、 访问Qunar机票首页http://flight.qunar.com，选择“单程”，输入出发、到达城市，选择today+7日后的日期，点“搜索”，跳转到机票单程搜索列表页。 
2、 在列表页停留1分钟，至到页面上出现“搜索结束”。
3、 如果出现航班列表，对于出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表中会出现“第一程”、 “第二程”；对于没有出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表底部中会出现“报价范围” 
4、 如果不出现航班列表，则页面会出现“该航线当前无可售航班”
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
    	driver.findElement(By.name("toCity")).sendKeys("上海");
    	
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
