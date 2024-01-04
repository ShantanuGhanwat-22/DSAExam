package set1.q2.Test;

import java.util.Arrays;
import java.util.Scanner;

import set1.q2.Beans.Sort;



public class SortTest {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,34,23,7,89,89,0,4};
		int[] arr1 = {3,5,1,2,34,23,7,89,89,0,4};
//		int[] arr= {1,2,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		Sort s=new Sort();
		int ch=0;
		do {
			System.out.println("\n1: Bubble Sort\n2: Selection Sort\n3: Exit");
			System.out.println("Enetr Choice= ");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("given array= "+ Arrays.toString(arr));
				s.Modifiedbubblesort(arr);
				System.out.println("sorted array= "+ Arrays.toString(arr));
				break;
			case 2:
				System.out.println("given array= "+ Arrays.toString(arr1));
				s.selectionsort(arr1);
				System.out.println("sorted array= "+ Arrays.toString(arr1));
				break;
			case 3:
				System.out.println("Thanks...");
				break;				
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (ch!=3);

	}

}