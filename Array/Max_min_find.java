package Array;
import java.util.Scanner;

public class Max_min_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		
		int[] Arr = new int[10];
		
		Scanner x = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			Arr[i] = x.nextInt();
		}
		
		for(int i : Arr) {
			if (i>max) {
				max = i;
			}
			
			if (i<min) {
				min = i;
			}		
		}
		
		System.out.println("Max : " + max + " And Min : " + min);
		x.close();
		

	}

}
