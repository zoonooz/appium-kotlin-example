Using Appium with Kotlin
========================

This project is the example of how to setup Appium with Kotlin to test your app in both iOS and Android.

## Running the test

### Install Appium Server
Install Appium server using node.js
```
npm install -g appium
```
or download the Application from https://bitbucket.org/appium/appium.app/downloads/

then start the server.

### Android setup
Appium will use the first device that connected to ADB so please check `adb devices` and make sure that at lease one device is connected.

For more information https://github.com/appium/appium/blob/master/docs/en/drivers/android-uiautomator2.md

### iOS setup
If you see some permission error, you might need to use `authorize-ios` before running the test in simulator.

```
npm install -g authorize-ios
sudo authorize-ios
```

Appium will use device name in the capabilites to find simulator.
Use the following command to find all available names.
```
xcrun simctl list devices
```

For more information https://github.com/appium/appium/blob/master/docs/en/drivers/ios-xcuitest.md

### Run the test
Start appium server then use the test task like normal gradle project. You also can specify the platform you want to test (`ANDROID` or `IOS`)
```
./gradlew test -Pplatform=ANDROID
```

## Writing the test

### Finding the element ID
If you are using Appium desktop app, it comes with the inspector tool that you can use to find element reference such as XPath or ID. 

Android has the tool that you can use to find element informations as well.
```
{ANDROID_SDK}/tools/uiautomatorviewer
```

### PageObject Pattern
Page Object is a Design Pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. I recommend you to read and understand how to design the test before start writing.

- https://martinfowler.com/bliki/PageObject.html
- https://github.com/SeleniumHQ/selenium/wiki/PageObjects