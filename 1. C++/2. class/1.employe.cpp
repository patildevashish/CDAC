//create a class employee with two data member emp name and id take two function for input and output
#include<iostream>
using namespace std;
class Employee
{
    string ename,eid;
    int salary;
    public:
    void get()
    {
        cout<<"\nEnter the Name of the Employee : ";
        cin>>ename;
        cout<<"\nEnter the Employee Id: ";
        cin>>eid;
        cout<<"\nEnter salary of employee:  ";
        cin>>salary;
    }
    void put()
    {
        cout<<"\nThe name of Employee is: "<<ename;
        cout<<"\nemployee id is: "<<eid;
        cout<<"\nSalary: "<<salary;
    }
    void cal_salary()
    {
        int sal;
        float pf=0.2, HRA=0.4;
        cout<<"\nEnter basic salary of Employee: ";
        cin>>sal;
        float s = (sal + HRA)-pf;
        cout<<"\nSalary of an Employee is: "<<s;
    }
    
};
    int main()
    {
        Employee e;
        e.get();
        e.put();
        e.cal_salary();
    }