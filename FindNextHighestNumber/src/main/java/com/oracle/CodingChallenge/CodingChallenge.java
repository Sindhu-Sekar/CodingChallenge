package com.oracle.CodingChallenge;
import java.util.Arrays;

public class CodingChallenge {
	
	/**
	 * @param input - The number in string format
	 * @return Output - The next highest number in string format /  "No result" if there is no next highest value
	 */
	public String nextHighestNumber(String input) {
		
		//Check if input string has only digits
		if(!input.chars().allMatch(Character::isDigit)) {
			return "Enter digits only";
		}			
				
		int[] digits = getdigits(input);
		String result = "";
		
		//Find the first x position from right where value is smaller than the one next to it 
		int xPos = findPosWhereValueLesserThanNextDigit(digits);
		
		if(xPos == -1) {//The digits are in descending order
			result = "No result";
		} else {
						
			//find smallest digit greater than the value at x
			int minPosition = findSmallestNoGreaterThanPosVal(digits, xPos);			
			
			//Swap
			swap(digits, xPos, minPosition);			
			
			//Reverse the array
			reverseDigitsFromPos(digits, xPos+1);
			
			//convert to string
			result = Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "");
		}
		
		return result;		
	}

	private int findPosWhereValueLesserThanNextDigit(int[] digits) {
		int i;
		for(i = digits.length - 1; i > 0; i--) {
			if(digits[i] > digits[i-1]) {
				break;
			}
		}
		return i-1;
	}
	
	private int findSmallestNoGreaterThanPosVal(int[] digits, int xPos) {
		int minPosition = xPos+1;
		for(int i = digits.length-1; i > xPos+1; i--) {
			if(digits[i] > digits[xPos] && digits[i] <= digits[minPosition]) {
				minPosition = i;
			}
		}
		return minPosition;
	}

	private void swap(int[] a, int posA, int posB) {
		int tempswap = a[posA];
        a[posA] = a[posB];
        a[posB] = tempswap;		
	}

	private int[] reverseDigitsFromPos(int[] a, int pos) {
		int k = a.length-pos;
		for (int i = 0; i < (k/ 2); i++)
        {
			swap(a,i + pos, k - i - 1 + pos);        
        }
		return a;
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
}
