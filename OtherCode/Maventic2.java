package OtherCode;

public class Maventic2 {
	public static boolean isConsonant(char ele) {
		if(ele=='a'||ele=='e'|| ele=='i'||ele=='o'||ele=='u') {
			return false;
		}
		return true;
		
	}
	public static int countVowel(char myChar[],int start,int end) {
		int count=0;
		for(int i=start;i<=end;i++) {
			char ele=myChar[i];
			if(ele=='a'||ele=='e'|| ele=='i'||ele=='o'||ele=='u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		char myChar[]= {'b','a','c','f','e','g','s','k','e','u'};
		int ans=0;
		for(int i=0;i<myChar.length;i++) {
			if(isConsonant(myChar[i])) {
				int leftCount=countVowel(myChar, 0, i-1);
				int rightCount=countVowel(myChar, i+1, myChar.length-1);
				if(leftCount==rightCount) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}

}
