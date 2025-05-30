#include<bits/stdc++.h>
using namespace std;
    
    int main(){
        vector<int> nums;
        double avg = 0;
        ifstream fin("one.txt");
        string line;
        if(fin.is_open())
        {
            while (getline(fin,line))
            {
                if(line !=""){
                    nums.push_back(stoi(line));
                }
            }
            fin.close();
        }else{
            cerr<<"error";
        }
        
        for(int num: nums){
            avg = avg + num;
        }
        cout<<avg/nums.size();
        return 0;
    }