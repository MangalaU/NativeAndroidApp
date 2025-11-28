The project is designed using a Java, TestNG, and Selenium-based framework for automating a native Android application using the Page Object Model (POM) in IntelliJ IDEA.

**Requirements:**
The app must be pre-installed locally on:
a) The Android emulator (as specified in the Desired Capabilities)
b) Appium Server
- Android Studio must be installed
- Android SDK must be properly configured
- All  environment variables must be added to the system ( ANDROID CMDLINE,ANDROID EMULATOR , ANDROID HOME, ANDROID SDK)
Ensure the Appium Server and Emulator are running and connected before executing the test cases
Allure Reports are used to generate execution reports
The APK file (application) must already be installed on the emulator
The Appium server and the emulator must be running while executing the tests.
## Allure Report (Local CMD)
Project Path - 
allure generate allure-results --clean -o allure-report
allure open allure-report
