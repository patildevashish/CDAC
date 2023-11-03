/* WAP TO FIND THE NUMBER IS PRIME OR NOT*/
#include<stdio.h>
int main()
{
    int a,b=1,c;
    printf("Enter the number: ");
    scanf("%d",&a);
    while (a>=b)
    {
        if (a%b==0)
        {
            c++;
        }
        b++;
    }
        if (c==1)
        {
            printf("prime");
        }
        else printf("not prime");
    
}