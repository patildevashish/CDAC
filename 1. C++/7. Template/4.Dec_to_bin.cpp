//WAP to convert decimal to binary
#include<iostream>
using namespace std;

class decimal
{
        int decinamlnumber;
    public: 
        decimal(int n)
        {
            decinamlnumber = n; 
        }
        friend void convert(decimal obj);
};

void convert( decimal obj)
{
    
    int binary[100];
    int i=0;
    int n = obj.decinamlnumber;
    while (n>0)
    {
        binary[i] = n%2;
        n = n/ 2;
        i++;
    }
    



}