//create a class defining function overloading
#include<iostream>
using namespace std;
class fun_over
{
    private: 
    public:
        void add(int a, int b)
        {
            cout<< "Addition: "<<a+b;
        }
            

        void add(int a, int b, int c)
        {
            cout<< "\nAddition: "<<a+b+c;
        }
};
int main()
{
    fun_over f;
    
    f.add(1,2);
    f.add(3,4,5);
}