package stringProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SideMenuTestNG {
	
	@Test(priority = 1)
	public void verifyPageTitleTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  cdriver =new ChromeDriver();
		cdriver.get("https://ntpdev02.ntpdealer.com/login");
		
		/*cdriver.findElement(By.id("username")).sendKeys("Qadlrv");
		cdriver.findElement(By.id("password")).sendKeys("abcd1234");
		cdriver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(5000);
		
		cdriver.findElement(By.id("rpt")).click();
		
		Thread.sleep(5000);
		/*
		 * List<WebElement> subMenuCount
		 * =cdriver.findElements(By.xpath("//div[@class='sidebar']/ul[1]/li")); int i
		 * =subMenuCount.size(); System.out.println("total count of list-items==>"+i);
		 * for(WebElement subMenuItem:subMenuCount) {
		 * System.out.println("the list of submenu present===>   "+subMenuItem.getText()
		 * ); //System.out.println(cdriver.findElement(By.xpath(
		 * "//div[@class='sidebar']/ul/li/a[@class='nav-link']")).getText());
		 * if(subMenuItem.getText().equals("Position Summary")) {
		 * 
		 * subMenuItem.click(); } }
		 */
		/*subMenuList(cdriver,"Broker Order Register");
		
		Thread.sleep(5000);
		
		subMenuList(cdriver,"Markup Register");*/
		cdriver.quit();
	}
	
	@Test(priority = 2)
	public void verifyPageTitleTest1() throws InterruptedException {
		
		System.out.println("Pass");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver  cdriver =new ChromeDriver();
		Thread.sleep(5000);
		cdriver.get("https://ntpdev02.ntpdealer.com/login");Thread.sleep(5000);cdriver.quit();
	}
	
	@Test(priority = 2)
	public void verifyPageTitleTest2() throws InterruptedException  {
	
	System.out.println("Pass2 ");
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver  cdriver =new ChromeDriver();Thread.sleep(5000);
	cdriver.get("https://ntpdev02.ntpdealer.com/login");Thread.sleep(5000);cdriver.quit();
	}
	
	public static void subMenuList(WebDriver  cdriver,String subMenuList) {
		
		List<WebElement> subMenuCount =cdriver.findElements(By.xpath("//div[@class='sidebar']/ul[1]/li"));
		int i =subMenuCount.size();
		System.out.println("total count of list-items==>"+i);
		for(WebElement subMenuItem:subMenuCount) {
			System.out.println("the list of submenu present===>   "+subMenuItem.getText());
			//System.out.println(cdriver.findElement(By.xpath("//div[@class='sidebar']/ul/li/a[@class='nav-link']")).getText());
		 if(subMenuItem.getText().equals(subMenuList)) {
			 
			 subMenuItem.click();
		 }
		}
		
	}
	

}
