#include<bits/stdc++.h>
using namespace std;

    vector<vector<int>> merge(vector<vector<int>>& arr) {
        vector<vector<int>> merge;

        sort(arr.begin(),arr.end());
        for(int i =0 ; i <arr.size();i++){
            if(merge.empty() || arr[i][0]>merge.back()[1]){
                merge.push_back(arr[i]);
            }else{
                merge.back()[1] = max(arr[i][1], merge.back()[1]);
            }
        }
        return merge;
    }


int main(){
    vector<vector<int>> arr = {{1,3},{2,6},{8,10},{15,18}};
    for (auto ele : merge(arr)) {
    cout << ele[0] << " " << ele[1] << endl;
    }

    
    
    return 0;
}