package set1.q2.Beans;

public class Sort {

	//Sorting Using Modified Bubble Sort
	public void Modifiedbubblesort(int[] arr) {
//		int it=1;
		for (int i = 0; i < arr.length; i++) {
			boolean flag=false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
			}
			if(!flag) {
//				System.out.println("it= "+it);
				break;
			}
//			it++;
		}
		
	}

	//Sorting Using Selection Sort
	public void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}
	
}