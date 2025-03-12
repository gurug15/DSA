#include<bits/stdc++.h>
using namespace std;

int main(){
    
    // pair<int, int> p = {1,3};
    // cout<<p.first<<" "<< p.second;
    // pair<int,pair<int, char>> p1 = {2,{2,'G'}};

    // cout<< p1.first<< " " << p1.second.first << " "<< p1.second.second;

    // pair<int, char> arr[2] = {{1, 'w'}, {2, 's'}};
   
    vector<int> v;
    v.push_back(1);
    v.emplace_back(3);
    v.emplace_back(10);
    v.emplace_back(2);
    v.emplace_back(4);
    // vector<pair<int,int>> v1;
    // v1.push_back({1,2});
    // v1.emplace_back(1,2);
    // vector<int> v2 (5,10);
    // vector<int> v3 (v);

    // //access vectors
    // cout<<v[0]<<" "<<v.at(0)<<endl;
    // cout<<v1[0].first<<" "<<v1.at(1).first<<endl;
    // cout<<v2[0]<<" "<<v2.at(0)<<endl;
    // cout<<v3[0]<<" "<<v3.at(0)<<endl;
    
    // vector<int>::iterator it = v.begin(); //it holds the addr of first element;
    // it+2;
    // cout<<*it<<endl;
    // // int k =10;
    // // int *p=&k;
    // // cout<<p<<endl;
    // for(vector<int>::iterator i = v.begin();v.end()!=i;i++){
    //     cout<<*i<<endl;
    // }
    //or
    for(auto i = v.begin();v.end()!=i;i++){
        cout<<*i<<endl;
        v.erase(i);
    }
    //or use for each
    // for(auto i: v){
    //     cout<<i<<" ";
    // }
    
    
    return 0;

}