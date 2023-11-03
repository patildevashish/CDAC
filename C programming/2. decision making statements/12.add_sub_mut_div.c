/* WAP for addition, subtraction, Multiplication and division using switch case*/
#include<stdio.h>

int main()
{
    int a,s,m,d,o,p,op;
    printf("1.addition \n2.subtraction \n3.Multiplication \n4.division \n");
    scanf("%d",&op);
    printf("Enter the two numbers: \n");
    scanf("%d%d",&o,&p);
    switch (op)
    {
    case 1:
        a=o+p;
        printf("The addition of %d and %d nos is: %d",o, p, a);
        break;
    case 2:
        s=o-p;
        printf("The addition of %d and %d nos is: %d",o, p, s);
        break;
     case 3:
        m=o * p;
        printf("The addition of %d and %d nos is: %d",o, p, m);
        break;
     case 4:
        d=o/p;
        printf("The addition of %d and %d nos is: %d",o, p, d);
        break;
    default:
    {
        printf("Enter correct operation");
    }
        break;
    }
}