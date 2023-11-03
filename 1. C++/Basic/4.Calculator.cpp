//Implement a Simple Calculator
#include<iostream>
using namespace std;
int main()
{
    int a,b,c,op;
    cout<<"Select the operation";
    cout<<"\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division\n";
    cin>>op;
    cout<<"Enter the two numbers: ";
    cin>>a>>b;
    switch (op)
    {
    case 1:
        c = a+b;
        cout<<"The addition of "<<a<<" and "<<b<<" is: "<<c;
        break;
    case 2:
        c = a-b;
        cout<<"The subtraction of "<<a<<" and "<<b<<" is: "<<c;
        break;
    
    case 3:
        c = a*b;
        cout<<"The multiplication of "<<a<<" and "<<b<<" is: "<<c;
        break;
    
    case 4:
        c = a/b;
        cout<<"The division of "<<a<<" and "<<b<<" is: "<<c;
        break;

    default: cout<<"Enter the correct opearation.";
        break;
    }
}