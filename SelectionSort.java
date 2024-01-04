import java.util.Arrays;

public class SelectionSort {
	
public static void main(String [] args) {
	int [] arr = {12,45,10,2,0,1,89,98};
	SelectionSort(arr);
	System.out.println(Arrays.toString(arr));
}

private static void SelectionSort(int[] arr) {
	// TODO Auto-generated method stub
	int n = arr.length;
	for(int i = 0;i<n;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min = j;
			}
		}
		int temp = arr[i];
		arr[i]=arr[min];
		arr[min] = temp;
	}
}
}
