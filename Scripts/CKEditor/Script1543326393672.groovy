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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ckeditor.com/ckeditor-5/')

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Object Repository/NEWCKEDITOR/Page_CKEditor 5 - A set of ready to/h2_The three greatest things y'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 275)

WebUI.delay(3)


//WebElement element = WebUiCommonHelper.findWebElement((GlobalVariable.Bold),30)
//WebUI.executeJavaScript("arguments[0].setAttribute('style','background: yellow; border: 5px solid red;');", Arrays.asList(element))
//WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Bold'))
WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Bold'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Italic'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Bullets'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Numbering'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Link'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/link/linkeneter'), 'www.google.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/LinkSuccess'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ButtonSelect'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/BlockQuote'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Object Repository/NEWCKEDITOR/ImageUpload'), 'C:\\Users\\akash\\Katalon Studio\\Diffoperations\\1.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/youtube'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/NEWCKEDITOR/youtubeinput'), 'https://youtu.be/ZFd2PE1l6vU')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/youtubesuccess'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/Table'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/NEWCKEDITOR/tableselect2'))

WebUI.delay(2)

