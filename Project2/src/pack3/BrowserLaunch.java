package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\MayBatch Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		System.out.println("Hi...");
		
		
	}

}
