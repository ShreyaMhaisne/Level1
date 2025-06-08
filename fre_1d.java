package level1.com;

import java.util.Scanner;

public class fre_1d {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];

        System.out.println(" Frequency of elemnt");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("  " + arr[i] + " = " + count);
        }
        sc.close();
    }
}
