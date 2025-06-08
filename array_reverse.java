package level1.com;

public class array_reverse {
  public static void main(String[] args) {
	int []arr= {0,1,3,6,1,90,-1};
	
	int first=0;
	int last=arr.length-1;
	while(first<last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
		first++;
		last--;
	}
	for(int a:arr) {
		System.out.println(a);
	}
}
}
