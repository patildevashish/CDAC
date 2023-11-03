//A program to read a file.
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    char str[20];
    int a;
    ifstream obj("read.txt");
    obj>>str>>a;
    cout<<str<<endl<<a;
}
