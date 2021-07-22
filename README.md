# CodingChallenge

Find the next highest number with the same sequence of digits

CodingChallenge.java - Class which has the algorithm to find the next highest number.
On running CodingChallenge.Java, the user has to enter the digits and it will output the next highest number.
Input "Exit" will stop the program.

NextHighestNumberTests.java - Junit class which has a list of test cases to run the program against. I used Junit 5 for TDD programming.

Steps to run the program:
1. Clone the above repository and open it in any Java IDE.
2. Ensure that the basic JRE and Junit libraries are loaded.
3. Run codingChallenge.java to enter the digits to find the next highest number in the sequence. No command line argument needed.
4. Run NextHighestNumberTests.java to run the Junit test cases.

Algorithm used:
1. Find the first x position from right where the value is less than the one next to it.
2. Find the smallest digit among the digits present after the x position,which is greater than the value in the x position.
3. Put the smallest value in the x position.
4. Since all the values after the x position are in desending order, we need to just invert them to get the ascending order of digits.
5. Place the original x position digit in appropriate place such that all the digits after the x position are in ascending order.  
