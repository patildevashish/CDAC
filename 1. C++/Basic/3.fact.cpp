//WAP to calculate simple interest. (si=p*n*r)/100.
#include<iostream>
using namespace std;
int main()
{
    float p,r,n,si;
    cout<<" Enter the profit: ";
    cin>>p;
    cout<<"Enter the time: ";
    cin>>n;
    cout<<"Enter the rate of intrest: ";
    cin>>r;
    si = (p*n*r)/100;
    cout<<"The simple interst is: "<<si;
}