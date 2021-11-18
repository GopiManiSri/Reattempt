package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.TestCase1Details;
import uistore.TestCase2Details;

public class TestCase2 extends ReadPropertyFile {

	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void testcase2() throws InterruptedException, IOException {

		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");
		TestCase1Details t1 = new TestCase1Details(driver);
		TestCase2Details tc = new TestCase2Details(driver);
		Thread.sleep(5000);
		t1.getpopup().click();
		tc.getFind().click();
		Thread.sleep(3000);
		if (tc.gettext().getText().contains("Discover the magic of Novotel Resorts!")) {
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
