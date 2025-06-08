package level1.com;

import java.util.Scanner;

public class max_min_2d {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n  m no ");
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int [][]arr=new int[n][m];
	
	System.out.println("Enter rows and col");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	int max=arr[0][0];
	int min=arr[0][0];
	
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
			
			if(arr[i][j]<min) {
				min=arr[i][j];
			}
		}
	}
	
	System.out.println("max no is "+max);
	System.out.println("min no is "+min);
	
	sc.close();
}
}
