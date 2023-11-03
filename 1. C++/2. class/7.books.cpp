/*
Define a class BOOK with the following specifications :
Private members of the class BOOK are
BOOK NO integer type
BOOKTITLE 20 characters
PRICE float (price per copy)
TOTAL_COST() A function to calculate the total cost for N number of copies 
where N is passed to the function as argument. 
Public members of the class BOOK are
INPUT() function to read BOOK_NO. BOOKTITLE, PRICE
PURCHASE() function to ask the user to input the number of copies to be 
purchased. It invokes TOTAL_COST() and prints the total cost to 
be paid by the user. 
Note : You are also required to give detailed function definitions.
*/
#include <iostream>
using namespace std;

class BOOK {
private:
    int BOOK_NO;
    char BOOKTITLE[20];
    float PRICE;
    void TOTAL_COST(int N) 
    {
        float total_cost = PRICE * N;
        cout << "The total cost to be paid by the user is " << total_cost << "." << endl;
    }

public:

    void INPUT() {
        cout << "Enter BOOK_NO: ";
        cin >> BOOK_NO;
        cout << "Enter BOOKTITLE: ";
        cin >> BOOKTITLE;
        cout << "Enter PRICE: ";
        cin >> PRICE;
    }

    void PURCHASE() {
        int N;
        cout << "Enter the number of copies to be purchased: ";
        cin >> N;
        TOTAL_COST(N);
    }
};

int main() {
    BOOK b;
    b.INPUT();
    b.PURCHASE();
}
