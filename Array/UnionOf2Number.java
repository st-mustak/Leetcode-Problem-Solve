package Array;


import java.util.HashSet;
import java.util.Set;

public class UnionOf2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,5,7,6,3,4,5};
		int[] arr2 = {10,15,1,8,45,12};
		
		Set<Integer> mySet = new HashSet<>();
		
		
		for(int c:arr1) {
			mySet.add(c);
		}
		for(int c:arr2) {
			mySet.add(c);
		}
		
		System.out.println(mySet);
		

	}

}
