#include<bits/stdc++.h>
using namespace std;




int main()
{
    vector<int> array = {10,5,10,15,10,5,5,5,10};
    map<int,int> count;
    for(int i=0;i<array.size();i++){
        count[array[i]]++;
    }
    int max=-1,min=array.size(),maxele=-1,minele=-1;
    for(auto item:count){
        if(item.second > max){
            max = item.second;
            maxele = item.first;
        }
        if(item.second<min){
            min = item.second;
            minele = item.first;
        }
    }


    cout<<maxele<<endl;
    cout<<minele<<endl;
    return 0;
}