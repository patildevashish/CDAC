// Calculate the Factorial of a Number
#include<iostream>
using namespace std;
int main()
{
    int i,a,f=1;
    cout<<"\nEnter the number: ";
    cin>>a;
    for ( i = 1; i <= a; i++)
    {
        f = f *i;
    }
    cout<<"\nThe factorial is: "<<f;
}