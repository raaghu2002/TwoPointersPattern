package TwoPointersPattern;

//Longest Substring Without Repeating Characters
//Problem: Find the length of the longest substring without repeating characters.
//Input: s = "abcabcbb"
//Output: 3
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcabcbb";
		int res = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			int[] alf = new int[256];
			for(int j = i ; j < str.length() ; j++) {
				if(alf[str.charAt(j)] == 1) break;
				alf[str.charAt(j)]++;
				int len = j - i + 1;
				res = Math.max(res, len);
			}
		}
		
		System.out.println(res);
	}

}
