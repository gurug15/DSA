package com.medium.quesitons.bsonans;

public class BinarySearchOnAnswers {
	
	public static int NthRoot(int N, int M) {
        long low = 1;
        long high = M;
        while(high>=low){
            long mid = (high + low)/2;
            long val = (long)Math.pow(mid, N);
            if(val == M) return (int)mid;
            if(val < M){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
	
	
	public static void main(String[] args) {
		System.out.println(NthRoot(3, 64));
	}

}
