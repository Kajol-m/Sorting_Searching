package java_sorting;

public abstract class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,7,4,9,4,2};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
