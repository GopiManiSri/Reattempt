package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.TestCase1Details;

public class TestCase1 extends ReadPropertyFile {

	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void testCase1() throws InterruptedException {

		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");

		TestCase1Details t1 = new TestCase1Details(driver);
		Thread.sleep(5000);
		t1.getpopup().click();
		t1.getDestination().sendKeys("Bengaluru");
		Thread.sleep(2000);
		t1.getDestination().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		t1.getSearch().click();
		Thread.sleep(3000);
		if (t1.getHotel().getText().contains("Bengaluru")) {

			System.out.println("Present");
			log.info("Desired item found in  page");
		}

	}

	@AfterTest
	public void close() {

		driver.close();
		driver = null;

	}

}
