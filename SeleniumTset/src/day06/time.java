package day06;

import org.testng.annotations.Test;

public class time {
	@Test(timeOut=2000)
	public void dd() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("hello word");
	}

}
