package java_searching;

public class Linearsearch {
	
	public static int linearsearch(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,4,6,3,89,13,5,2,7};
		int x=13;
		
		int index=linearsearch(arr,x);
		
		System.out.print("The element "+x+" found in index "+index+".");

	}

}
