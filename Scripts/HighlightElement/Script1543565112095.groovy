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
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')


WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:8080/login?from=%2F')

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/HE/Page_Sign in Jenkins/input_Welcome to Jenkins_j_use'),30)
WebUI.executeJavaScript("arguments[0].setAttribute('style','background: yellow; border: 5px solid red;');", Arrays.asList(element))
WebUI.delay(2)
WebUI.executeJavaScript("arguments[0].setAttribute('value','Akash');", Arrays.asList(element))
WebUI.delay(5)
WebUI.setEncryptedText(findTestObject('Object Repository/HE/Page_Sign in Jenkins/input_Welcome to Jenkins_j_pas'), 'J7R4ejOak4Y=')

