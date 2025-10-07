package TwoPointersPattern;


//Find if a sorted array has a pair with a given sum
//Input: [1, 2, 4, 4], target = 8
//Output: true
public class PairOfGivenSum {
	
	private static boolean pairPresent(int[] arr ,int target) {
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {
			int sum = arr[i] + arr[j];
			if(sum == target)
				return true;
			else if (sum > target)
				j--;
			else
				i++;
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 4, 4};
		int target = 8;
		
		System.out.println(pairPresent(arr, target));;

	}

}
