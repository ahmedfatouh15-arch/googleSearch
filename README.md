# Documentation Challenges
The first two parts of the challenge are submitted in the [documentation folder](https://github.com/ahmedfatouh15-arch/googleSearch/tree/master/Documentation) in the Repo., there are three Excel folders for each part of the challenge:
1. The **Test Design for Monefy App (First Part)** file is a documentation for the test cases of Monefy App and contains the priority of the cases as requested in the first part of the challenge
2. The **Monefy 9 Bugs and 11 Enhancements (Second Part)** file is the documentation of **9** bugs found in the Menofy app and **11** more Enhancements points, excel file consists of 10 internal sheets (9 for the bugs and 1 for the enhancements)
3. The **Google Search Engine Test Cases (Third Part)** file is the documentation of the test cases for google search engine, these test cases are developed into automation test cases and they can be found at the end of this file

# Automation Test For Google Search Engine
The automation test scripts are developed using Selenium + Java and integrated with Cucumber and testng. The project is designed to be independant from each other where the tester can run a test for any feature without the need to run the whole project. 

## 1. _Project Execution_
- To execute the project, the tester need to make sure that all JARs used in the project is added to the project locally.
- All the JARs needed can be found in the [JARs Folder](https://github.com/ahmedfatouh15-arch/googleSearch/tree/master/JARs) in the repository.
- After confirming that the JARs are already added to the project, the tester should navigate to `main_Runner.java` file and run it as **JUnit Test**.
- The project will begin to run and execute the features one by one and shows their status in the **JUnit Side Menu**
- The test should be executed over a chrome browser of version 89.0.4389.90 or the tester will need to change the Browser driver in the BrowserDriver folder.

## 2. _Project Structure_
- The project contain 4 libraries and 3 folders.
- The four libraries are the **JRE System Library, JUnit 5, TestNG and the refrenced libraries** that contains all the JARs added to the project.
- The three folers are the `src` folder, `features`, `BrowserDrivers`
    1. The `src` folder contains all **.java** files and contains three packages
        1. The **mainPackage** that contains all objects created to be used in the project and the `baseClass.java` that contains all functions shared between all step definition classes.
        2. The **StepDefinition** that contains all classes that defines the steps executed in the project
        3. The **testRunner** that contains all runners for the projects
    2. The `Features` folder contains all the features files to be exectued according to their calls
    3. The `BrowserDrivers` that contains all browsers drivers to be used in the project.

## 3. _Automation Test Cases_
|#|Test Case|Expected Results|Actual Results|Status|
| ----------- | ----------- | ----------- | ----------- | ----------- |
|1|Access the link of the Google Search main screen|The screen should opens normally|As Expected|Pass|
|2|Search using single word of **Instabug** as a keyword|The engine should open the results screen and shows results relevant to the keyword **Instabug**|As Expected|Pass|
|3|Search using multiple words as keywords|The engine should open the results screen and shows results relevant to the keywords|As Expected|Pass|
|4|input nothing in the search bar and submit the search|The engine should do nothing and wait for the user to insert some keywords|As Expected|Pass|
|5|insert some keyword and then clear the search bar then submit the search|The engine should do nothing and wait for the user to insert some keywords|As Expected|Pass|
|6|Search using single word as a keyword from the results screen|The engine should open the results screen and shows results relevant to the keyword|As Expected|Pass|
|7|Access the link of the Google Search main screen and check the country field in the footer|The country in the footer should be the local country of the machine|As Expected|Pass|
|8|Sign in to a google account with invalid email|The system should block the user from signing in and fire a toast that the email is not found|As Expected|Pass|
|9|Sign in to a google account with valid email and invalid password|The system should block the user from signing in and fire a toast that the password is not found|As Expected|Pass|
|10|Sign in to a google account with valid credentials|The user should sign in to their account and the system should direct them to the main search screen|As Expected|Pass|
|11|Images search using Instabug as a search keyword|The result screen should open filtered by images and the data should be relevant to **Instabug**|As Expected|Pass|
|12|Compare between the image search and the image filteration|The result of the two process should be the same and relevant to the search keyworf **Instabug**|As Expected|Pass|
