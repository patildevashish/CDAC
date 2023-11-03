/* write a program to print reverse of string*/
#include<stdio.h>
#include<string.h>
int main()
{
    char str[20];
    int i;
    printf("\nEnter the string: ");
    scanf("%s",str);
    for ( i = 0; str[i]!='\0'; i++)
    {
        
    }
    printf("\nLength of string is: %d",i);
    printf("\nReverse of string is: %s",strrev (str));
}