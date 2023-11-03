/* write a program to print a no is prime or not*/

#include<stdio.h>

int main()
{
    int a, b=2,count=0;
    printf("Enter a nu: ");
    scanf("%d",&a);
    do
    {
        if (a%b==0)
        {
            printf("no is not prime");
            count++;
            break;
        }
        else{
            b++;
        }        
        
    } while (b<a);
    if(count==0){
        printf("Prime");
    }
    
}