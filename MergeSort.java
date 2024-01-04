//import java.util.Arrays;
//
//public class MergeSort {
//	public static void main(String[] args) {
//		int [] arr = {12,10,1,0,89,56,23};
//		mergesort(arr,0,arr.length-1);
//	}
//
//	private static void mergesort(int[] arr, int start, int end) {
//		// TODO Auto-generated method stub
//		if(start<end) {
//			int mid = (end+start)/2;
//			mergesort(arr,start,mid);
//			mergesort(arr,mid+1,end);
//			merge(arr,start,end,mid);
//		}
//	}
//
//	private static void merge(int[] arr, int start, int end, int mid) {
//		// TODO Auto-generated method stub
//		int i,j,k = 0;
//		int n1 = mid-start+1;
//		int n2 = end-mid;
//		int [] larr = new int[n1];
//		int [] rarr = new int[n2];
//		for(i=0;i<n1;i++) {
//			larr[i] =arr[start+i];
//		}
//		for(j=0;j<n2;j++) {
//			rarr[j] =arr[mid+1+j];
//		}
//		i=0;j=0;
//		
//		while(i<n1 && j<n2) {
//			if(larr[i]<rarr[j]) {
//				arr[k]=larr[i];
//				k++;i++;
//			}
//			else {
//				arr[k]=rarr[j];
//				k++;j++;
//			}
//		}
//		while(i<n1) {
//			arr[k] = larr[i];
//			i++;k++;
//		}
//		while(j<n2) {
//			arr[k] = rarr[i];
//			j++;k++;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//}

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = { 9, 5, 3, 7, 2, 1, 6, 8, 4 };
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(array, start, left, 0, n1);
        System.arraycopy(array, mid + 1, right, 0, n2);

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < n1) {
            array[k++] = left[i++];
        }

        while (j < n2) {
            array[k++] = right[j++];
        }
    }
}