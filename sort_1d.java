package level1.com;

import java.util.Scanner;

public class sort_1d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n no");
	int n=sc.nextInt();
	
	int []arr=new int[n];
	
	System.out.println("enter array ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	boolean ascending=true;
	boolean descending=true;
	
	for(int i=0;i<n-1;i++) {
		if(arr[i]<arr[i+1]){
			descending=false;
		}else if(arr[i]>arr[i+1]) {
			ascending=false;
		}
	}
	
	if(ascending) {
		System.out.println("array is asscending ");
	}else if(descending) {
		System.out.println("array is descending");
	}else {
		System.out.println("array is unsorted");
	}
	sc.close();
}
}
