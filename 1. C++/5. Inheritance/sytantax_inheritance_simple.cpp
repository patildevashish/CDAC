
#include<iostream>
using namespace std;

class Base
{
    private: int a, b;
    public:
        void get()
        {
            cout<<"\nEnter two numbers: ";
            cin>>a>>b;
        }

        void show()
        {
            cout<<"A"<<a;
            cout<<"B"<<b;
        }
};

class Derive : private Base             // class Derive : public Base
{
    private:
    public:
    void display()
    {
        get();
        show();
        cout<<"\nCall the base: ";
    }
};
int main()                            //int main()
{                                     //{Derive d;  d.get();  d.show();}
    Derive d;
    d.display();
}