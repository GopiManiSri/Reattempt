package pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;

public class HomePage extends ReadPropertyFile{
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException {
		
		driver=DriverInitialisation();
	}
	
	@Test
	public void logintest() throws InterruptedException {
		
		
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");	
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
		driver=null;
		
	}

}
