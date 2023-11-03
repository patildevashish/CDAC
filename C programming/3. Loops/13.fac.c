/* WAP TO CALCULATE THE FACTORIAL OF A NUMBER*/
#include<stdio.h>

int main()
{
    float a,f=1;
    printf("Enter the no: ");
    scanf("%f",&a);
   do 
    {
        f=f*a;
        a--;
    }
     while (a>=1);
    printf("the factorial is: %.1f",f);
}