package level1.com;

import java.util.Scanner;

public class merge_2_1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of first sorted array: ");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];
	        System.out.println("Enter elements of first sorted array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        System.out.print("Enter size of second sorted array: ");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        System.out.println("Enter elements of second sorted array:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        int[] merged = new int[n1 + n2];

	        int i = 0, j = 0, k = 0;

	        while (i < n1 && j < n2) {
	            if (arr1[i] < arr2[j]) {
	                merged[k] = arr1[i];
	                i++;
	            } else {
	                merged[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            merged[k] = arr1[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            merged[k] = arr2[j];
	            j++;
	            k++;
	        }

	        System.out.println("Merged array:");
	        for (int m = 0; m < merged.length; m++) {
	            System.out.print(merged[m] + " ");
	        }
	        sc.close();
	    }
}
