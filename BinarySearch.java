package java_searching;
import java.util.Arrays;

public class BinarySearch {
	
	//used when the array is sorted;
	public static int binarySearch(int arr[],int x,int low,int high) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		int x=7;
		int index=binarySearch(arr,x,0,arr.length-1);
		
		System.out.print("The element "+x+" found in index "+index+".");


	}

}
