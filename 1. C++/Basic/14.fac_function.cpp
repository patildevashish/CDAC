// WAP to find factorial of no with return with argument
#include<iostream>
using namespace std;
int fact(int);
int main()
{
    int a,b;
    cout<<"Enter any no: ";
    cin>>a;
    b = fact(a);
    cout<<"The factorial is: "<<b;

}
int fact(int a)
{
    int i,fact=1;
    for(i =1; i <=a; i++)
    {
        fact = fact * i;
    }
    return fact;
}