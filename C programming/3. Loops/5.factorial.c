/* WAP TO CALCULATE THE FACTORIAL OF A NUMBER*/
#include<stdio.h>

int main()
{
    int a,f=1;
    printf("Enter the no: ");
    scanf("%d",&a);
    while (a>=1)
    {
        f=f*a;
        a--;
    }
    printf("the factorial is: %d",f);
}