#include <iostream>
using namespace std;

class BinaryConverter {
    int decimalNumber;
public:
    BinaryConverter(int n) {
        decimalNumber = n;
    }
    friend void convertToBinary(BinaryConverter obj);
};

void convertToBinary(BinaryConverter obj) {
    int binaryNum[32];
    int i = 0;
    int n = obj.decimalNumber;

    while (n > 0) {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }

    cout << "Binary representation: ";
    for (int j = i - 1; j >= 0; j--) {
        cout << binaryNum[j];
    }
}

int main() {
    int n;
    cout << "Enter any number: ";
    cin >> n;
    BinaryConverter obj(n);
    convertToBinary(obj);
    return 0;
}
