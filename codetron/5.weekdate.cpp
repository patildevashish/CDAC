//Write a program to print weekday of given date.
#include <iostream>
using namespace std;
int main()
{
    int d;
    cout << "Enter the day: ";
    cin >> d;
    switch (d) 
    {
        case 1 :
        cout<<"Sunday";
        break;
        case 2 :cout <<"Monday" ;break;
        case 3 :cout<< "Tuesday"<<endl;;break;
        case 4 :cout<<"Wednesday "<< endl;break;
        case 5 :cout<<"Thursday" ;break;
        case 6 :cout<<"Friday" ;break;
        case 7: cout<<"Saturday";break;
        default:cout<<"Invalid Day!" ;
    }
}