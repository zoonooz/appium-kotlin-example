package com.zoonref.appium

import com.zoonref.appium.page.MainPage
import com.zoonref.appium.util.AppiumTest
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by zoonooz on 2017/11/17.
 * Test login process
 */
class LoginTest : AppiumTest() {

  /**
   * User should be able to login
   *
   * Given: I am at login page
   *  Then I login with my name
   *  I should see success status
   */
  @Test
  fun login() {
    val mainPage = MainPage(driver!!)
    mainPage.loginWith("appium", "1234")
    assertTrue(mainPage.isLoginSuccess())
  }
}
