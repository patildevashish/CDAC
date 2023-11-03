
#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

int main()
{
    char s[138] ="Write a program which identifies words occuring multiple times on all the lines. if a word is occuring multiple times in different lines.";
    int len=0;
    ofstream obj("Multiple.txt");
    obj<<s<<endl;

    ifstream ds("Multile.txt");
    ds>>s;
    cout<< s;
    len=strlen(s);
    //cout<<"NO of uppercase "<<s.uppercase;
    cout<<len;
}