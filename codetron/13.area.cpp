//Write a program by using switch case if user enter 11 it will have are area of circle and when user enter 22 it will have area of rectangle and when user enter 33 it will give area of square when user enter 44 it will give area of triangle
#include <iostream>
using namespace std;

int main() {
    int choice;
    float radius, length, width, side, base, height;
    float area;

    cout << "Enter your choice:\n";
    cout << "11. Calculate the area of a circle\n";
    cout << "22. Calculate the area of a rectangle\n";
    cout << "33. Calculate the area of a square\n";
    cout << "44. Calculate the area of a triangle\n";
    cin >> choice;

    switch (choice) {
        case 11:
            cout << "Enter the radius of the circle: ";
            cin >> radius;
            area = 3.14 * radius * radius;
            cout << "The area of the circle is: " << area;
            break;

        case 22:
            cout << "Enter the length and width of the rectangle: ";
            cin >> length >> width;
            area = length * width;
            cout << "The area of the rectangle is: " << area;
            break;

        case 33:
            cout << "Enter the side length of the square: ";
            cin >> side;
            area = side * side;
            cout << "The area of the square is: " << area;
            break;

        case 44:
            cout << "Enter the base and height of the triangle: ";
            cin >> base >> height;
            area = 0.5 * base * height;
            cout << "The area of the triangle is: " << area;
            break;

        default:
            cout << "Invalid choice!";
    }
}

    
    