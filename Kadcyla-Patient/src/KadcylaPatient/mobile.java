package KadcylaPatient;

import java.util.HashMap;
import java.util.Map;

import library.fullpage;
import library.visiblescreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mobile {
	public static void automation() throws InterruptedException{
		Map<String, Object> mobile = new HashMap<>();
		mobile.put("width", 320);
		mobile.put("height", 720);
		mobile.put("pixelRatio", 1.0);

		Map<String, Object> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceMetrics", mobile);
		mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		chromeOptions.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(chromeOptions);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient.html");
		visiblescreen.mobileScreenshots(driver, "kadcyla-mobile-patient");
		
		driver.findElement(By.className("gene-component--header__toggle-icon--menu")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("gene-component--navigation__icon--tab")).click();
		visiblescreen.mobileScreenshots(driver, "kadcyla-mobile-hover-1.0");
		
		driver.navigate().refresh();
		driver.findElement(By.className("gene-component--header__toggle-icon--menu")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//nav/div/div[2]/div/ul/li[2]/a/i")).click();
		visiblescreen.mobileScreenshots(driver, "kadcyla-mobile-hover-2.0");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient.html");
		driver.findElement(By.className("gene-component--header__toggle-icon--menu")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//nav/div/div[2]/div/ul/li[3]/a/i")).click();
		visiblescreen.mobileScreenshots(driver, "kadcyla-mobile-hover-3.0");

		driver.get("http://localhost:4503/content/kadcyla/en_us/patient.html");
		jse.executeScript("window.scrollBy(0,3500)", "");
		driver.findElement(By.linkText("http://www.motherpregnancyregistry.com/")).click();
		visiblescreen.mobileScreenshots(driver, "kadcyla-mobile-link-modal");
		
//		//--->start full page screenshot <---//
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-0.0");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/her2-positive-breast-cancer.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-1.0");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/her2-positive-breast-cancer/what-is-her2-positive.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-1.1");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/her2-positive-breast-cancer/treatment.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-1.2");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/about-kadcyla.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-2.0");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/about-kadcyla/benefits-risks.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-2.2");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/about-kadcyla/talk-with-healthcare-team.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-2.3");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.0");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/4HER-patient-support-app.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.1");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/herconnection-support-program.html");
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.3");
		
		driver.findElement(By.name("first-name")).sendKeys("Marwin");
		driver.findElement(By.name("last-name")).sendKeys("Nicolas");
		driver.findElement(By.name("email-address")).sendKeys("marwin@accendgroup.com");
		driver.findElement(By.name("confirm_email-address")).sendKeys("marwin@accendgroup.com");
		driver.findElement(By.name("address-line-1")).sendKeys("CA");
		driver.findElement(By.name("address-line-2")).sendKeys("CA");
		driver.findElement(By.name("city")).sendKeys("CA");
		driver.findElement(By.className("gene-component--dropdown")).click();
		driver.findElement(By.xpath("//li[@data-value='AK']")).click();
		driver.findElement(By.name("zip-code-base")).sendKeys("99501");
		driver.findElement(By.name("primary-phone-number")).sendKeys("(02) 243-51-02");
		driver.findElement(By.name("verify-age")).click();
		driver.findElement(By.className("submit")).click();
	
		Thread.sleep(1000);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.3-submit");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/breast-cancer-support-groups.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.4");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/downloads.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.5");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/safety.html");
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-safety");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/site-map.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-sitemap");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/glossary.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-glossary");	
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/about-kadcyla/dosing-and-administration.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-2.1");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/financial-resources.html");
		remove(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/financial-resources.html");
		remove(driver);
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li/div[2]/fieldset/button")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat1-yes");
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[2]/div[2]/fieldset/button")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat2-yes");
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[3]/div[2]/fieldset/button[2]")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat3-no");
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[4]/div[2]/fieldset/button")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat4-yes");
		jse.executeScript("window.scrollTo(0, 0)");
		
		driver.findElement(By.className("start-over")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li/div[2]/fieldset/button[2]")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat1-no");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li/div[2]/fieldset/button")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[2]/div[2]/fieldset/button[2]")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat2-no");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/financial-resources.html");
		remove(driver);
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li/div[2]/fieldset/button")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[2]/div[2]/fieldset/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[3]/div[2]/fieldset/button")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat3-yes");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li/div[2]/fieldset/button")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[2]/div[2]/fieldset/button")).click();
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[3]/div[2]/fieldset/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//main/section[2]/div/div/div/div/div[2]/div/ul/li[4]/div[2]/fieldset/button[2]")).click();
		Thread.sleep(1000);
		movemouse(driver);
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-pat4-no");
		
		driver.get("http://localhost:4503/content/kadcyla/en_us/patient/support-resources/financial-resources.html");
		remove(driver);
		driver.findElement(By.className("gene-component--accordionTabs__item--q1")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab1");
		
		driver.findElement(By.className("gene-component--accordionTabs__item--q2")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab2");

		driver.findElement(By.className("gene-component--accordionTabs__item--q3")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab3");
		
		driver.findElement(By.className("gene-component--accordionTabs__item--q4")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab4");

		driver.findElement(By.className("gene-component--accordionTabs__item--q5")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab5");
		
		driver.findElement(By.className("gene-component--accordionTabs__item--q6")).click();
		fullpage.mobileScreenshots(driver, "kadcyla-mobile-3.2-tab6");
		driver.quit();
	}
	public static void remove(WebDriver driver) throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div/div"));
		js.executeScript("arguments[0].setAttribute('style', 'height:0% !important;')",element);
	}
	public static void movemouse(WebDriver driver){
		Actions action = new Actions(driver);
		WebElement element;
		
		element = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div[2]/div[1]/a[2]/i[1]"));
		action.moveToElement(element).build().perform();	
	}
}
