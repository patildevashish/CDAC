//structure example.
#include<iostream>
using namespace std;

class student
{
private:
    int prn_no;
    char name[20];
    public:
        void get();
        void put();
};
    void student::get()
    {
        cout<<"\nEnter prn no and name: ";
        cin>>prn_no>>name;
    }
    void student::put()
    {
        cout<<"\n prn no is: "<<prn_no<<"\n";
        cout<<"\n name is: "<<name<<"\n";
    }