package TwoPointersPattern;

//Is Subsequence
//Problem: Check if s is a subsequence of t.
//Input: s = "abc", t = "ahbgdc"
//Output: true
public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		String target = "qvckgambnc";
		int j = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			while( j < target.length() && str.charAt(i) != target.charAt(j)) {
				j++;
			}
			if(j == target.length()) {
				System.out.println("False");
				return;
			}
			j++;
		}
		
		System.out.println("True");

	}

}
