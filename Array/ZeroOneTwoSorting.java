package Array;

public class ZeroOneTwoSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,2,1,0,2,0,0,1};
		
		int low = 0, mid = 0, high = arr.length-1;
		
		while(mid<=high) {
			if(arr[mid] ==0 ) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				
			}
			
			else if(arr[mid] ==1 ) {
			
				mid++;
				
			}
			
			else if(arr[mid] ==2 ) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				
			}
			
		}
		System.out.println("Sorted Array Is: ");
		for(int c: arr) {
			System.out.print(c + " " );
		}
		
		
		
	}
}
