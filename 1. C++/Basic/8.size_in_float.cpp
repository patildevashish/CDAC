/* WAP to find the size of int, float, double and char.*/
#include<iostream>
using namespace std;
int main()
{
    int intType;
    float floatType;
    double doubleType;
    char charType;

    cout<<"The size of int is: "<<sizeof(intType);
    cout<<"\nThe size of float is: "<<sizeof(floatType);
    cout<<"\nThe size of double is: "<<sizeof(doubleType);
    cout<<"\nThe size of char is: "<<sizeof(charType);
}