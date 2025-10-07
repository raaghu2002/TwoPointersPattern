package TwoPointersPattern;

//Triplet with Zero Sum
//Input: arr = [-1, 0, 1, 2, -1, -4]
//Output: true
public class TripletWithZeroSum {
	
	private static boolean containsTripletWithZeroSum(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < arr.length - 3 ; i++) {
			int sum = 0;
			for(int j = i ; j < i + 3 ; j++) {
				sum += arr[j];
			}
			if(sum == 0)
				return true;
		}
			
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		
		System.out.println(containsTripletWithZeroSum(arr));

	}

}
