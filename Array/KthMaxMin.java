package Array;

import java.util.Collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr = new int[7];
		
		Scanner x = new Scanner(System.in);
		for(int i=0;i<7;i++) {
			Arr[i] = x.nextInt();
		}
		
		x.close();
		
		PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
		PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
	
		
		// Kth Max Element
		
		for(int c : Arr ) {
			MinHeap.add(c);
			if (MinHeap.size()>3) {
				MinHeap.poll();
			}
		}
		System.out.println("3rd Max : " + MinHeap.peek());
		
		
		// // Kth Min Element
		
		for(int c : Arr ) {
			MaxHeap.add(c);
			if (MaxHeap.size()>3) {
				MaxHeap.poll();
			}
		}
		
		
		System.out.println("3rd Min : " + MaxHeap.peek());		
	} 
	
}
