#include<iostream>
#include<string>
using namespace std;


bool isAlpha(char ch) {
    if((ch>='0' && ch<='9') || (tolower(ch)>='a' && tolower(ch)<='z'))
    {
        return true;
    }
    return false;
}
bool isPalindrome(string s) {
    int st=0,e=s.length()-1;
    while(st<e){
        if(!isAlpha(s[st])){
            st++; continue;
        }
        if(!isAlpha(s[e])){
            e--; continue;
        }

        if(tolower(s[st]) != tolower(s[e])){
            return false;
        }
           
        st++;
        e--;
    }
    return true; 
}

int main(){

    return 0;
}