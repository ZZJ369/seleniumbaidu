package day2;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Twoday {
@Test
public void openall() {
	System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//<input name="account" id="accountID" type="text" value="">
	String url="file:///F:/%E6%B5%8B%E8%AF%95%E6%95%99%E6%A1%88/selenium%E6%95%99%E6%A1%88/%E9%A1%B5%E9%9D%A2/autotest.html";
	driver.get(url);
	WebElement input=driver.findElement(By.id("accountID"));
    input.sendKeys("Сɧɧ");

    
    //<input name="password" id="passwordID" type="password" value="">
    WebElement input1=driver.findElement(By.id("passwordID"));
    input1.sendKeys("Сɧɧ");
    //<select class="u17" id="areaID">
//	  <option value="">&nbsp;</option>
//	  <option value="beijing">������</option>
//	  <option value="tianjin">�����</option>
//	  <option value="shanxi">����ʡ</option>
// </select>
//  
    WebElement s2=driver.findElement(By.id("areaID"));
    Select s3=new Select(s2);
    s3.selectByIndex(2); 
    
    //<input name="u2" id="sexID2" type="radio">
    WebElement s=driver.findElement(By.id("sexID2"));
    s.click(); 
    //<td>
//    �ļ���
//    <input id="u1" type="checkbox" value="spring">��
//    <input id="u2" type="checkbox" value="summer">��
//    <input id="u3" type="checkbox" value="Auterm">��
//    <input id="u4" type="checkbox" value="winter">��
//    </td>
    
    WebElement b=driver.findElement(By.id("u2"));
   b.click();
    WebElement b1=driver.findElement(By.id("u3"));
    b1.click();
    WebElement b2=driver.findElement(By.id("u4"));
    b2.click();
    //<input name="file" type="file">
    String lu="F:\\�ݽ���\\qtp��Ŀ���.docx";
    WebElement up=driver.findElement(By.name("file"));
    up.sendKeys(lu);
    
    //<input class="u16" id="buttonID" type="button" value="submit" onclick="return toAlert()">
    WebElement c=driver.findElement(By.id("buttonID"));
    c.click();
    Alert c1=driver.switchTo().alert();
    c1.dismiss();
}
}
