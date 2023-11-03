//Write a program to find the sum of two matrices of order 2*2 using multidimensional arrays.
#include<iostream>
using namespace std;
int main() 
{
    int matrix[2][2], matrix1[2][2];
    cout<<"Enter elements for first Matrix: ";
    for(int i=0 ;i < 2;++i)
    for (int j = 0;j < 2;++j){
        cin>>matrix[i][j];}
        cout<<"\n Enter Elements For Second Matrix :";
        for(int k=0 ;k < 2;++k)
        for (int l = 0;l < 2;++l)
        {
            cin >> matrix1 [k] [l]; 
        }
            cout << "\n The Sum Of Two Matrices Is :";
        for(int m = 0;m < 2;++m) 
            {
                for (int n = 0;n < 2;++n)
                    cout <<" "<<matrix[m][n]+matrix1[m][n];
            }

}