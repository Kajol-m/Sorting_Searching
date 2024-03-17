package java_sorting;

public class OptimizedBubbleSort {
	
	public static void BubbleSort(int[] arr) {   //time complexity:O(n^2)
		for(int i=0;i<arr.length-1;i++) {        //space complexity:O(n)
			boolean swapped=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		BubbleSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
