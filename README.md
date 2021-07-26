# Maven - CodingChallenge

Find the next highest number with the same sequence of digits

A Maven project is created with all the dependencies included in the pom.xml file.

App.java - Java class with the main method.
CodingChallenge.java - Class which has the algorithm to find the next highest number.
CodingChallengeTest.java - Junit class which has a list of test cases to run the program against.

PreRequisite: Maven installed

Steps to run the program:
Clone the above repository.
To run the program as a maven project using command line.
1. Open cmd on the root folder "FindNextHighestNumber"
2. Run "mvn package"
3. Run "java -jar target\FindNextHighestNumber-0.0.1-SNAPSHOT.jar"
  
To run the program using any Java IDE
1. Import the project as a Maven project.
2. Run App.java to get the output in the IDE console. No command line argument needed.
3. Run CodingChallengeTest.java to run the Junit test cases.


On running the program, the user has to enter the digits and the program will output the next highest number with the same sequence. 
Input "Exit" will stop the program.

Algorithm used:
1. Find the first x position from right where the value is less than the one next to it.
2. Find the smallest digit among the digits present after the x position,which is greater than the value in the x position.
3. Swap the number at x position with the next smallest number found.
4. Since all the values after the x position are in desending order, we need to just invert them to get the ascending order of digits.
5. Print the numbers. 
