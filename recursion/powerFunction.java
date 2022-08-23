package recursion;

public class powerFunction {
	
	public static void main(String[] args) {
		System.out.println(power(2, 5));
		
	}
	
	public static int power(int n,int x) {
		
		return x==0?1:n*power(n,x-1);
}

}
