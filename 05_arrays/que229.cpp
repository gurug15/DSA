#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
     vector<int> majorityElement(vector<int>& nums) {
        map<int,int> ans;
        vector<int> count;
        for(int i=0;i<nums.size();i++){
            ans[nums[i]]++;
            if(ans[nums[i]]==nums.size()/3+1){
                count.push_back(nums[i]);
            }

        }
        
        // for(auto ele : ans){
        //     if(ele.second > nums.size()/3)
        //         count.push_back(ele.first);
        // }

        return count;
    }
};


int main(){

    vector<int> arr{2,2};
    Solution sc;
    // cout<<sc.majorityElement(arr).at(0)<<" "<<sc.majorityElement(arr).at(1);
    cout<<-1/2;
    return 0;
}


