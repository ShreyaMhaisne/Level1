package level1.com;

import java.util.Scanner;

public class Sec_largesst {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        if (n < 2) {
	            System.out.println("Second largest doesn't exist.");
	            return;
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                second = num;
	            }
	        }

	        if (second == Integer.MIN_VALUE) {
	            System.out.println("No second largest element (all elements may be equal).");
	        } else {
	            System.out.println("Second largest element is: " + second);
	        }

	        sc.close();
	    }
}
