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
    // void moveZeroes(vector<int>& nums) {
        
    //     if(nums.size()<2){
    //         return;
    //     }

    //     // if(nums.size()=)
        
    //     int j = nums.size()-1;

    //     for(int i=0;i<nums.size()-1;i++){
    //         cout << i << " " << j << " " << nums[i] << endl;
    //         if(nums[i]!=0){
    //             continue;        
    //         }
    //         if(nums[j]==0){
    //             j--;
                
    //         }
    //         if(i<j){
    //         swap(nums[i],nums[j]);
    //         }
    //     }

    //     sort(nums.begin(),nums.begin()+j);

    // }
    void moveZeroes(vector<int>& nums) {
        
        if(nums.size()<2){
            return;
        }
        //slow and fast two pointers
        int j = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        sort(nums.begin(),nums.begin()+j);
        for(int i=j;i<nums.size();i++){
            nums[i] = 0;
        }
        cout<<j<<endl;
    
    }
};

int singleNumber(vector<int>& nums) {
    
    if(nums.size()%2==0){
        return 0;
    }

    map<int,int> twice;

    for(int i=0;i<nums.size();i++){
        twice[nums[i]]++;
    }

    for(auto i: twice){
        if(i.second !=2){
            return i.first;
        }
    }
}


int findMaxConsecutiveOnes(vector<int>& nums) {
        int count =0;
        int maxCount = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxCount = max(maxCount,count);
        }

        return maxCount;
}


int main(){ 
    vector<int> a = {0,1,1,3,12};
    Solution s;
    s.moveZeroes(a);
    for(int x: a)
    {
        cout<<x<<" ";
    }
    return 0;
}



