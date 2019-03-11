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
		 * 1,��̨
		��½--��ӿ�������--�������-������Ⲣ��ӡ-���ѧ��-���ȫ��ѧ������ӡ
		 */
		//�����¼���沢��¼
		driver.get("http://localhost:8080/Exam_ssh/");	
		driver.findElement(By.linkText("�����̨����")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		
		//��ӿ�������
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		driver.findElement(By.id("testName")).sendKeys("��ѧ");
		driver.findElement(By.id("testTime")).sendKeys("2018��12��30��");
		driver.findElement(By.name("submit")).click();
		
		//�������
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
		//��Ŀ
		driver.findElement(By.id("title")).sendKeys("1+1");
		//ѡ���Ŀ
		WebElement s=driver.findElement(By.name("examType"));
		Select s1=new Select(s);
		s1.selectByVisibleText("��ѧ");
		//ѡ������
		WebElement l=driver.findElement(By.name("note"));
		Select s2=new Select(l);
		s2.selectByValue("��ѡ��");
		//ѡ��
		driver.findElement(By.id("choices")).sendKeys("A.0 ��B.1 : C.2");
		//��
		driver.findElement(By.id("standardAnswer")).sendKeys("A");
		driver.findElement(By.name("submit")).click();
		
		//������Ⲣ��ӡ
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		WebElement a=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody"));
		System.out.println(a.getText());//��ӡ
		
		//���ѧ������
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		driver.findElement(By.id("id")).sendKeys("12345");
		driver.findElement(By.id("realname")).sendKeys("chu");
		driver.findElement(By.id("stuNumber")).sendKeys("12");
		driver.findElement(By.id("className")).sendKeys("170307");
		driver.findElement(By.id("address")).sendKeys("�ȷ�");
		driver.findElement(By.id("phone")).sendKeys("120");
		driver.findElement(By.id("email")).sendKeys("www.baidu.com");
		driver.findElement(By.id("humanId")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		//���ȫ��������Ϣ����ӡ
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
		WebElement b=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody"));
		System.out.println(b.getText());//��ӡ
	}
	
}
