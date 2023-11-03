/* class student data memb stu id and name get fun to take input put tyo display

*/
#include<iostream>
using namespace std;

class student
{
    protected: int stu_id;
        char name[20];
    public:
        void get()
        {
            cout<<"\nEnter the student id: ";
            cin>>stu_id;
            cout << "Enter the student name: ";
            cin >> name;
        }

        void put()
        {
            cout << "\nStudent id: " << stu_id;
            cout << "\nStudent name: " << name; 
        }
};

class science : public student
{
    private: 
        char s1[20], s2[20], s3[20];
    public:
        void getin()
        {
            get();
            cout << "Enter name of first subject: ";
            cin >> s1;
            cout << "Enter name of second subject: ";
            cin >> s2;
            cout << "Enter name of third subject: ";
            cin >> s3;
        }

        void putin()
        {
            put();
            cout << "\nsub1: " << s1;
            cout << "\nsub2: " << s2;
            cout << "\nsub3: " << s3;
        }
};

class commerce: public student
{
    protected: 
        char c1[20], c2[20], c3[20];
    public: 
        void input()
        {
            get();
            cout << "Enter name of first subject: ";
            cin >> c1;
            cout << "Enter name of second subject: ";
            cin >> c2;
            cout << "Enter name of third subject: ";
            cin >> c3;
        }

        void output()
        {
            put();
            cout << "\nsub1: " << c1;
            cout << "\nsub2: " << c2;
            cout << "\nsub3: " << c3;
        }
};

int main()
{
    char d;
    switch (d)
    {
    case 1:
        
        break;
    
    default:
        break;
    }
    science s;
    s.getin();
    s.putin();

    commerce c;
    c.input();
    c.output();

}