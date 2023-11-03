//WAP to create a calculator
#include<iostream>
using namespace std;
int cal(int,int);
int cal(int,int);
int cal(int, int);
float cal(float, float);

int main()
{
    float a,b,c,d,e,f,g,h,x,y;
    float sum,sub,mul,div;
    cout<<"\nEnter any two numbers: ";
    cin>>x>>y;
    sum = cal(a,b);
    sub = cal(c,d);
    mul = cal(e,f);
    div = cal(g,h);
    cout<<"\nThe addition is: "<<sum;
    cout<<"\nThe subtraction is: "<<sub;
    cout<<"\nThe multiplication is: "<<mul;
    cout<<"\nThe division is: "<<div;
}
int cal(int a, int b)
{
    int o;
    o =a+b;
    return o;
}
float cal(float c, int d)
{
    int p;
    p = c-d;
    return p;
}
float cal (int e, float f)
{
    int q;
    q=e*f;
    return q;
}
float cal(float g ,float h)
{
    float r;
    r = g/h;
    return r;
}
