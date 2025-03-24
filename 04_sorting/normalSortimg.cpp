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
    for(int i=0;i<s-1;i++){
        int min = i;
        for(int j=i;j<s;j++){
            if(arr[j]<arr[min])
            {
                min = j;
            }
        }
        swap(arr[min],arr[i]);
    }

}

void insertion_sort(int *arr,int n)
{
    for(int i=0;i<n;i++)
    {
        int j=i;
        while(j>0 && arr[j-1]>arr[j])
        {
            swap(arr[j-1],arr[j]);
            j--;
        }

    }
}

void bubbleSort(int *arr,int s)
{
    for(int i = 0;i<s;i++)
    {
        int  ifswap =0;
        for(int j=0;j<=s-1-i;j++){
            if(arr[j]>arr[j+1])
            {
                swap(arr[j],arr[j+1]);
                ifswap =1;
            }

        }
        if(ifswap == 0){
            cout<<"already sorted\n"; //makes the best complixity as O(N);
            return;
        }
    }

}

int main()
{
    int arr[] = {43,23,24,52,5,1};
    
    insertion_sort(arr,6);
    //bubbleSort(arr,6);
    //selectoin_sort(arr,6);
    
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}