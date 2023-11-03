//class inside the class
#include<iostream>
using namespace std;
class student
{
    private: 
        char name[20];
        int id;
    public:
        void get();
        void put();
    
    class address
    {
        private: 
            char city[20], state[20];
        public:
            void in();
            void put();
    };
};
void student::get()
{
    cout<<"\nEnter name of student: ";
    cin>>name;
    cout<<"\nEnter student id: ";
    cin>>id;
}
void student::put()
{
    cout<<"\nStudent name: "<<name;
    cout<<"\nid: "<<id;
}

void student::address::in()
{
    cout<<"\nEnter city name: ";
    cin>>city;
    cout<<"\nEnter name of state: ";
    cin>>state;
}
void student::address::put()
{
    cout<<"\nCity: "<<city;
    cout<<"\nState: "<<state;
}

int main()
{
    student s;
    student::address a;
    s.get();
    
    a.in();
    s.put();
    a.put();
}