import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {12,10,15,20,9,10,1};
		
		InaertionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	

	private static void InaertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int k = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>k) {
				arr[j+1] = arr[j];
				j=j-1;	
			}
			arr[j+1]=k;
		}
		
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
