//.Write a program to read an integer and print its multiplication table in cpp
#include <iostream> 
using namespace std;
int main() {
    int number =0,i;
    cout<<"Enter number: ";
    cin >>number;
    for ( i=1;i<=10;++i)
    {
        cout << " "<< number<<"*"<<i <<"="<<(number*i)<<"\n";
        }
        }