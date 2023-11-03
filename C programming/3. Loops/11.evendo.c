/*WAP TO PRINT EVEN NO FROM 1-10 using dowhile*/
#include<stdio.h>

int main()
{
    int i=1;
    do
    {
        if (i%2==0)
        {
            printf("%d\n",i);
        }
        i++;  
    } while (i<=10);
    
}