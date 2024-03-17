package java_sorting;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {    //time Complexity:O(n^2)
		for(int i=0;i<arr.length-1;i++) {            //space complexity:O(n)
			int minIndex=i;                          //take first index as minIndex
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {          //finds the index of the minimum value;
					minIndex=j;
					
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,7,4,9,4,2};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
