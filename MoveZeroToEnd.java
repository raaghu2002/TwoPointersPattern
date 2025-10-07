package TwoPointersPattern;

//Problem: Move all zeroes to the end while maintaining the order.
//Input: arr = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class MoveZeroToEnd {
	
	private static void zeroToEnd(int[] arr) {
		// TODO Auto-generated method stub
		
		int i = 0;
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,0,3,12};
		
		zeroToEnd(arr);

	}

}
