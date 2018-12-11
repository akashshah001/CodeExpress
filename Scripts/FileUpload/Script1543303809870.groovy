import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://fineuploader.com/demos.html')
WebUI.uploadFile(findTestObject('Object Repository/up/s'), 'C:\\Users\\akash\\Desktop\\1.jpg')
WebUI.click(findTestObject('Object Repository/up/u'))





////WebUI.scrollToPosition(0, 1250)
////Normal Upload
//WebUI.uploadFile(findTestObject('Object Repository/Select'), 'C:\\Users\\akash\\Desktop\\1.jpg')
//
//WebUI.uploadFile(findTestObject('Object Repository/select2/Page_Fine Uploader Live Demo and Ja/input_Select files_qqfile'), 'C:\\Users\\akash\\Desktop\\1.jpg')
//
////WebUI.click(findTestObject('Object Repository/select2/Page_Fine Uploader Live Demo and Ja/button_Upload'))
////Actions actions = new Actions(DriverFactory.getWebDriver());
////actions.moveToElement(WebUiCommonHelper.findWebElement(findTestObject("Object Repository/Select1"), 30));
////actions.click();
////actions.sendKeys("C:\\Users\\akash\\Desktop\\1.jpg");
////actions.build().perform()