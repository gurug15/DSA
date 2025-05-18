#include<bits/stdc++.h>
using namespace std;


int searchInsert(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size() -1;
        while(high>=low){
          int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid]> target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        
            return low;
    }



int main(){

    vector<int> arr  ={1,2,4,5};
    cout<<searchInsert(arr,3);
    return 0;
}