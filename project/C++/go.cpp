
// bank management system
#include<iostream>
#include<string>
#include<time.h>
#include<cstdio>
#include<conio.h>
#include <fstream> 
#include<stdlib.h>
using namespace std;


int bal=1000,with_amt,trans_amt;
int dip_amt,accno,d, count=0;
string cname,cid,fname,sname,ac;
long long mob_num;
char dt;
ofstream file;

void create_account();
void menu();
void create_deposit();
void create_transfer();
void create_withdraw();
void account_details();
void trans_details();
void LastDetail();

void divider()
{
    for (int i = 0; i < 50; i++)
    {
        cout<<"-";
    }
}

int main()
{
    cout<<"\n\t--------Welcome to CDAC BANK--------\n";
    // cout<<"\n\t1) Create Account"<<endl;
    // cout<<"\t2) Deposit Money "<<endl;
    // cout<<"\t3) Withdraw Money "<<endl;
    // cout<<"\t4) Transfer Money "<<endl;
    // cout<<"\t5) Account details "<<endl;
    // cout<<"\t6) Transaction details"<<endl;
    // cout<<"\t7) Exit "<<endl;
    
    while (1)
    {
        menu();
        cout<<"\nEnter your choice: ";
        char ch=' ';
        cin>>ch;
        switch(ch)
        {
            case '1':
                system("cls");
                create_account();
            break;
        
            case '2':
                 system("cls");
                 create_deposit();
            break;

            case '3':
                system("cls");
                create_withdraw();
            break;

            case '4':
                system("cls");
                create_transfer();
            break;

            case '5':
                system("cls");
                account_details();
                break;
            
            case '6':
                system("cls");
                trans_details();
                break;
            
            case '7':
                system("cls");
                LastDetail();
                cout<<"\nThank You\nHave a nice day.";
                exit(0);
            default:
                cout<<"Wrong Choice!";
        }
    }
    return 0;   
}   
    void menu()
        {
            
            divider();
            cout<<"\n\tMENU\n";

            divider();
            cout<<"\n1.Create account\n";
            cout<<"2.Deposit Money\n";
            cout<<"3.Withdraw Money\n";
            cout<<"4.Transfer Money\n";
            cout<<"5.Account details\n";
            cout<<"6.Transaction details\n";
            cout<<"7.Exit\n";
            divider();
        }
    void create_account()
    {

        time_t tm = time(0);
        char* dt = ctime(&tm);
        cout<<"\nNote:- This Feature helps you to create account";
        cout << "\n Enter the name of customer : " ;
        cin >>cname;
        cout << "\n Enter surname of customer : " ;
        cin>>sname;
        cout <<"\nEnter the account number provided by bank:" ;
        cin >>accno;
        cout<<"\nEnter Mobile Number: ";
        cin>>mob_num;
        cout<<"\nEnter customer id: ";
        cin>>cid;
        cout <<"\n---------------Account created successfully!!-------------------" ;
        cout << "\nBalance=" << "Rs. " << 1000<<"\n"<<dt;

        cout<<"\nPress any key....\n";
        getch();
    }

    void create_deposit()
    {
    time_t tm = time(0);
    char* dt = ctime(&tm);
    ofstream file("Account.txt");
    cout<<"\nThis function is used to deposit your money in bank\n";
    cout<<"*****DEPOSITING MONEY*****\n";
    
    for (int i = 0; i < 50; i++)
    {
        cout<<"-";
    }

    cout<<"\nEnter the amount you want to deposit\n";
    cin>>dip_amt;
    bal += dip_amt;
    cout<<"****Money Deposited****\n";
    cout<<"Now balance : \n"<<bal;
    file <<"\nThe amount deposited to your account: "<< dip_amt<<"\n";
    file << "Date/Time of transaction :  \n"<<dt;
    count++;

    file.close();
    cout<<"\nPress any key....\n";
    getch(); 
    }
    
    void create_withdraw()
    {
        time_t tm = time(0);
        char* dt = ctime(&tm);
        ofstream file("Account.txt");
        cout<<"\nThis feature is use to take out your cash from bank\n";
        cout<<"*****WITHDRAWING MONEY*****\n";
        for (int i = 0; i < 50; i++)
        {
            cout<<"-";
        }

        cout<<"\nEnter the amount you want to withdraw\n";
        cin>>with_amt;

        if (bal < with_amt)
        {
            cout<<"****Insufficient balance****\n";
        }
        else
        {
            bal = bal - with_amt;
            cout<<"*****Money withdrawn*****\n";
            cout<<"Current balance : "<< bal<<"\n";
            cout<<"\nDate/Time of transaction :  "<< dt;
            file<< "\nAmount withdrawn from your account: Rs. "<<with_amt;
            file<<"\nDate/Time of transaction :  "<< dt;
            count++;
        }
        file.close();
        cout<<"Press any key....\n";
        getch();
    }

    void create_transfer()
    {
        time_t tm = time(0);
        char* dt = ctime(&tm);
        ofstream file("Account.txt");
        cout<<"\nThis feature is use to transfer amount to another account\n";
        cout<<"*****TRANSFERRING MONEY*****\n";
        for (int i = 0; i < 50; i++)
        {
            cout<<"-";
        }

        cout<<"\nEnter the account no. in which you want to transfer the money : ";
        cin>>ac;
        cout<<"\nEnter the amount you want to transfer\n";
        cin>>trans_amt;

        if (bal < trans_amt)
        {
            cout<<"****You have not sufficient balance****\n";
        }
        else
        {
            bal = bal - trans_amt;
            cout<<"****Money Transferred****\n";
            cout<<"Current balance : "<<bal<<"\n";
            file<<"\nRs"<<trans_amt<<"had been transferred from your account to "<< ac<<"\n";
            file<< "Date/Time of transaction : "<<dt<<"\n";
            count++;
        }
        cout<<"\nDate/Time of transaction :  "<< dt;
        file.close();
        cout<<"Press any key....\n";
        getch();
    }

    void account_details()
    {
        cout<<"\nThis feature is use to view your account details\n";
        cout<<"ACCOUNT DETAILS\n";
        for (int i = 0; i < 50; i++)
        {
            cout<<"-";
        }

        cout << "\nName : " << cname<<"\t"<<sname;

        cout<<"\nCustomer id: "<<cid<<endl;
        cout << "Register Mobile Number: " << mob_num << endl;
        cout << "Account No. : " << accno << endl;
        cout<<"Total balance = "<<bal<<"\n";
        cout<<"\n"<<count<< " transactions have been made from your account \n";
        cout<<"Press any key.....";
        getch();
    }

void trans_details()
{
    system("cls");
    ifstream file("Account.txt");
    cout<<"\nThis feature is use to show transaction history\n";
    char c = file.get();
    if (c == EOF)
    {
        cout << "TRANSACTION DETAILS\n";
        divider();
        cout << "\n*******NO RECENT TRANSACTION*******\n";
    }
    else
    {
        cout << "TRANSACTION DETAILS\n";
        divider();
        int count = 0;
        while (c != EOF) // EOF=End of file
        {
            cout << c;
            c = file.get();
            count++;
        }
        cout<<"\n"<<count<< " transactions have been made from your account \n";
    }
    getch();
}

void LastDetail()
{
    cout << "ACCOUNT DETAILS" << endl;
    for (int i = 0; i < 50; i++)
    {
        cout << "-";
    }
    cout << endl;
    cout << "Name : " << cname;
    cout<<"\t"<<sname;
    cout<<"\nCustomer id: "<<cid<<endl;
    cout << "Register Mobile Number: " << mob_num << endl;
    cout << "Account No. : " << accno << endl;
    cout << endl << endl << "Press any key to exit.....";
    cin.get();
}