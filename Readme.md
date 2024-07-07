# QA Assignment Test Automation 

WEB and API Testing. Web Test Automation Architecture using Java, PlayWright and BDD. API Automation using Rest Assured BDD.

## Languages and Frameworks

The project uses the following:
- *[Java](https://www.oracle.com/java/technologies/javase/21-relnote-issues.html)* as the programming language.
- *[PlayWright](https://playwright.dev/)* as the web browser automation framework using Java.
- *[RestAssured](https://rest-assured.io/)* as the api automation tool using java.
- *[Extent Report](https://extentreports.com/documentation/)* as the test reporting strategy.
- *[Cucumber BDD](https://cucumber.io/docs/bdd/)* as the framework for Behaviour-Driven Development (BDD).
- *[IntelliJ IDE](https://lp.jetbrains.com/)* as the IDE.

## Directory Structure
- [Pages and Locators](#allPageAndLocators)
- [Steps](#stepDefinition)
- [Reports](#reports)
- [Feature File](#qa.feature)


### Pages and Locators
The project uses Page Object Model to capture all the relevant UI components
### Steps
The project uses step definition file to capture all the relevant UI functionalities and BDD definition of a web page
### Report
The project uses *Extent Reports* to provide test reporting functionalities. 
### Feature File
[TCs.feature](.../src/test/resources/features) demonstrates an example question answer regression test script.

 
Steps to run the Automation Script
Cloning the repo from GitHub : https://github.com/rekhashreejayarama/SpriteCloud-QAAssignment.git

Go to the path where above repo has been cloned, 
Open the repo in an IDE Open terminal in IDE and run below command 

Command - ``mvn clean test``

After execution, Go to the target folder -->HTMLReport inorder to analyze the execution report.
