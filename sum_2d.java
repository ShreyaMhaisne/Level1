package level1.com;

import java.util.Scanner;

public class sum_2d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enetr rows and col no");
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int [][]arr=new int[n][m];
	
	System.out.println("enter array ");
	for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
	}
	
	int sum=0;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		  sum+=arr[i][j];
		}
}
	System.out.println("Sum of 2 D array"+sum);
	
	sc.close();
	
}
}
