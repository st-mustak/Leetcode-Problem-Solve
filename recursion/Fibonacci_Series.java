package recursion;

import java.util.Scanner;

public class Fibonacci_Series {

	public static int fib(int N)
    {
        if(N <= 1)
            return N;
        
		int a = 0, b = 1;
		
		while(N-- > 1)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
        return b;
    }
	
	public static void main(String[] args) {	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		System.out.println("Fibonacci Series of " + n + " is :" + fib(n));
		sc.close();
	}
}
