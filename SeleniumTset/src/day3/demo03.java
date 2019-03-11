package day3;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class demo03 {
   @Test
   public void man() throws IOException {
	   System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/frame.html";
		driver.get(url);
		/*12--17
		 * 
		 * 
		 * 
		 * 
		
		*/
		driver.switchTo().frame("frame");
		//selenium½ØÍ¼
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//½«½ØÍ¼·Åµ½FÅÌ
		FileUtils.copyFile(jietu, new File("F:\\test.png") );
	
		WebElement input=driver.findElement(By.id("input1"));
		
	    input.sendKeys("Ð¡É§É§");
	    driver.switchTo().defaultContent();
	    WebElement output=driver.findElement(By.xpath("//*[@id=\"id1\"]"));
	    System.out.println(output.getText());

	    
   }
}
