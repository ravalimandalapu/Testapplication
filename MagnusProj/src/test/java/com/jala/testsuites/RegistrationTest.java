package com.jala.testsuites;

import org.testng.annotations.Test;

import com.jala.framework.BaseTest;

public class RegistrationTest extends BaseTest{
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

	@Test(priority =2)
	public void multipleTabs() throws Exception  {
		
		try {
			Thread.sleep(6000);
			pageObj.click(pageObj.Students_link, "on  students link menu");
			log.info("*************** Clicked on Students link menu    **************");
					
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
