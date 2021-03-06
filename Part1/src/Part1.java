
public class Part1 {

	public static void main(String[] args) {
		
		// create array with the provided values
		// int[] numbers = new int[6];
		// numbers[0] = 1;
		// numbers[1] = 5;
		// numbers[2] = 2;
		// numbers[3] = 8;
		// numbers[4] = 13;
		// numbers[5] = 6;
	
		
		// alternative way to create an array then the previous example
		int[] numbers = {1, 5, 2, 8, 13, 6};
		System.out.println(numbers[0]);
		
		System.out.println(numbers);
				
		// print out first element of the array
		System.out.println(numbers[0]);
		
		
		// print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length-1]);
		
		// print out the element in the array at position 6
		// System.out.println(numbers[6]);
		// Output: exception error states 6 is out of bounds for length 6
		
		// print out the element in the array at position -1
		// System.out.println(numbers[-1]);
		// Output: exception error states -1 is out of bounds for length 6
		
		// write a traditional for loop that prints out each element in the array
		for (int q = 0; q < numbers.length; q++) {
			System.out.println(numbers[q]);
		}
		
		// write an enhanced for loop that prints out each element in the array
		for (int number : numbers) {
			System.out.println(number);	
		}
	
		double sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
		
		// create a new variable called average and assign the average value to it
		double avg = sum/numbers.length;
		System.out.println(avg);
		
		// write an enhanced loop  that prints out each member in the array only if the number is odd
		for (int number : numbers) {
			if (number % 2 != 0) {
				System.out.println(number);	
			}
		}
		
		// Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] allNames = {"Sam", "Sally", "Thomas", "Robert"};
		
		// Calculate the sum of all the letters in the new array
		int sumOfLetters  = 0;
		for (String name : allNames) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
				
		
		// PART 2 continuation
		// write and test a method that takes a String name 
		// and prints out a greeting, this method returns nothing
		
		String name = "Ed";
		String name1 = "Adrian";
		greet(name);
		
		// write and test a method that takes a String name and
		// returns a greeting. do not print in the method
		
		greet1(name1);
		System.out.println(greet1(name1));
		
		// alternatively the above can be explicitly expressed
		// using a variable
		String greet3 = greet1(name1);
		System.out.println(greet3);
		
		// Compare the two methods. What is the difference?
		// Answer: The difference between the two similar methods is
		// that the first method prints in the method while
		// while the second method prints from 
		// the main code using the 'return' value
		
		// Write and test a method that takes a String and an int
		// and returns true if the number of letters is the string is greater than the int
		
	    checkStrLongerThanNumber("Christian", 5);
	    System.out.println("This is " + checkStrLongerThanNumber("Christian", 5));
		
			
	    // Alterntaively since the return value is boolean and the condition evaluates to boolean, we can narrow
	    // the lines to 'return (str1.length() > nbr'
		
	    // Write and test a method that takes an array of strings and a string and
	    // returns true if the string passed in exists in the array
	    // String[] names2 = {"Clara", "Sophie", "Luis", "John", "Leslie"};
	    String p = "Luis";
	 
	    System.out.println("This is : " + isStringInArray (p, allNames));
	    
	    
	    // Write and test a method that takes an array of int and returns 
	    // the smallest number in the array
	    
	    int[] randomnumbers = {8, 95, 31, 5, 1, -2, 54, 19, 51};
	    
	    // System.out.println(randomnumbers[2]);
	    System.out.println(getSmallestNumberInArray(randomnumbers)); 
	 
	    
	    
	// 	PART 3 continuation
	    
	    // write and test a method that takes an array of doubles and returns the average
	    double[] doubles = {23.52, 32.54, 54.23};
	    System.out.println(getAverageOfDoubles(doubles));
	    
	    // Write and test a method that takes an array of Strings and returns an array of int where each element 
	    // matches the length of the string at that position
	    // Will use the String array allNames for this exercise
	    int[] nameLengths = (captureArrayIntLength(allNames));
	    for (int len : nameLengths) {
	    	System.out.println(len);	
	    }
	    
	    // write and test a method that takes an array of Strings and returns true if the sum of the letters for all strings with an 
	    // even amount of letters is greater than the sum of those with an odd amount of letters
	    System.out.println(hasMoreEvenWordCharacters(allNames));
	    
	    // write and test a method that takes a string and returns true if the string is a palindrome.
	    System.out.println(isPalindrome("racecar"));
	    
	    
	    /*
	     * About Characters
	     * string.charAT()
	     *  
	     */
	    	
	} // This is the END OF THE Main PROGRAM
	
	// LIST OF METHODS CREATED FOR THIS LAB EXCERCISE

	public static boolean isPalindrome (String string) {
		// racecar
		// wow
		// mom
		// first char = last char; second char = second to the last; etc.
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length()-i-1)) {
				return false;
			}
				
		}
		return true; 
		
		
	}
	
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLengths = 0;
		int oddLengths = 0;
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLengths += string.length();
			} else {
				oddLengths += string.length();
			}
		}
		return evenLengths > oddLengths;
		
		
	}
	
	public static void greet(String x) {
		System.out.println("Good afternoon, " + x + "!");
	}
    
	public static String greet1(String y) {
		return "Kumusta, " + y + "!";
	}
	
    public static boolean checkStrLongerThanNumber(String str1, int nbr) {
		if (str1.length() > nbr) {
			return true;
		} else {   // this can be omitted since if the condition evaluates to false, it implicitly proceeds to the 'return false'
			return false; 
		}
	}

	public static boolean isStringInArray(String q, String[] names2) {
		for (String name : names2) {
			if (q.equals(name)) {
				return true;
			}
		} return false;
		
	}	
		public static int getSmallestNumberInArray (int[] numbers) {
			int smallNumber = numbers[0];
			for (int number : numbers) {
				if (number < smallNumber) {
					smallNumber = number;
				}
			}
			return smallNumber;
		}

		public static double getAverageOfDoubles(double[] array) {
			double sum3 = 0;
			for (double number : array) {
				sum3 += number;
			}
			return sum3/array.length;
		}
		
		public static int[] captureArrayIntLength(String[] fullNames) {
			int[] strLengths = new int[fullNames.length];
			for (int m = 0; m < fullNames.length; m++) {
				strLengths[m] = fullNames[m].length();
			}
			return strLengths;
		}

	
	

}
