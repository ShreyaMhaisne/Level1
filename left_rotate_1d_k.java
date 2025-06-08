package level1.com;

import java.util.Scanner;

public class left_rotate_1d_k {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter value of k (positions to rotate): ");
	        int k = sc.nextInt();
	        int[] rotated = new int[n];
	        for (int i = 0; i < n; i++) {
	            rotated[i] = arr[(i + k) % n];
	        }
	        System.out.println("Array after left rotation:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(rotated[i]);
	        }
	  sc.close();  
	  }

}
