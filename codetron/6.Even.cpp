//Write a program to print EVEN numbers from 1 to N using a while loop in cpp.
#include<iostream>
using namespace std;
int main() 
{
    int n,i=0;
    cout<<"Enter the number: ";
    cin>>n;
    while(++i<=n)
    {
        if (i%2==0)
        {
            cout<< ("\n")<<i;
        }
    }
}
