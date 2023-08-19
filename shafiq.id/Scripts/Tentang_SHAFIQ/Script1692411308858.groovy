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

WebUI.navigateToUrl('https://www.shafiq.id/')

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Sharia Securities Crowdfunding  SHAFIQ/span_Masuk_hamburger-box'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Sharia Securities Crowdfunding  SHAFIQ/a_Tentang SHAFIQ'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/div_Tentang KamiBismillahirrahmanirrahim. A_7e88ec'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/div_InvestasiBerjamaahKesadaran akan prakti_c73a8f'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/div_VisiMenjadi perusahaan penyedia layanan_59442d'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/div_MisiMemajukan Perekonomian Indonesia de_14c9a5'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/section_Temui Tim Kami yang BerpengalamanBo_ca249b'))

WebUI.click(findTestObject('Object Repository/Tentang_SHAFIQ/Page_Tentang  SHAFIQ/div_AlamatJalan Metro Pondok Indah Nomor 29_ea98ea'))

WebUI.closeBrowser()

