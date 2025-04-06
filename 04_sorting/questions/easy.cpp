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
};


int main(){ 
    vector<int> a = {3,4,5,1,2};
    Solution s;
    //cout<<a.size();
    //cout<<s.isSorted(4,a)<<endl;
    cout<<s.check(a);

    return 0;
}



