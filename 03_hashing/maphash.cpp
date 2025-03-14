#include<bits/stdc++.h>
using namespace std;



int main()
{
    int size;
    cin>>size;
    int arr[size]; 
    for(int i=0;i<size;i++){
        cin>>arr[i]; // [1,4,3,12,3,52,5,2,1]
    }

    map<int, int> mpp;
    for(int i=0;i<size;i++){
        mpp[arr[i]]++;
    }


    int q;
    cin>>q;
    while(q--)
    {
        int num;
        cin>>num;
        cout<<mpp[num]<<endl;
    }


    return 0;
}