#include<bits/stdc++.h>
using namespace std;


int main()
{
    int size;
    cin>>size;
    char charArr[size];
    for(int i=0;i<size;i++){
        cin>>charArr[i];
    }

    //pre-Calculating
    int hash[26] = {0};
    for(int i=0;i<size;i++){
        int index = charArr[i] - 'a';
        hash[index] +=1;
    }
    int q;
    cout<<"enter query";
    cin>>q;
    cout<<"enter elements";
    while(q--)
    {
        char c;
        cin>>c;
        int index  = c - 'a' ;
        cout<<hash[index]<<endl;
    }

    return 0;
}