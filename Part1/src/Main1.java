import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int num = kb.nextInt();
		System.out.println("You entered : " + num);
		// String userWord = kb.nex
		
		int[] numArray = new int[num];
		
		for (int i = 0; i < num; i++) {
			numArray[i] = i;
		
			
		}
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);
		
		// I had a hard time trying to remember if this was in our lecture videos
		// I honestly think it was but I hardly can remember what video and where in the video
		System.out.println("Here's a way to list an Array's contents using .toString() method:");
		System.out.println(Arrays.toString(numArray));
		
	}

}
