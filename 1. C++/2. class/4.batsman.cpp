/* Define a class batsman with the following specifications:
Private members:
bcode 4 digits code number
bname 20 characters
innings, notout, runs integer type
batavg it is calculated according to the formula –
 batavg =runs/(innings-notout)
calcavg() Function to compute batavg
Public members:
readdata() Function to accept value from bcode, name, innings, notout 
and invoke the function calcavg()
displaydata() Function to display the data members on the screen.
*/
#include<iostream>
using namespace std;
class Batsmen
{
    private :
    int notout, innings, runs,batAvg;
    char bname[20];
    int bcode;
    
    int calcavg()
    {
        batAvg= runs/(innings-notout);
        return batAvg;
    }
    public:
        void Takedata();
        void DisplayData ();


};
    void Batsmen::Takedata()
    {   
        while (true)
        {
            cout<<"\nEnter your Code: "; cin>>bcode;
            if(bcode>999 && bcode<=9999)
            {
                break;
            }
            else {cout<<"\nEnter correct code";}
        }
        cout<<"\n Enter Your Name: ";cin>>bname;
        cout << "\n Enter Inning and Not Outs: " ;
        cin >> innings >> notout;
        cout <<" \n Enter Runs Scored: " ;
        cin >> runs;
        calcavg();
    }
    void Batsmen::DisplayData ()
    {
        cout << "Batting Information for "<<endl;
        cout << "Code Number:" << bcode << endl;   
        cout << "Name :" << bname << endl;
        cout << "Innings :" << innings << endl;
        cout << "Notouts :" << notout << endl;
        cout << "Run Scored: " <<runs << endl;
        cout<<"Batsmen Avrage: "<< batAvg << endl;
    }
    int main()
    {
        Batsmen b;
        b.Takedata();
        b.DisplayData();
    }