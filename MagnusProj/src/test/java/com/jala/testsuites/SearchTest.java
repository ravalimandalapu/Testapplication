package com.jala.testsuites;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.jala.framework.BaseTest;
public class SearchTest extends BaseTest
{
Logger log = Logger.getLogger("devpinoyLogger");

/**
 * Date:17-05-2018
 * 
 */

@Test
public void validloginAdmin() throws Exception {
	try {
		
		System.out.println("First Test For More...............");
		
		log.info("*************** Entering login Admin with valid data **************");
		//Thread.sleep(6000);
		pageObj.loginAdmin();
		Thread.sleep(5000);
		
		log.info("*************** leaving login Admin**************");
		

	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	@Test(priority =1)
	public void search() throws Exception  {
		
		try {
			Thread.sleep(3000);
			log.info("*************** Clicking on search    **************");
		
		pageObj.click(pageObj.search, "on  Search Button");
		log.info("*************** search page displayed   **************");
		
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
}



}
