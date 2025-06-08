package level1.com;

import java.util.Scanner;

public class sum_1d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n no");
	int n=sc.nextInt();
	
	int []arr=new int[n];
	
	System.out.println("enter array ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	int sum=0;
	
	for(int num:arr) {
		sum+=num;
	}
	
	System.out.println("sum of array "+sum);
	
	sc.close();
}
}
