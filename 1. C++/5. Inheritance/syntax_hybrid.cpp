#include<iostream>
using namespace std;

class student
{
    protected: char name[20];
        int id;
    public:
        void get()
        {
            cout << "Enter student id: ";
            cin >> id;
            cout << "Enter student name: ";
            cin >> name;
        }

        void put()
        {
            cout << "\nStudent id: "<< id;
            cout << "\nStudent name: "<< name;
        }
};

class test : public student
{
    protected: int m1, m2, m3, m4, m5;
    public: 
        void getin()
        {
            get();
            cout << "Enter marks of 5 subject: ";
            cin >> m1>>m2>>m3>>m4>>m5;
        }

        void putin()
        {
            put();
            cout << "\nMarks are: \n"<< m1<<"\n"<<m2<< "\n"<< m3<< "\n"<< m4<< "\n"<<m5;
        }
};

class sports
{
    protected: int sm;
    public:
        void show()
        {
            
            cout << "Enter the marks acquired in sports: ";
            cin>>sm;
        }

        void display()
        {
            
            cout << "\nsports marks: "<<sm;
        }
};

class Result: public test , public sports
{
    protected: int t;
    public:
        void total()
        {
            getin();
            show();
            putin();
            display();
            t = m1 +m2 +m3 +m4 + m5 +sm;
            cout << "\nTotal marks are: "<<t;
        }
};

int main()
{
    Result r;
    r.total();
}