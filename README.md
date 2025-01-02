# Unit Test Example Project

- **Mobile Apps II Assignment 10**  

## Project Description
This repository contains a simple Kotlin-based Android project with a focus on unit testing. The project demonstrates key concepts in Android development, including the use of unit tests and annotations, as well as handling timestamps during tests.

## Assignment Overview

### **Section A:**
1. **Difference between Internationalization and Localization**  
   Explains the distinction between internationalization (i18n) and localization (l10n), including how they affect software development.
   
2. **Examples of Annotations in Kotlin**  
   Explores three Kotlin annotations commonly used in Android and Kotlin development, with practical examples.

### **Section B:**
1. **Unit Testing with Assertions**  
   The `ExampleUnitTest` class includes several test cases:
   - Tests for a simple addition function.
   - Tests for a method `methodB` that returns the longest word from an array.
   - Tests for a multiplication function `multiplyXY`.
   
2. **Timestamp Printing in Tests**  
   Ensures that every test prints a timestamp when executed, so it's clear when the tests were run.

### **Test Cases:**
- **`addition_isCorrect`**: Checks simple addition.
- **`testMethodB`**: Verifies that the `methodB` returns a value different from "BMW".
- **`testMultiplyXY_Multiplication`**: Verifies multiplication is carried out correctly.
- **`testMultiplyXY_PositiveResult`**: Ensures the multiplication result is positive.

---

## Challenges Encountered

During the development and testing of this project, several challenges were encountered and resolved:

### 1. **Running Unit Tests in Android Studio**
   - **Issue:** Sometimes unit tests do not run as expected in Android Studio, or the test results don't appear.
   - **Resolution:** Ensure that the correct testing framework (JUnit) is being used. Make sure the test class is located in the correct directory (`src/test/java/`). Running the tests from the correct context (e.g., directly from the test class or method) helped resolve this issue.

### 2. **Printing Timestamps in Tests**
   - **Issue:** Adding a timestamp to each test wasn't immediately obvious, and it required using `SimpleDateFormat` to format the date correctly.
   - **Resolution:** We created a helper function `printTimestamp()` that uses `SimpleDateFormat` to print the current timestamp at the start of each test case, ensuring we can track when each test is executed.

### 3. **Handling Gradle Sync Issues**
   - **Issue:** Gradle sometimes faces issues when syncing dependencies or building the project, especially after cloning the project.
   - **Resolution:** To resolve this, we used the `./gradlew build` command to force a rebuild and sync of the project. Additionally, checking for internet connectivity helped resolve issues related to downloading missing dependencies.

### 4. **Running Instrumented Tests on Devices/Emulators**
   - **Issue:** Instrumented tests were not running on the Android Emulator or physical devices.
   - **Resolution:** Ensuring that an emulator was running or a physical device was connected solved the issue. Additionally, checking the configuration of the Android Test environment in Android Studio helped resolve issues related to running instrumented tests.

### 5. **Understanding Test Failures**
   - **Issue:** When running tests, the tests sometimes failed without providing clear error messages.
   - **Resolution:** We reviewed the error logs and adjusted the test assertions and expected values accordingly. Ensuring that test cases are written with correct assertions and expected outputs was crucial to passing the tests.

### 6. **Running Tests with Multiple Dependencies**
   - **Issue:** Managing dependencies for both unit and instrumented tests was challenging when the dependencies for testing frameworks weren't compatible.
   - **Resolution:** We updated the **`build.gradle`** file to ensure that the correct dependencies were included for both unit and instrumented tests. Proper dependency management for both **JUnit** and **Espresso** helped ensure tests ran smoothly.

---

### General Tips:
- Ensure that Android Studio is up-to-date, as issues with testing frameworks are often resolved in newer versions of the IDE.
- For testing, double-check the directories and ensure unit tests are in `src/test/java/` and instrumented tests are in `src/androidTest/java/`.
- When encountering issues with running tests, check the **Run** window in Android Studio for logs and trace any issues related to dependencies or configurations.

---

## Conclusion

This project serves as an introductory demonstration of unit testing in Kotlin for Android development. The primary objective was to ensure that various test cases were implemented and executed successfully to validate the functionality of the application. 

### Key Achievements:
- **Unit Testing Implementation:** 
  The project successfully implements unit tests to validate core functionality, including mathematical operations and string manipulations.
  
- **Timestamp Logging in Tests:** 
  Each test case prints a timestamp to provide context about when the test was executed, ensuring better traceability.

- **Testing Functions for Edge Cases:**
  Several tests, such as checking for positive multiplication results and verifying specific return values, were implemented to ensure robustness and correctness.

- **Android Studio Setup:**
  Detailed steps were provided to set up the project in Android Studio, clone the repository, and run both unit and instrumented tests.

### Project Learnings:
- The process of writing unit tests and utilizing annotations like `@Test` and `@RunWith` enhances code reliability by ensuring that each function performs as expected.
- Ensuring that unit and instrumented tests are written in the correct directories is essential for proper execution in Android Studio.
- Managing test dependencies and ensuring the right frameworks are integrated into the project was crucial for successful test execution.

This project has successfully demonstrated the implementation of basic unit testing and timestamp logging in Android development. It is a solid foundation for future projects that require testing, validation, and continuous integration.

---

## References

1. [Internationalization and Localization](https://www.geeksforgeeks.org/explain-about-internationalization-and-localization/)
2. [Improve code inspection with annotations](https://developer.android.com/studio/write/annotations)
3. [Annotations](https://kotlinlang.org/docs/annotations.html)
4. [Kotlin annotations](https://www.geeksforgeeks.org/kotlin-annotations/)
5. [Test code using JUnit in JVM – tutorial](https://www.geeksforgeeks.org/unit-testing-in-android-using-junit/)
6. [Unit Testing in Android using JUnit](https://developer.android.com/reference/androidx/credentials/exceptions/CreateCredentialException)
7. [TimeStamp](https://developer.android.com/reference/kotlin/androidx/test/services/events/TimeStamp)

---

**Lecturer**: Eugene O'Regan  
**Module**: Mobile App Development 2  

---

## Disclaimer  

This project is for educational purposes only.  
The information and code presented in this repository demonstrate testing concepts in Android development.  
They are not intended for commercial use. While efforts have been made to ensure the accuracy and reliability of the content, there may be errors or omissions.  
I am not responsible for any consequences arising from the use of this project or its implementation in real-world applications.  
Users are encouraged to verify and adapt the code as necessary for their specific use cases.

***Filipe Lutz***
