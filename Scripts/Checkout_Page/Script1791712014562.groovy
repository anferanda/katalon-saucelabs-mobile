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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

//Mobile.callTestCase(findTestCase('Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.callTestCase(findTestCase('ViewProduct_Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Products_page/AddtoCart_btn'), 0)

Mobile.tap(findTestObject('Products_page/Cart_btn'), 0)

Mobile.tap(findTestObject('Checkout_page/Checkout_btn'), 0)

TestData td = findTestData('Data Files/Payment')

int totalRow = td.getRowNumbers()

for (int i = 1; i <= totalRow; i++) {
	
		String firstName  = td.getValue('firstName', i)
		String lastName   = td.getValue('lastName', i)
		String postalCode = td.getValue('postalCode', i)

Mobile.verifyElementVisible(findTestObject('Checkout_page/FirstName_input'), 0)

Mobile.setText(findTestObject('Checkout_page/FirstName_input'), firstName, 0)

Mobile.verifyElementVisible(findTestObject('Checkout_page/LastName_input'), 0)

Mobile.setText(findTestObject('Checkout_page/LastName_input'), lastName, 0)

Mobile.verifyElementVisible(findTestObject('Checkout_page/Zip_input'), 0)

Mobile.setText(findTestObject('Checkout_page/Zip_input'), postalCode, 0)

}

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Checkout_page/Continue_btn'), 0)

Mobile.scrollToText('FINISH', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Checkout_page/Finish_btn'), 0)

Mobile.verifyElementVisible(findTestObject('Checkout_page/Complete_txt'), 5)

Mobile.tap(findTestObject('Checkout_page/BackHome_btn'), 0)

Mobile.tap(findTestObject('Products_page/BurgerMenu_btn'), 0)

Mobile.verifyElementVisible(findTestObject('Login_page/Logout_btn'), 0)

Mobile.tap(findTestObject('Login_page/Logout_btn'), 0)