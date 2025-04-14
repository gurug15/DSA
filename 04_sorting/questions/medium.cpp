#include<bits/stdc++.h>
using namespace std;



int main(){
    map <int,int> people;
    vector <int> arr;
    int arr1[]  = {1,2,3,4,5,6,7,8,9,10};
    int arr2[] = {2,3,4,4,5,11,12};
    for(int ele: arr1){
        people[ele]++;
    }
    for(int ele:arr2){
        people[ele]++;
    }

    for(const auto& uni: people){
        arr.push_back(uni.first);
    }

    for(const auto& ele: arr){
        cout<<ele<<endl;
    }
    return 0;
}




