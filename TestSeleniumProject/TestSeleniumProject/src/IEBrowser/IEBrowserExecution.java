package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserExecution {
	public static void main(String[] args)
	{
		System.out.println("Launching IE Browser");
		
		System.setProperty("webdriver.ie.driver", "C:\\eclipse\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		System.out.println("Navigate to Facebook");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println("Test End");
		
		
	}

}
