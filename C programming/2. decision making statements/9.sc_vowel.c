/* print vowel*/

#include<stdio.h>

int main()
{
    char ch;
    printf("Enter the vowel: ");
    scanf("%c",&ch);
    switch (ch)
    {
    case'a':
        printf("%c is the vowel",ch);
        break;
    case'e':
        printf("%c is vowel",ch);
        break;
    case'i':
        printf("%c is vowel",ch);
        break;
    case'o':
        printf("%c is vowel",ch);
        break;
    case'u':
        printf("%c is vowel",ch);
        break;
    default:
        printf("%c is constant",ch);
        break;
    }
}
