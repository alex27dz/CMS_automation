import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://intra.stage.apps.labour.gov.on.ca/public-portal-qa/#/marketplace/course-search')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/mat-label_Training type'), 'Training type')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/button_All'), 'All')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/button_Blended'), 'Blended')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/button_Distance'), 'Distance')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/button_eLearning'), 'eLearning')

WebUI.verifyElementText(findTestObject('Object Repository/Page_PublicPortal/button_In-Class'), 'In-Class')

WebUI.click(findTestObject('Object Repository/Page_PublicPortal/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_PublicPortal/span_Showing 7 course advertisements'), 0)

WebUI.closeBrowser()

