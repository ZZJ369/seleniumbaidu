package hanjiazuoye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * ��̨��
һ�����һ����Ʒ������
����ɾ������
������������
*/
public class houtai {
//
	static WebDriver driver;
	static String url;
    @BeforeTest
    public void setup() {
    System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");	
 	   driver=new ChromeDriver();
 	   url="http://localhost:8080/shop1/admin/index.jsp";	   
    	 }
       @Test
    public void Alogin() {
    	driver.get(url);
    	driver.findElement(By.name("a_name")).sendKeys("admin");
    	driver.findElement(By.name("a_pass")).sendKeys("admin");
    	driver.findElement(By.name("submit2")).click();
 	
    }
   @Test(dependsOnMethods="Alogin") //���һ����Ʒ������
    public void Btianjia() {
    	driver.switchTo().frame(0);   	
    	driver.switchTo().frame("Left");
    	driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
    	driver.switchTo().parentFrame();
    	driver.switchTo().frame("Rigth");
    	driver.findElement(By.name("t_name")).sendKeys("������Ʒ");
    	driver.findElement(By.className("STYLE1")).click();
    }
   @Test(dependsOnMethods="Btianjia") //ɾ������
   public void Csanchu() {
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(0);   	
   	driver.switchTo().frame("Left");
   	driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
   	driver.switchTo().parentFrame();
	driver.switchTo().frame("Rigth");
	driver.findElement(By.linkText("ɾ��")).click();
   }
   @Test(dependsOnMethods="Csanchu") //��������
   public void Dfabu() {
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(0);   	
   	driver.switchTo().frame("Left");
   	driver.findElement(By.linkText("��������")).click();
   	driver.switchTo().parentFrame();
	driver.switchTo().frame("Rigth");
	driver.findElement(By.name("n_message")).sendKeys("�����ҵ�ܼ�");
	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
   }
   @AfterClass
   public void down() { 
   	driver.close();
   }
}
