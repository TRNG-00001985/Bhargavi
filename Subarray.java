package revature;
import java.util.Scanner;

public class Subarray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] array = new int[n];
	        System.out.println("Enter elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        int maxSum = kadaneAlgorithm(array);
	        System.out.println("Maximum sum of a subarray: " + maxSum);
	        scanner.close();
	    }
	    public static int kadaneAlgorithm(int[] array) {
	        int maxSoFar = array[0];
	        int maxEndingHere = array[0];

	        for (int i = 1; i < array.length; i++) {
	            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
	            maxSoFar = Math.max(maxSoFar, maxEndingHere);
	        }

	        return maxSoFar;
	    }
}
