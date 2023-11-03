/*WAP TO CALCULATE COMMISSION IF SALE AMOUNT IS GREATER THAN 1000 AND COMMISSION IS 15% */
#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter the sell amount: ");
    scanf("%d",&a);
    if (a>1000)
    {
        b = a * 15/100;
        printf("The 15%% commission is %d",b);
    }
    else printf("There is no commission");
}