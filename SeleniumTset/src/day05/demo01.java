package day05;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo01 {	
	static WebDriver driver;
	static String url;
	@AfterClass
	public void after(){
		
	}
	@BeforeClass
	public void setup(){
			 
	}
		@Test//登录
		public void alogin() {
			System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url="http://localhost:8080/Banksys_ssh/login.jsp";
		driver.get(url);				
		WebElement input1=driver.findElement(By.name("userNO"));
		input1.sendKeys("1545622515848");			
		WebElement input2=driver.findElement(By.name("password"));
		input2.sendKeys("123456");			
		driver.findElement(By.id("loginValidate_0")).click();
		} 
		
		@Test
		public void bqukuang1() {
			  driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1000");
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
		   	   WebElement s=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(s.getText());
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   	   WebElement aa=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(aa.getText());
		}
		/**第二次，输入大于余额的数字，打印错误提示。*/
		@Test
		public void cqukuang2() {
			 driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	   driver.switchTo().defaultContent(); 
		   	   driver.switchTo().frame(2);
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys("10000");
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
		   	   
			  
			   WebElement q=driver.findElement(By.xpath("/html/body/center"));
		       System.out.println(q.getText());			
	}
}	
