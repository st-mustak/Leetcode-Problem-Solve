package recursion;

public class numberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPrint(5);

	}
	
	public static void numberPrint(int n) {
		
		if (n==0) {
			return;
		}
		
		numberPrint(n-1);
		System.out.println(n);
		// TODO Auto-generated method stub

	}
	
	

}
