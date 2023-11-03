/*
Define a class TEST in C++ with following description:
Private Members
TestCode of type integer
Description of type string
NoCandidate of type integer
CenterReqd (number of centers required) of type integer
A member function CALCNTR() to calculate and return the number of centers as
(NoCandidates/100+1)
Public Members
- A function SCHEDULE() to allow user to enter values for TestCode, Description, 
NoCandidate & call function CALCNTR() to calculate the number of Centres
- A function DISPTEST() to allow user to view the content of all the data members
*/

#include<iostream>
using namespace std;
class TEST
{
    private:
        int TestCode;
        string Description;
        int NoCandidate,a;
        int CenterReqd;
        int CALCNTR()
        {
            return (NoCandidate/100+1);
        }
        public :
        void Schedule()
        {
            cout<<"\nEnter test code: ";
            cin>>TestCode;
            cout<<"\nEnter the Description: ";
            cin>>Description;
            cout<<"\nEnter the total Canditates: ";
            cin>>NoCandidate;
            a = CALCNTR();
        }
        void DISPTEST()
        {
            cout<<"\nTest code: "<<TestCode;
            cout<<"\nDescription: "<<Description;
            cout<<"\nTotal Canditates: "<<NoCandidate;
            cout<<"\nNo. of centers: "<<a;
        }
};
    int main()
    {
        TEST t;
        t.Schedule();
        t.DISPTEST();
    }

