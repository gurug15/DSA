#include<bits/stdc++.h>
using namespace std;
//selectoin sort


void swap(int& a,int &b)
{
    int temp = a;
    a=b;b=temp;
}

void selectoin_sort(int *arr,int s)
{
    for(int i=0;i<=s-2;i++){
        int min = i;
        for(int j=i;j<=s-1;j++){
            if(arr[j]<arr[min])
            {
                min = j;
            }
        }
        swap(arr[min],arr[i]);
    }

}


int main()
{
    int arr[] = {43,23,24,52,5,1};
    selectoin_sort(arr,6);
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}