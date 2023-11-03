//Swaping of to number using pointer and function
#include<iostream>
using namespace std;
void doit( int * , int *);
void doit(int *a , int *b)
{
    *a = *a + *b;
    *b = *a - *b;
    *a = *a -*b;
}
int  main()
{
    int n , n1;
    cout << "Enter any two number: ";
    cin >> n >> n1;
    cout << "\nBefore swaping: "<< n << "\t" << n1;
    doit(&n , &n1);
    cout << "\nAter swaping: "<< n << "\t" << n1;
}