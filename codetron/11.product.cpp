//Write a program to Calculate Product of Digits of a Number.

#include<iostream>
using namespace std;
int main() 
{
    int n,pro=1,rem;
    cout<<"Enter the number: ";
    cin>>n;
    while(n!=0)
    {
        rem = n%10;
        pro = pro*rem;
        n = n/10;
    }
    cout<<pro;
}