package Array;

public class NegativeNumberLeftSide {

	public static void main(String[] args) {		
		int[] arr = {2,4,-1,-8,2,4,-5,-7,2,-3};	
		int i =0,j = 0;
		
		for(i = 0;i<arr.length;i++) {
			if(arr[i]<0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;	
			}
		}
		System.out.println("Sorted Array : ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
