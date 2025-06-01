#include<bits/stdc++.h>
using namespace std;


class Solution {
public:

    bool possible(vector<int>& arr, int days, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int i=0;i<arr.size();i++){
            if(arr[i] <= days){
                count++;
            }else{
                noOfB += (count/k);
                count = 0;            
            }
        }
        noOfB +=(count/k);
        return noOfB>=m;
    }


    int minDays(vector<int>& bloomDay, int m, int k) {
        long long val = 1LL * m  * k;
        if(val>bloomDay.size()) return -1;
        int maxi = INT_MIN;
        int mini = INT_MAX;
        for(int i = 0 ; i<bloomDay.size();i++){
            maxi = max(maxi,bloomDay[i]);
            mini = min(mini,bloomDay[i]);
        }
        while(maxi>mini){
            int mid = mini + (maxi - mini)/2;
            if(possible(bloomDay,mid,m,k)){
                maxi = mid -1;
            }else{
                mini = mid + 1;
            }
        }


        return mini;
    }
};


int main(){


    return 0;
}