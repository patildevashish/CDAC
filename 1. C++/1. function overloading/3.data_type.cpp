/* WAP to print different data types by using function name print*/
#include<iostream>
using namespace std;

int print(int);
float print(float);
char print(char);
double print(double);

int main()
{
    int a;
    float b;
    char c;
    double d;
    cout<<"\nEnter the interger value: ";
    cin>>a;
    cout<<"\nThe interger value is: "<<print(a);

    cout<<"\nEnter the float value: ";
    cin>>b;
    cout<<"\nThe float value is: "<<print(b);

    cout<<"\nEnter character value: ";
    cin>>c;
    cout<<"\nThe character value is: "<<print(c);

    cout<<"\nEnter double value: ";
    cin>>d;
    cout<<"\nThe double value is: "<<print(d);
}
int print(int a)
{
    return a;
}
float print(float b)
{
    return b;
}
char print(char c)
{
    return c;
}
double print (double d)
{
    return d;
}