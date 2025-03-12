#include<bits/stdc++.h>
using namespace std;

int main(){
    int prev=0,current=0,count=0;
    vector<int> v =  {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
    
    while(prev+current<11){
        if(v[prev]==0){
            count = -1;
            break;
        }
        current = v[prev];
        prev = prev + current;
        count++;
    }
    cout<<count;
    return 0;
}