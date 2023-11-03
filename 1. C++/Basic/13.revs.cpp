// Reverse of string
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char s[20];
    cout<<"enter any string: ";
    gets(s);
    strrev(s);
    cout<<"The reverse string is: "<<s;
}