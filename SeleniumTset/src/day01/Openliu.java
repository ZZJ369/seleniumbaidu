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
   //driver.get("http://www.baidu.com");//����ַ
   //driver.getCurrentUrl();
   String url1="http://www.baidu.com";
   String url2="http://www.v2ex.com";
   driver.get(url1);
   driver.manage().window().maximize();//�������
   
   driver.navigate().refresh();//ˢ��ҳ��
   
   Dimension dimension=new Dimension(900,800);
   driver.manage().window().setSize(dimension);
   driver.get(url2);
   driver.navigate().back();//��������
   String title1=driver.getTitle();
   System.out.println(title1);//��ӡ����
   
   String url11=driver.getCurrentUrl();
   System.out.println(url11);
   
   Thread.sleep(1000);//ͣ��10�룬��λ������
   driver.navigate().forward();//��ǰ
   
   String title2=driver.getTitle();
   System.out.println(title2);//��ӡ����
   
   String url22=driver.getCurrentUrl();
   System.out.println(url22);
	//System.setProperty("webdriver.firefox.bin", "D:\\�����ȫ����Ŀ¼\\firefox.exe");
	//WebDriver driver=new FirefoxDriver();
	
	}
}
