#include<iostream>
using namespace std;
class Solution {
public:
    int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
       
        int start=1;
        int end=x;
        int result=1;
        
        while(start<=end){
            long mid=start+(end-start)/2;
            
            if((mid*mid)<=x){
                result=mid;
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
            
        }
        return result;
        
    }
};
int main(){
    int n;
    Solution s;
    cout<<"Enter the number:";
    cin>>n;
    cout<<"sqrt: "<<s.mySqrt(n);
}