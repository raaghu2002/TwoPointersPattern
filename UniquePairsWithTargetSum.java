package TwoPointersPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//All Unique Pairs with Target Sum
//Input: arr = [1, 2, 3, 4, 5], target = 6
//Output: [(1,5), (2,4)]
public class UniquePairsWithTargetSum {
	
	private static List<List<Integer>> findUniquePair(int[] arr, int target, List<List<Integer>> result) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target)
					result.add(Arrays.asList(arr[i] , arr[j]));
			}
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		int target = 6;
		
		List<List<Integer>> result = new ArrayList<>();
		
		System.out.println(findUniquePair(arr , target , result));
		

	}

	

}
