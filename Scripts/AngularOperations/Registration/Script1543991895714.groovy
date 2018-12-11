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

WebUI.navigateToUrl('https://www.udemy.com/')

WebUI.setText(findTestObject('Object Repository/Page_Online Courses - Learn Anythin/input_Search_q'), 'Akash')

WebUI.click(findTestObject('Object Repository/Page_Online Courses - Learn Anythin/span_akashic records'))

WebUI.click(findTestObject('Object Repository/Page_Online Courses - Anytime Anywh/h4_An Introduction to the Akas'))

WebUI.click(findTestObject('Object Repository/Page_An Introduction to the Akashic/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_An Introduction to the Akashic/span_'))

