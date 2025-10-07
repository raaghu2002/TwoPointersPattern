package TwoPointersPattern;

//Container With Most Water
//Problem: Find two lines that hold the most water.
//Input: heights = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Water = min(height1, height2) × distance between them
public class ContainerWithMostWater {
	
	private static int totalWater(int[] arr) {
		// TODO Auto-generated method stub
		
		int maxIndex = 0;
	      int minIndex = 0;
	      for(int i = 0 ; i < arr.length ; i++){
	        if(arr[i] > arr[maxIndex]){
	          minIndex = maxIndex;
	          maxIndex = i;
	        }else if(arr[i] > arr[minIndex] && arr[i] < arr[maxIndex]){
	          minIndex = i;
	        }
	      }
	      
	      int height = Math.min(arr[minIndex], arr[maxIndex]);
	      int width = Math.abs(maxIndex - minIndex);
	      int water = height * width;
		
		
		
		return water;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,8,6,2,5,4,8,3,7};
		
		System.out.println("Total water : " + totalWater(arr));

	}

	

}
