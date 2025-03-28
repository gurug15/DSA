#include<bits/stdc++.h>
using namespace std;


void swap(int &a,int &b)
{
    int temp =a;
    a=b;
    b=temp;
}

int partion(vector<int> &arr,int low,int high)
{
    int pivoit = arr[low];
    int i = low;
    int j= high;
    while(i<j)
    {
        while(arr[i]<=pivoit && i<=high-1)
        {
            i++;
        }
        while(arr[j]>pivoit && j>=low-1){
            j--;
        }
        if(i<j) swap(arr[i],arr[j]);
    }

    swap(arr[low],arr[j]);
    return j;
}

void quicksort(vector<int> &arr,int low,int high)
{
    if(low<high){
        int parti = partion(arr,low,high);
        quicksort(arr,low,parti-1);
        quicksort(arr,parti+1,high);
    }
}


int main()
{
    vector<int> arr = {43,23,24,52,5,1};

    quicksort(arr,0,5);
    
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}