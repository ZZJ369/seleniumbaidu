package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Qiantai
{
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void setup()
		{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		driver=new ChromeDriver();//打开浏览器
		url="http://localhost:8080/Exam_ssh/";//进入网站
		}
	@Test(enabled=true)	
	public static void login()//登录
	{
		driver.get(url);
		driver.findElement(By.linkText("开始在线考试")).click();
		driver.findElement(By.name("stuNumber")).sendKeys("201700005658");
		driver.findElement(By.name("stuName")).sendKeys("章志杰");
		driver.findElement(By.name("B1")).click();
	}
	@Test(dependsOnMethods="login")
	public static void xuanzetype()//	选择考试类型
	{
		//chrome.switchTo().frame("beginForm");
		WebElement a=driver.findElement(By.name("examType"));
		  Select s1=new Select(a);
		   s1.selectByVisibleText("数学");
		driver.findElement(By.id("start_b")).click();
	}
	@Test(dependsOnMethods="xuanzetype")
	public static void kaoshi()//开始考试
	{
		 WebElement c=driver.findElement(By.name("questionOption"));
		   c.click();
		   WebElement d=driver.findElement(By.xpath("html/body/form/table/tbody/tr[4]/td[2]/div/input[1]"));
		   d.click();
		  
	}
	@AfterClass
	public void tearddown()//退出
	{
		 driver.close();
	}
}

