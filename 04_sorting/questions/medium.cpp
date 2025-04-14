#include<bits/stdc++.h>
using namespace std;



vector<int> bruteUnion(vector<int>& arr1,vector<int>& arr2){
    set<int> people;
    vector <int> arr;
    for(int ele: arr1){
        people.insert(ele);
    }
    for(int ele:arr2){
        people.insert(ele);
    }

    for(const auto& uni: people){
        arr.push_back(uni);
    }

    // for(const auto& ele: arr){
    //     cout<<ele<<endl;
    // }

    return arr;
}

vector<int> optimalUnion(vector<int>arr1,vector<int>arr2){
    vector<int> ans;
    int a = arr1.size();
    int b = arr2.size();
    int i = 0;
    int j = 0;
    while (i<a && j<b)
    {
       if(arr1[i]<=arr2[j]){
        if(ans.size()==0 || ans.back() != arr1[i]){
            ans.push_back(arr1[i]);
        }
        i++;
       }
       else {
        if(ans.size()==0 || ans.back() != arr2[j]){
            ans.push_back(arr2[j]);
        }
        j++;
       }
    }

    while (j<b)
    {
        if(ans.size()==0 || ans.back() != arr2[j]){
            ans.push_back(arr2[j]);
        }
        j++;
    }
    while (i<a)
    {
        if(ans.size()==0 || ans.back() != arr1[i]){
            ans.push_back(arr1[i]);
        }
        i++;
    }
    
    
    


    return ans;
}

int main(){
   
  
    vector<int>arr1  = {1,2,3,4,5,6,7,8,9,10};
    vector<int>arr2= {2,3,4,4,5,11,12};
    

    for(int ele: bruteUnion(arr1,arr2)){
        cout<<ele<<" ";
    }
    return 0;
}




