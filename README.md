# MavenCodingChallenge

Find the next highest number with the same sequence of digits

A Maven project is created with all the dependencies included in the pom.xml file.

App.java - Java class with the main method.
CodingChallenge.java - Class which has the algorithm to find the next highest number.
On running App.java, the user has to enter the digits and it will output the next highest number.
Input "Exit" will stop the program.

CodingChallengeTest.java - Junit class which has a list of test cases to run the program against. I used Junit 5 for TDD programming.

Steps to run the program:
1. Clone the above repository with the master branch and import it in any Java IDE as a maven project.
3. Run App.java to enter the digits to find the next highest number in the sequence. No command line argument needed.
4. Run CodingChallengeTest.java to run the Junit test cases.

Algorithm used:
1. Find the first x position from right where the value is less than the one next to it.
2. Find the smallest digit among the digits present after the x position,which is greater than the value in the x position.
3. Swap the the number at x position with the next smallest number found.
4. Since all the values after the x position are in desending order, we need to just invert them to get the ascending order of digits.
5. Print the numbers. 
