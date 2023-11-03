// Write a program to find the cube of a number use loop
#include<iostream>
using namespace std;

int main()
{
    int a,cube;
    cout<<"\nEnter the number: ";
    cin>>a;

    while (a>=1)
    {
        cube = a * a *a;
        cout<<"\nThe cube of no is: "<<cube;
        break;
    }
    
    
}