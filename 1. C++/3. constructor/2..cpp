
#include<iostream>
#include<string.h>
using namespace std;
class Test
{
 char paper[20];
 int marks;
    public:
    Test () // Function 1
    {
        strcpy (paper, "Computer");
        marks = 0;
    }
    Test (char p[]) // Function 2
    {
        strcpy(paper, p);
        marks = 0;
    }
    Test (int m) // Function 3
    {
        strcpy(paper,"Computer");
        marks = m;
    }
    Test (char p[], int m) // Function 4
    {
        strcpy (paper, p);
        marks = m;
    }
};
int main()
{
    Test t,t1(""),t2(5),t3("",5);
}
