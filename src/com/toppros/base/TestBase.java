package com.toppros.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;

/**
 * Methods to launch browsers 
 * @author manjunathdj
 *
 */
public class TestBase {

	private static final Logger logger = Logger.getLogger(TestBase.class);
	public static WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void openBrowser(String browser, String url) throws Exception {

		if (logger.isDebugEnabled()) {
			logger.debug("entering openBrowser(String,String)");
			logger.debug("browser: \"" + browser + "\"");
			logger.debug("url: \"" + url + "\"");
		}
		BasicConfigurator.configure();

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
				driver.get(url);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				//driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

			}

		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting openBrowser()");
		}

	}

	@AfterMethod
	public static void closedriver() {
		if (logger.isDebugEnabled()) {
			logger.debug("entering closedriver()");
		}
		driver.quit();
		if (logger.isDebugEnabled()) {
			logger.debug("exiting closedriver()");
		}

	}
}

