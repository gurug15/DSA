#include<bits/stdc++.h>
using namespace std;

class Solution {
    public:
    int isSorted(int n, vector<int> a) {
        // Write your code here.
        for(int i=0;i<a.size()-1;i++){
            if(a[i]>a[i+1])
            {
                return 0;
            }
            
           
        }
        return 1;
    }
    
    bool check(vector<int>& nums) {     
    
    int drop =0;
    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]>nums[(i+1)%nums.size()]){
            drop++;
        }
    }
    if(drop>1){
        return false;
    }
    return true;
    }
    int removeDuplicates(vector<int>& nums) {
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]==nums[i+1]){
                nums.erase(nums.begin()+i+1);
                i=i-1;
            }
        }

        return nums.size();
    }
    void reverse(vector<int> &nums,int start,int end)
    {
        while(start<end){
            swap(nums[start],nums[end]);
            start++;
            end--;
        }
    }
    void rotate(vector<int>& nums, int k) {
        k = k%nums.size();
        // for(int i=0;i<k;i++)
        // {
        //     int temp = nums[nums.size()-1];
        //     for(int j=nums.size()-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0] = temp;
        // }
        reverse(nums,0,nums.size()-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.size()-1);
    }
};


int main(){ 
    vector<int> a = {3,4,5,1,2};
    Solution s;
    s.rotate(a,3);
    for(int x: a)
    {
        cout<<x<<" ";
    }
    return 0;
}



