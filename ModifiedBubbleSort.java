import java.util.Arrays;

public class ModifiedBubbleSort {

    public static void main(String[] args) {
        int[] arr = {65,35,89,1,0};
        impBubbleSort(arr);
    }

	private static void impBubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		boolean s = true;
		for(int i =0;i<arr.length;i++) {
			s = false;
			for(int j=0;j<n-i-1;j++) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
//		if(!s) {
//			break;
//		}
	}
}