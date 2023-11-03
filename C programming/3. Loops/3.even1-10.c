/*WAP TO PRINT EVEN NO FROM 1-10*/
#include<stdio.h>
int main()
{
    int a=1;
    while (a<=10)
    {
       if (a%2==0)
       {
         printf("%d\n",a);
       }
       a++;
    }
}