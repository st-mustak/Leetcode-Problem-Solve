package Array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] Arr  = {10,5,8,7,6};
		System.out.println("New Array Beore Swapping : " );
		for(int ele : Arr) {
			System.out.print(ele + " ");}
		
		int start = 0,end = Arr.length - 1;
		
		while(start < end) {
			int temp = Arr[start];
			Arr[start] = Arr[end];
			Arr[end] = temp;
			start++;
			end--;
			

			
		}
		System.out.println("\nNew Array After Swapping : " );
		for(int ele : Arr) {
			System.out.print(ele + " ");
		}
		

	}
	
	

}


