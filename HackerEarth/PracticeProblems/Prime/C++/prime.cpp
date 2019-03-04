// Solution to Problem - Prime Number in C++ at hackerearth.com
// By Karel Vanhelden
#include <iostream>

using namespace std;

int main() {
    int num,i,count,n;
        cin >> num;
    for(n = 1;n<=num;n++){
        count = 0;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
 
        if(count==0 && n!= 1)
            cout << n << " ";
    }
    return 0;
}
