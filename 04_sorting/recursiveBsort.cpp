#include<bits/stdc++.h>
using namespace std;

void swap(int& a,int &b)
{
    int temp = a;
    a=b;b=temp;
}
void recBubSort(int * arr,int size){

    if(size<=1) return;
    bool didswap = 0;
    for(int i=0;i<size-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            swap(arr[i],arr[i+1]);
            didswap = true;
        }
    }

    if(!didswap) return;

    recBubSort(arr,size-1);


}

int main()
{
    int arr[] = {43,23,24,52,5,1};
    recBubSort(arr,6);
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}