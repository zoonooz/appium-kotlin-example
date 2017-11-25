Using Appium with Kotlin
========================

This project is the example of how to setup Appium with Kotlin to test your app in both iOS and Android.

## Running the test

### Install Appium Server
Install Appium server using node.js
```
npm install -g appium
```
or download the Application from this [link](https://bitbucket.org/appium/appium.app/downloads/)

then start the server.

### Android setup
Appium will use the first device that connected to ADB so please check `adb devices`

### iOS setup
Due to some limitation, we need to use `authorize-ios` before running the test in simulator.

```
npm install -g authorize-ios
sudo authorize-ios
```

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
Page Object is a Design Pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. I recommend you to read and understand how to use it before start writing the test.

https://martinfowler.com/bliki/PageObject.html