package java_sorting;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {//time Complexity:O(n^2)
		for(int i=0;i<arr.length-1;i++) {     //Space Complexity:O(n)
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {3,1,7,4,9,4,2};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		
	}

}
