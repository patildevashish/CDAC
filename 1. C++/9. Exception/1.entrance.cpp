//WAP to perform exception handling engg passout 50% percad 
#include <iostream>
using namespace std;

int main()
{
    string degree , Engineering="engg";
    float marks;
    int rank;
    try
    {
        cout << " Please Enter your degree: ";
        cin >> degree;
        cout << "Enter your percentage: ";
        cin >> marks;
        cout << "Enter your rank in pre-cad: ";
        cin>> rank;
        if ((degree == Engineering ) && marks>=50 && rank < 2000)
        { 
            cout << "You are eligible for CDAC";
        }
        else throw "Sorry not eligible. Please try again next time";
    }
    catch(const char* e)
    {
        cerr << e << endl;
    }
    
}