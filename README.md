# 📱 MyBank App Automation using Appium and TestNG

This repository contains end-to-end automation scripts for testing the **MyBank** Android application using **Appium**, **TestNG**, and **Java**.

---

## 🚀 Project Features

- Signup flow automation
- Login validation
- Transaction & Profile UI test
- Sign out functionality
- Organized TestNG suite execution
- Common setup for Appium driver

---
 ## 🚀📸 Sample Test Flow

- Signup → Validate mandatory fields

- Complete the form and sign up

- Sign out

- Login → Access dashboard

Perform transaction → Profile → Logout
## 🛠️ Tools & Technologies

- Java
- Appium
- TestNG
- AndroidDriver (UiAutomator2)
- IntelliJ IDEA or Eclipse

---
``` Folder Structure
setup/                 → Appium Driver setup (Setup.java)
testrunner/            → All test classes (Signup, Login, All Pages)
page/                  → Page object models (POM classes)
testng.xml             → TestNG suite config

---

## 🧪 Test Suite Structure
TestNG suite is configured in `testng.xml` to execute the flows sequentially:

```xml
<suite name="Full Flow Suite">
    <test name="Full Flow">
        <classes>
           <class name="testrunner.MyBankTestRunner"/>
           <class name="testrunner.LoginTestRunner"/>
           <class name="testrunner.All_Page_Test_Runner"/>
        </classes>
    </test>
</suite>
```
 Output

![My_BankAPP2](https://github.com/user-attachments/assets/e93c4cb9-6f0f-4d33-99fc-a810de4f0741)
![my_bank_APP_allure_reports](https://github.com/user-attachments/assets/2c3dfea0-10f2-45bb-a7bd-958a2c4d3f6c)





https://github.com/user-attachments/assets/b0a9c796-7669-4e6c-8f32-2ebbab0b5b13


