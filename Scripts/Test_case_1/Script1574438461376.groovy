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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.URL)

WebUI.navigateToUrl('https://www.google.com/gmail/about/#')

WebUI.click(findTestObject('Object Repository/Page_Gmail - Free Storage and Email from Google/a_Sign in'))

WebUI.switchToWindowTitle('Gmail')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_to continue to Gmail_identifier'), 'ushmagoosh')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Welcome'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_password'), 'PPCQINIMVZQBuRAS3MQshQ==')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Couldnt sign you in'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/div_ushmagooshgmailcom'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_password'), 'PPCQINIMVZQBuRAS3MQshQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gmail/input_Too many failed attempts_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Couldnt sign you in'))

