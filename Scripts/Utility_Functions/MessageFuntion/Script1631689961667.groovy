Package MessageFunction

import org.eclipse.e4.core.services.nls.MessageFunction

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class UtilityFunctions {


	void verifyNotificationMessage(String dynamicId,String message) {
		String xpath1 = '//div[contains(text(),"'+dynamicId+'")]'
		TestObject to = new TestObject("objectName")
		to.addProperty("xpath",ConditionType.EQUALS,xpath1)

		'Waiting for element to be clickable'
		WebUI.waitForElementClickable(to, 5)
		WebUI.click(to)

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(to,message)

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(to,GlobalVariable.timeout)
	}

	public UtilityFunctions() {
		
	}
}
