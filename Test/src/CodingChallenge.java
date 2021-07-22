import java.util.Scanner;

public class CodingChallenge {
	private static final Scanner scanner = new Scanner(System.in);	
	
	/**
	 * @param input - The number in string format
	 * @return Output - The next highest number in string format /  "No result" if there is no next highest value
	 */
	public String nextHighestNumber(String input) {
		//Check if input string has only digits
		if(!input.chars().allMatch(Character::isDigit)) {
			return "Enter digits only";
		}			
				
		int noofDigits = input.length();
		int[] digits = getdigits(input);
		String result = "";
		
		//Find the first x position from right where value is smaller than the one next to it 
		int i;
		for(i = noofDigits - 1; i > 0; i--) {
			if(digits[i] > digits[i-1]) {
				break;
			}
		}
		
		if(i == 0) {//The digits are in descending order
			result = "No result";
		} else {
			int xPos = i-1;
			int xPosValue = digits[xPos];			
			
			//find smallest digit greater than the value at x
			int minPosition = i;
			for(int j = i+1; j < noofDigits; j++) {
				if(digits[j] > xPosValue && digits[j] < digits[minPosition]) {
					minPosition = j;
				}
			}
			//Put the smallest digit found in the x position
			digits[xPos] = digits[minPosition];
			
			//Since the digits right to the x position is already in descending order,
			//we need to invert the numbers in ascending order and place the original x position value in its correct place
			int[] tempAscendingCopy = new int[noofDigits-i-1];//Not to include the value at min position, since it has been added at x position

			int pos = 0;
			for(int k = noofDigits-1; k >= i; k-- ) {
				if(k != minPosition) {
					tempAscendingCopy[pos] = digits[k];
					pos++;
				} else {
					// Skip that value because it is already added in the switchPosition
				}
			}			
			
			//Append the ascending list in the digits array and place the original x position value in the right place
			pos = 0;
			boolean positionFound = false;
			for(int j = i; j < noofDigits; j++) {
				if(positionFound || (!positionFound && tempAscendingCopy.length > 0 && pos < tempAscendingCopy.length && (tempAscendingCopy[pos] < xPosValue))) {
					digits[j] = tempAscendingCopy[pos];
					pos++;
				} else {
					digits[j] = xPosValue;
					positionFound = true;
				}
			}
			
			//convert to string
			for(int num: digits)
			    result += num;
		}
		
		return result;		
	}
	
	private int[] getdigits(String input) {
		int stringLength = input.length();
		int[] digits = new int [stringLength];
		 for(int i = 0; i < stringLength; i++) {
			 //Covert char to int
			 digits[i] = input.charAt(i)-'0';      
        }
		return digits;
	}
	
	public static void main(String args[]) {
		CodingChallenge codingTest = new CodingChallenge();
		boolean check = true;
		System.out.println("---------------Find the next highest number--------------");
		System.out.println("Enter 'Exit' to quit the program");
		while (check) {
			System.out.println("Enter number:");
			String input = scanner.next();
			if(input.toLowerCase().equals("exit")) {
				System.out.print("Have a good day!");
				check = false;
			} else {
					String output = codingTest.nextHighestNumber(input);
					System.out.println("Result:" + output);
			}			
		}
	}
}
