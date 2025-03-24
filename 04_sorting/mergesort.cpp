#include<iostream>
#include<vector>
using namespace std;


void merge(int * arr,int low,int mid,int high)
{
    vector<int> temp;
    int left_arr = low;
    int right_arr = mid+1;
    while(left_arr<=mid && right_arr<=high){
        if(arr[left_arr]<=arr[right_arr]){
            temp.push_back(arr[left_arr]);
            left_arr++;
        }else{
            temp.push_back(arr[right_arr]);
            right_arr++;
        }
    }

        while(left_arr<=mid){
            temp.push_back(arr[left_arr]);
            left_arr++;
        }
        
        while(right_arr<=high){
            temp.push_back(arr[right_arr]);
            right_arr++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
         }

    
}

void mergesort(int * arr,int low,int high){

    if(low>=high) return;
    int mid = (low + high)/2;
    mergesort(arr,low,mid);
    mergesort(arr,mid+1,high);
    merge(arr,low,mid,high);

}


int main()
{
    int arr[] = {43,23,24,52,5,1};

    mergesort(arr,0,5);
    
    for(int i=0;i<6;i++){
        cout<<arr[i]<<" ";
    }
    return 0;

}