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

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Sharia Securities Crowdfunding  SHAFIQ/span_Masuk_hamburger-box'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Sharia Securities Crowdfunding  SHAFIQ/a_Daftar Investasi'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/div_Daftar Investasi'))

WebUI.setText(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/input_Daftar Investasi_search_keywords'), 
    'mobil')

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/svg_Daftar Investasi_svg-common fill-primary'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/a_(CARC-SMY02) Pembelian 47 Unit Mobil dari_c950e2'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/section_KebijakanPrivasi_portfolio-slider'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/span_(CARC-SMY02)Pembelian 47 Unit Mobil da_638912'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/span_Masuk_hamburger-box'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/a_Daftar Investasi'))

WebUI.setText(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/input_Daftar Investasi_search_keywords'), 
    'tanah')

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/svg_Daftar Investasi_svg-common fill-primary'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/button_Lihat Lebih Banyak'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/span_Data belum tersedia atau data dengan k_286205'))

WebUI.setText(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/input_Daftar Investasi_search_keywords'), 
    'rumah')

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/svg_Daftar Investasi_svg-common fill-primary'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/div_(ENKR-SMY02) Perluasan Villa Delima Res_6f7e17'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Daftar Investasi  SHAFIQ/a_(ENKR-SMY02) Perluasan Villa Delima Resid_d1c1c2'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/section_KebijakanPrivasi_portfolio-slider'))

WebUI.click(findTestObject('Object Repository/Daftar_Investasi/Page_Detil Investasi  SHAFIQ/div_(ENKR-SMY02)Perluasan Villa Delima Resi_1df53c'))

WebUI.closeBrowser()

