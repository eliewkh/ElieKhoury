# QA_Code_Challenge_ElieKhoury

Cucumber Tests

a) This repository contains Cucumber and Selenium tests for the canvas calculator.

b) The logic adapted was to click by corrdinated on the numbers,
then take a screenshot and compare it to the expected screenshot of each scenario

c) The screenshots exists under the src/main/resources

d) chromedriver.exe should exists under the src/main/resources
 
Dependencies

For IntelliJ Idea:
Windows: click File -> Settings -> Plugins -> Market Place -> Browse repositories for "Cucumber for Java"-> Install. Restart IntelliJ.

Windows: click File -> Settings -> Plugins ->  Market Place -> Browse repositories for "Gherkin"-> Install. Restart IntelliJ.

Windows: click File -> Settings -> Plugins -> Market Place -> Browse repositories for "JUnit"> Install. Restart IntelliJ.


Adding Tests

Tests can be added in the "Features" packages. Each feature package has his own step definition  file under "Steps" package

Running Tests

Open the project, Right click on the feature file and click "Run All Features: in Features"

Browser: Chrome