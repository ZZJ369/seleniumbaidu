package day01;

  import org.junit.Test;
  import org.openqa.selenium.Dimension;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;
public class Openliu {
	@Test
	public void open() throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
   WebDriver driver=new ChromeDriver();
   //driver.get("http://www.baidu.com");//打开网址
   //driver.getCurrentUrl();
   String url1="http://www.baidu.com";
   String url2="http://www.v2ex.com";
   driver.get(url1);
   driver.manage().window().maximize();//窗口最大化
   
   driver.navigate().refresh();//刷新页面
   
   Dimension dimension=new Dimension(900,800);
   driver.manage().window().setSize(dimension);
   driver.get(url2);
   driver.navigate().back();//浏览器向后
   String title1=driver.getTitle();
   System.out.println(title1);//打印标题
   
   String url11=driver.getCurrentUrl();
   System.out.println(url11);
   
   Thread.sleep(1000);//停留10秒，单位：毫秒
   driver.navigate().forward();//向前
   
   String title2=driver.getTitle();
   System.out.println(title2);//打印标题
   
   String url22=driver.getCurrentUrl();
   System.out.println(url22);
	//System.setProperty("webdriver.firefox.bin", "D:\\软件安全下载目录\\firefox.exe");
	//WebDriver driver=new FirefoxDriver();
	
	}
}
