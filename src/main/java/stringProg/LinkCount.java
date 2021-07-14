package stringProg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	static WebDriver cdriver;
	
	public static boolean isElementPresent(String locator)
	{
		try {
			cdriver.findElement(By.xpath(locator));
			return true;
		}catch(Throwable t) {
			return false;
			//System.out.println(t);
		}
	}
	public static void main(String[] args) throws Throwable {
		
		
		String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver cdriver =new ChromeDriver();
		cdriver.get("https://www.wikipedia.org/");
		
		List<WebElement> links =cdriver.findElements(By.tagName("a"));
		System.out.println("the Count of the link are=  "+links.size());
		for(WebElement link:links) {
			System.out.println(link.getText()+" the url are===>  "+link.getAttribute("href"));
			//Iterator<WebElement> it = links.iterator();
			//url = it.next().getAttribute("href");
			url=link.getAttribute("href");
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				                continue;
				            }
			try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+"status code ==>"+huc.getResponseCode()+"   is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
		}
	}
		cdriver.quit();
}
}
