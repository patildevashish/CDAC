/* length of string*/
#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char s[200];
    int len = 0;
    cout<<"Enter a string: ";
    gets(s);
    len = strlen(s);
    cout<<"length of string is: "<<len;
    
}