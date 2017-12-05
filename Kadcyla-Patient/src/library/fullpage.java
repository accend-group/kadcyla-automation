package library;

import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class fullpage {
	public static void desktopScreenshot(WebDriver driver, String screenshotName) throws InterruptedException{
		
		Thread.sleep(1000);
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500, true)
		.withName(screenshotName)
		.save("C://Users//Marwin//Desktop//projects//KadcylaAutomation//Kadcyla-Patient//Screenshots//desktop");
		System.out.println("Screenshot Done on " + screenshotName);
	}
	public static void mobileScreenshots(WebDriver driver, String screenshotName) throws InterruptedException{
		
		Thread.sleep(1000);
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500, true)
		.withName(screenshotName)
		.save("C://Users//Marwin//Desktop//projects//KadcylaAutomation//Kadcyla-Patient//Screenshots//mobile");
		System.out.println("Screenshot Done on " + screenshotName);
	}
}
