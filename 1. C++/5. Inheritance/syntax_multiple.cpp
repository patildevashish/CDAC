#include<iostream>
using namespace std;

// class A
// {
//     private: int a;                                 
//     public:
//         int get()                                   
//         {
//             cout<<"\nEnter value for a";
//             cin>>a;
//             return a;
//         }
// };
// class B
// {
//     private: int b;                                 
//     public:
//         int put()                                   
//         {
//             cout<<"\nEnter value for b";
//             cin>>b;
//             return b;
//         }
// };

// class C: public A, public B
// {
//     private: int c,x,y;                                  
//     public:
//         void add()
//         {
//             x= get();                                         
//             y = put();
//             c = x+y;
//             cout<<"C"<<c;
//         }
// };
// int main()
// {
//     C c;
//     c.add();
// }


class A
{
    protected: int a;                             
    public:
        void get()
        {
            cout<<"\nEnter value for a";
            cin>>a;
        }
};
class B
{
    protected: int b;                                 
    public:
        void put()                                  
        {
            cout<<"\nEnter value for b";
            cin>>b;
        }
};

class C: public A, public B
{
    private: int c;                                  
    public:
        void add()
        {
            c = a + b;
            cout<<"C"<<c;
        }
};
int main()
{
    C c;
    c.get();
    c.put();
    c.add();
}
