package OtherCode;

public class Maventic {

	public static void main(String[] args) {
		char myChar[]= {'b','a','c','f','e','g','s','k','e','u'};
		constantFind(myChar);
		
	
	}
	
	public static void constantFind(char[] MyChar){
		
		int n =MyChar.length;
		
//		ArrayList<Character> ans = new ArrayList<>();
		int ans=0;
		
		for(int i = 0;i<n;i++) {
			int countLeft = 0,countRight = 0;
			for(int j = 0; j<i;j++) {
				if(MyChar[j]=='a' || MyChar[j]=='e' || MyChar[j] == 'i' || MyChar[j] == 'o' || MyChar[j] == 'u') {
				countLeft++;
			}
			}
			
			for(int j = n-1; j>i;j--) {
				if(MyChar[j]=='a' || MyChar[j]=='e' || MyChar[j] == 'i' || MyChar[j] == 'o' || MyChar[j] == 'u') {
				countRight++;
				
			}
			}
//			System.out.println("For " +MyChar[i]+" -> leftCount: "+countLeft+" rightCount : "+countRight);
			if(countLeft==countRight  && (MyChar[i]!='a' && MyChar[i]!='e' && MyChar[i]!= 'i' && MyChar[i]!='o' && MyChar[i]!='u')) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		
		
		
		
	}


}
