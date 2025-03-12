#include<iostream>
using namespace std;

int reverse_integer(int n){
    int rev=0;
    while(n!=0){
        
      rev = rev*10 + n%10;

      n = n/10;
    }

    return rev;
}

int main(){
       cout<<-123%10<<endl;
       cout<<reverse_integer(-123)<<endl;
    //    int n = -123;
    //    for(int i=0;i<3;i++){
    //     cout<<n%10<<endl;
    //     n = n/10;
    //    }
    return 0;
}