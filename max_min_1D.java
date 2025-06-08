package level1.com;

import java.util.Scanner;

public class max_min_1D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enetr the size for array");
	int n = sc.nextInt();
	
	int []arr=new int[n];
	
	System.out.println("enter array");
	for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
	}
	
	int max=arr[0];
	int min=arr[0];
	
	for(int i=1;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	
	System.out.println(" Max no is :"+max);
	System.out.println("min no is :"+min);
	
	
	sc.close();
}
}
