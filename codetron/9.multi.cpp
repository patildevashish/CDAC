//Write a program to Multiply without using Multiplication operator (*).
#include<iostream>
using namespace std;
int main() 
{
    float num1,num2, mult = 0;;
    cout<<"Enter the first number : "; cin>>num1;
    cout<<"\n Enter second number: ";cin >>num2;
    for (float i = 0; i < num2; i++)
    {
        mult += num1 ;
    }
    cout<<"the multiplication is: "<<mult;
}