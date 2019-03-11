 package day05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo02Test {
	@Test
	public void caozuo() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		 * 1,后台
		登陆--添加考试类型--添加试题-浏览试题并打印-添加学生-浏览全部学生并打印
		 */
		//进入登录界面并登录
		driver.get("http://localhost:8080/Exam_ssh/");	
		driver.findElement(By.linkText("进入后台管理")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		
		//添加考试类型
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		driver.findElement(By.id("testName")).sendKeys("数学");
		driver.findElement(By.id("testTime")).sendKeys("2018年12月30日");
		driver.findElement(By.name("submit")).click();
		
		//添加试题
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
		//题目
		driver.findElement(By.id("title")).sendKeys("1+1");
		//选择科目
		WebElement s=driver.findElement(By.name("examType"));
		Select s1=new Select(s);
		s1.selectByVisibleText("数学");
		//选择类型
		WebElement l=driver.findElement(By.name("note"));
		Select s2=new Select(l);
		s2.selectByValue("单选题");
		//选项
		driver.findElement(By.id("choices")).sendKeys("A.0 ：B.1 : C.2");
		//答案
		driver.findElement(By.id("standardAnswer")).sendKeys("A");
		driver.findElement(By.name("submit")).click();
		
		//浏览试题并打印
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		WebElement a=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody"));
		System.out.println(a.getText());//打印
		
		//添加学生数据
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		driver.findElement(By.id("id")).sendKeys("12345");
		driver.findElement(By.id("realname")).sendKeys("chu");
		driver.findElement(By.id("stuNumber")).sendKeys("12");
		driver.findElement(By.id("className")).sendKeys("170307");
		driver.findElement(By.id("address")).sendKeys("先锋");
		driver.findElement(By.id("phone")).sendKeys("120");
		driver.findElement(By.id("email")).sendKeys("www.baidu.com");
		driver.findElement(By.id("humanId")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		//浏览全部考试信息并打印
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
		WebElement b=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody"));
		System.out.println(b.getText());//打印
	}
	
}
