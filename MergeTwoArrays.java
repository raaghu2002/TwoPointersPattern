package TwoPointersPattern;

import java.util.ArrayList;
import java.util.List;

//Merge Two Sorted Arrays
//Problem: Merge two sorted arrays into one sorted array.
//Input: arr1 = [1,3,5], arr2 = [2,4,6]
//Output: [1,2,3,4,5,6]
public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		List<Integer> res = new ArrayList<>();
		
		int i = 0 ;
		int j = 0 ;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				res.add(arr1[i]);
				i++;
			}else {
				res.add(arr2[j]);
				j++;
			}
		}
		
		for(int k = i ; k < arr1.length ; k++) {
			res.add(arr1[k]);
		}
		
		for(int k = j ; k < arr2.length ; k++) {
			res.add(arr2[k]);
		}
		
		for(int num : res) {
			System.out.print(num + " ");
		}

	}

}
