/*
1.A student appear in examination of five papers each paper contains 50 marks calculate total and
percentage of student and display the grades according to the following condition.
Percentage Grade
>=90 A+
80 to 89 A
70 to 79 B+
60 to 69 B
50 to 59 C
40 to 49 Fail. */
#include<iostream>
using namespace std;
int main()
{
    int p,c,m,b,e,t,per;
    cout<<"Enter the marks for 5 subjects: \n";
    cin>>p>>c>>m>>b>>e;
    t = p+c+m+b+e;
    per = t*100/250;
    if (per>=90)
    {
        cout<<"Your grade is A+ with per: "<<per;
    }
    else if (per>=80 && per<=89)
    {
        cout<<"Your grade is A with per: "<<per;
    }
    else if (per>=70 && per<=79)
    {
        cout<<"Your grade is B+ with per: "<<per;
    }
    else if (per>=60 && per<=69)
    {
        cout<<"Your grade is B with per: "<<per;
    }
    else if (per>=50 && per<=59)
    {
        cout<<"Your grade is C with per: "<<per;
    }
    else cout<<"Your are fail with per:"<<per;

}