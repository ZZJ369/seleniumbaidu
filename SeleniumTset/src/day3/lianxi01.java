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
import org.openqa.selenium.interactions.Actions;

public class lianxi01 {
/*
 * 打开百度，对准输入框点击右键
 * 截图
 * 	*/
	@Test
	public void openb() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
		WebElement input=driver.findElement(By.name("wd"));
		Actions ac=new Actions(driver);
        ac.contextClick(input).perform();
        Thread.sleep(8000);
        File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jietu, new File("F:\\baidu.png"));
	}
}
