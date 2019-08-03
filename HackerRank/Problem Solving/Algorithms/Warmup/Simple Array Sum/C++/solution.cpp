#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin >> n;
    //cout << n << endl;
    int array[n]; 
    int sum = 0;
    
    for(int x = 0; x < n; x++){
        
        cin >> array[x];
        sum += array[x];
        
    }
    
    cout << sum;
    return 0;
}
