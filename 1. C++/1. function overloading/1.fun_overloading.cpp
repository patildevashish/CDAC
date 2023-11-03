#include<iostream>
using namespace std;
int add(int,int);
int add(int,int,int);
float add(int,float);

int add(int a, int b)
{
    int o;
    o = a+b;
    return o;
}
int add(int x, int y,int z)
{
    int p;
    p = x+y+z;
    return p;
}
float add(int d, float e)
{
    float q;
    q = d+e;
    return q;
}
int main()
{
    cout<<"\nThe addition is: "<<add(4,5);
    cout<<"\nThe addition is: "<<add(5,6,7);
    cout<<"\nThe addition is: "<<add(4,2.5f);
}