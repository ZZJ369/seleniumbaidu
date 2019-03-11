package day3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo04 {
	 @Test
	   public void man() throws IOException, InterruptedException {
		   System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//第二种等待方式：全局等待
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/index.html";
			driver.get(url);
		    WebElement button=driver.findElement(By.className("wait"));
		    button.click();
		    //第一种等待方法 
		    //Thread.sleep(3000);		    
		    WebElement output=driver.findElement(By.className("red"));
		    System.out.println(output.getText());

		    
	   }
}
