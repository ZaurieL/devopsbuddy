package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18nService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {


	@Autowired
	private I18nService i18nService;

	@Test
	public void testMessageByLocalService() throws Exception {
		String expectedResult = "Bootstrap starter template 2";
		String messageId = "index.main.callout";
		String actualResult = i18nService.getMessage(messageId);
		Assert.assertEquals("Don't match", expectedResult, actualResult);
	}


}

