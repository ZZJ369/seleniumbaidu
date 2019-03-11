package hanjiazuoye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dierci {
	static WebDriver driver;
	static String url;
    @BeforeTest
    public void setup() {
    System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
 	   driver=new ChromeDriver();
 	   url="http://localhost:8080/shop1";
    	 }
    @Test
    public void alogin() throws InterruptedException {
	 driver.get(url);
	 driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
	 driver.findElement(By.name("c_pass")).sendKeys("aaa");
	 driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();		   
	driver.findElement(By.linkText("意见反馈")).click();   
	
	
    }
    @Test(dependsOnMethods="alogin")
    public void goumai() {
    	driver.findElement(By.linkText("电脑专区")).click();
    	driver.findElement(By.className("btn_grey")).click();
    	driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
    	WebElement sl=driver.findElement(By.name("pay_fangshi"));
		Select s2=new Select(sl);
		s2.selectByValue("微信支付");
		//
		driver.findElement(By.name("pay_address")).sendKeys("江西南昌");
		driver.findElement(By.name("pay_email")).sendKeys("rwrew@123.com");
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
       driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[11]/td/table/tbody/tr[4]/td/input[1]")).click();
    }
    @AfterClass
    public void down() { 
    	driver.close();
    }
}
