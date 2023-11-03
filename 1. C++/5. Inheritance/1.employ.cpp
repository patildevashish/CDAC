//base calss employe derive class is salary
#include<iostream>
using namespace std;
class employe
{
    protected: string ename;
        int id;
    public:
    void get()
    {
        cout<<"Enter employe id: ";
        cin>>id;
        cout<<"Enter the name of employe: ";
        cin>>ename;
    }

    void put()
    {
        cout<<"Employe id: "<<id;
        cout << "Employe name: "<<ename;
    }
};

class salary: public employe
{
    protected: int sal;
    public:
    void getin()
    {
        get();
        cout << "Enter the salary for employe: ";
        cin >> sal;
    }

    void putin()
    {
        put();
        cout<<"Salary: "<<sal;
    }
};
int main()
{
    salary s;
    s.getin();
    s.putin();
}