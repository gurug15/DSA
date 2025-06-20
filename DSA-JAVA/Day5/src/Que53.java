
public class Que53 {

	
	public static int maxSum(int[] nums) {
        int sum = 0;
        int min =  Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>0) {
        		sum = sum+nums[i];
        	}else {
        		min = Integer.min(min, nums[i]);
        	}
        }
        
        return sum==0?min:sum;
    }
	
	public static  int maxSubArray(int []nums) {
		int sum =0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i+1;j++) {
				sum = sum + nums[j];
				
			}
			maxSum = Integer.max(maxSum, sum);
			if ( sum<0 ) sum = 0;
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		
		System.err.println(maxSum(arr));
		System.out.println(maxSubArray(arr));

	}

}
