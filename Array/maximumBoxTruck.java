package Array;

import java.util.Arrays;

public class maximumBoxTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrbox = {{4,5},{6,7},{3,5},{2,6},{3,7},{4,8}};
		
		int maxUnit = maximumUnits(arrbox,10);
		System.out.println("Result " + maxUnit);
	}
	
	
		public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        for (int[] box : boxTypes) {
            System.out.println( box[0] + " " + box[1]);
        }
            
     // Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // b[1] - a[1] may cause int overflow, credit to @Zudas.
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        System.out.println(" After Sorting");

        for (int[] box : boxTypes) {
            System.out.println( box[0] + " " + box[1]);
        }

        int boxes = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            }else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }

}