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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://forum.katalon.com/discussion/1868/unknown-error-element-is-not-clickable-at-point-566-128')

WebUI.click(findTestObject('Object Repository/Page_unknown error Element is not c/a_Docs (1)'))

WebUI.switchToWindowTitle('Home | Katalon Docs')

WebUI.click(findTestObject('Page_Home  Katalon Docs/a_How to contribute'))

WebUI.click(findTestObject('Page_Home  Katalon Docs/a_Products'))

WebUI.switchToWindowTitle('unknown error: Element is not clickable at point (566, 128) - Katalon Q&A')

WebUI.click(findTestObject('Object Repository/Page_unknown error Element is not c/a_How to import Selenium IDE t'))

WebUI.click(findTestObject('Object Repository/Page_How to import Selenium IDE tes/a_Quote'))


