package TwoPointersPattern;

//Remove Duplicates from Sorted Array
//Problem: Remove duplicates in-place from a sorted array.
//Input: arr = [1,1,2,2,3,3]
//Output: [1,2,3]
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,3,3};
		
		int i = 0;
		for(int j = 0 ; j < arr.length ; j++) {
			if(arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
				
		}
		
		
		for(int k = 0 ; k <= i ; k++) {
			System.out.print(arr[k] + " ");
		}
		
		
	}

}
