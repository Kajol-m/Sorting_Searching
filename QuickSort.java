package java_sorting;

public class QuickSort {
	
	public static int partition(int[] arr,int low,int high) {
		int pivot=arr[high];
		
		int i=(low-1);
		
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return (i+1);
	}
	
	static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			
			int p=partition(arr,low,high);
			
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,5,3,8,4,9,4,3};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
