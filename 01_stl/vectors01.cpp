#include<bits/stdc++.h>>
using namespace std;

int main(){
    
    pair<int, int> p = {1,3};
    cout<<p.first<<" "<< p.second;
    pair<int,pair<int, char>> p1 = {2,{2,'G'}};

    cout<< p1.first<< " " << p1.second.first << " "<< p1.second.second;

    
    
    return 0;

}