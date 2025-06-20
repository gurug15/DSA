import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Que118 {
	
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
		
        
		for(int row=0;row<numRows;row++) {
			List<Integer> innerList = new ArrayList<Integer>();
			for(int col=0;col<=row;col++) {
				if(col==0 || col==row) {
					innerList.add(col,1);
				}else {
					int left = outer.get(row-1).get(col-1);
					int right = outer.get(row-1).get(col);
					innerList.add(col,left+right);
				}
				
			}
			outer.add(innerList);
		}
		
		
		return outer;
    }
	
	public static List<List<Integer>> generateOpt(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();
		
        
		for(int i=1;i<=numRows;i++) {
			List<Integer> innner  = new ArrayList<Integer>();
			innner.add(1);
			int prevAns = 1;
			for(int j=1;j<i;j++) {
				prevAns = prevAns * (i-j);
				prevAns = prevAns/j;
				innner.add(prevAns);
			}
			
			outer.add(innner);
		}
		
		
		return outer;
    }
	
	
	 public static boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        int i=0;
	        for(int j=0;j<nums.length-1;j++) {
	        	if(nums[i]==nums[j+1]) {
	        		return true;
	        	}else {
	        		i++;
	        	}
	        }
	        
	        return false;
	    }
	 
//	 public static boolean containsDuplicatemap(int[] nums) {
//	   Set<Integer> count = new HashSet<Integer>();
//	   for(int i=0;i<nums.length;i++) {
//		   count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
//		   if(count.get(nums[i])>1) {
//			   return true;
//		   }
//	   }
//	   
//	   return false; 
//	  }
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateOpt(5));
		int arr[] = {1,4,2,4,6,4};
		System.out.println(Arrays.toString(arr));
		System.out.println(containsDuplicate(arr));
		System.out.println(Arrays.toString(arr));

	}

}
