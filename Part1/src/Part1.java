
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
		// System.out.println(numbers[0]);
		
				
		// print out first element of the array
		// System.out.println(numbers[0]);
		
		
		// print out the last element in the array without using the number 5
		// System.out.println(numbers[numbers.length-1]);
		
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
		
		// 
		
		
		
		
		
	}
	

}