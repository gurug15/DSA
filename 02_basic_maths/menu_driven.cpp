#include<iostream>
using namespace std;

void Menu(int arr[], int size ,int slide){
    if(slide>=size){
        slide = slide%size;
    }
    for(int i=0;i<slide;i++){
        int lastEle = arr[size-1];
        for(int j=size-1;j>0;j--){
            arr[j] = arr[j-1];
        }
        arr[0] = lastEle;
    }


}

void swap(int *a,int *b){
    int temp = *a;
    *a=*b;
    *b =temp;
}

void reverse(int arr[],int s, int e){
    while(s<e){
        swap(arr[s],arr[e]);
        s++;
        e--;
    }
}
void efficient_Menu_left(int arr[], int size ,int slide){
    if(slide>=size){
        slide = slide%size;
    }
    reverse(arr,0,size-1);
    reverse(arr,0,slide-1);
    reverse(arr,slide,size-1);

}
void efficient_Menu_right(int arr[], int size ,int slide){
    if(slide>=size){
        slide = slide%size;
    }
    reverse(arr,0,slide-1);
    reverse(arr,slide,size-1);
    reverse(arr,0,size-1);
    
    

}


int main(){ 
     int arr[] = {10,20,30,40,50,60,70,80,90};
    // efficient_Menu_left(arr,9,5);
    // for(int i=0;i<9;i++){
    //     cout<<arr[i]<<" ";
    // }
    cout<<endl;
    efficient_Menu_right(arr,9,5);

    for(int i=0;i<9;i++){
        cout<<arr[i]<<" ";
    }
     
    return 0;
}