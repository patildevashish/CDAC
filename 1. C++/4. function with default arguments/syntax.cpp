//Function with default argument.

#include<iostream>
#include<conio.h>
using namespace std;
class demo
{
    int a,b,c;
    public:
        void fun(int a,int b=20,int c=10);
};
void demo::fun(int a,int b,int c)
{
    int d=a+b+c;
    cout<<"Addition = "<<d;
}
int main()
{
    demo d1;
    int a;
    cout<<"Enter the value of a\n";
    cin>>a;                                 //cin>>a>>b>>c;
    d1.fun(a);                             //d1.fun(a,b,c);
    getch();
}