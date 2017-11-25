package com.zoonref.appium.page

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.pagefactory.*

/**
 * Created by zoonooz on 2017/11/17.
 * Main page
 */
class MainPage(driver: AppiumDriver<*>) : Page(driver) {

  @AndroidFindBy(id = "userEditText")
  @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
  private var userTextField: MobileElement? = null

  @AndroidFindBy(id = "passwordEditText")
  @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
  private var passwordTextField: MobileElement? = null

  @AndroidFindBy(id = "loginButton")
  @iOSFindBy(accessibility = "Login")
  private var loginButton: MobileElement? = null

  @AndroidFindBy(id = "statusTextView")
  @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeStaticText")
  private var statusTextView: MobileElement? = null

  fun loginWith(username: String, password: String): MainPage {
    userTextField?.setValue(username)
    passwordTextField?.setValue(password)
    driver.hideKeyboard()
    loginButton?.click()
    return this
  }

  fun isLoginSuccess(): Boolean {
    return statusTextView?.text == "Login Successfully"
  }
}
