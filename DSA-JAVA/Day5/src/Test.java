import java.util.Arrays;

public class Test {
	
	 public static void sortColors(int[] nums) {
	        int red = 0;
	        int white = 0;
	        int blue = 0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0){
	                red++;
	            } else if(nums[i]==1){
	                white++;
	            }else{
	                blue++;
	            }
	        }
	        
	        
	        for(int i = 0; i < red; i++){
	            nums[i] = 0;
	        }
	        for(int i = red-1; i < white; i++){
	            nums[i] = 1;
	        }
	        for(int i = red+white-1; i < blue; i++){
	            nums[i] = 2;
	        }
	    }
	
	public static void main(String[] args) {
		int[] arr = new int[]{2,0,2,1,1,0};
		System.out.println(Arrays.toString(arr));
		sortColors(arr);
		System.out.println(Arrays.toString(arr));

	}

}
