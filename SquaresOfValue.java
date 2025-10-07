package TwoPointersPattern;
import java.util.Arrays;
import java.util.stream.*;


//Squares of a Sorted Array
//Problem: Return sorted squares of a sorted array.
//Input: arr = [-4, -1, 0, 3, 10]
//Output: [0, 1, 9, 16, 100]
public class SquaresOfValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4, -1, 0, 3, 10};
		
		IntStream array = Arrays.stream(arr);
		array.map(num -> num * num)
		.sorted()
		.forEach(num -> System.out.print(num + " "));	

	}

}
