// Design a class  num n with data member n take input in function
//class square ---n*n ----o/p
//class cube ----n*n*n-----o/p

#include<iostream>
using namespace std;

class num
{
    protected: int n;
    public:
        void get()
        {
            cout<<"\nEnter the number: ";
            cin>>n;
        }
};

class square:public num
{
    protected: int sq;
    public:
        void getin()
        {
            get();
            sq = n* n;
            cout<<"\nSquare of number is: "<<sq;
        }
};

class cube: public square
{
    protected: int cu;
    public:
        void put()
        {
            getin();
            cu = sq*n;
            cout<<"\nCube of number is: "<<cu;
        }
};
int main()
{
    cube c;
    c.put();
}