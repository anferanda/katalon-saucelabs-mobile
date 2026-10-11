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

Mobile.startApplication(GlobalVariable.baseUrl, false)

Mobile.verifyElementVisible(findTestObject('Login_page/Username_input'), 0)

Mobile.setText(findTestObject('Login_page/Username_input'), GlobalVariable.username, 0)

Mobile.verifyElementVisible(findTestObject('Login_page/Password_input'), 0)

Mobile.setText(findTestObject('Login_page/Password_input'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Login_page/Login_btn'), 0)

Mobile.verifyElementVisible(findTestObject('Login_page/Products_txt'), 0)

//Mobile.tap(findTestObject('Products_page/BurgerMenu_btn'), 0)

//Mobile.verifyElementVisible(findTestObject('Login_page/Logout_btn'), 0)

//Mobile.tap(findTestObject('Login_page/Logout_btn'), 0)