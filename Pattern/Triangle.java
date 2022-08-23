package Pattern;

public class Triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 20;
		for (int i = 0;i<n;i++) {
			
			for(int j = 0;j<n-1-i;j++) {
				System.out.print(" ");
			}
			
			for(int j = n-1-i;j<n;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
