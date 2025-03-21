#include<bits/stdc++.h>
using namespace std;



    bool comp(int a, int b) {
    return a < b;
    }
    int maxFrequency(vector<int>& num, int k) {
        sort(num.begin(), num.end(), comp);
        cout<<num.back();
        if(num.back()<=k) return num.size();
        int max = 1;        
        for(int i=0;i<num.size();i++){
            int count = 1;
            for(int j=1;j<num.size();j++)
            {
                int val = num[j]-num[i];
                if(val<=k){
                    count++;
                }else{
                    break;
                }
            }
            if(count>max){
                max = count;
            }
        }

        return max;
        
    }

int main(){
     vector<int> num = {1,4,8,13};
     int k  = 5;
     cout<<maxFrequency(num,k);

    return 0;
}