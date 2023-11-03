/*
Define a class student with the following specification
Private members of class student
admno integer
sname 20 character
eng. math, science float
total float
ctotal() a function to calculate eng + math + science with float return 
type.
Public member function of class student
Takedata() Function to accept values for admno, sname, eng, science and 
invoke ctotal() to calculate total.
Showdata() Function to display all the data members on the screen.*/

#include<iostream>
using namespace std;
class student
{
    private: 
        int admno;
        char sname[20];
        float eng,math,science,total;
        float ctotal()
        {
            return ( eng + math + science);
            
        }

    public:

    void Takedata()
    {
        cout<<"\nEnter Addmission number: ";
        cin>>admno;
        cout<<"\nEnter name of the student: ";
        cin>>sname;
        cout<<"Enter marks for English, Maths and Science: ";
        cin>>eng>>math>>science;
        total=ctotal();
    }
    void Showdata()
    {
        cout<<"\nAddmission number: "<<admno;
        cout<<"\nStudent Name: "<<sname;
        cout<<"\nTotal Marks scored: "<<total;
    }
};
    int main()
    {
        student s;
        s.Takedata();
        s.Showdata();
    }