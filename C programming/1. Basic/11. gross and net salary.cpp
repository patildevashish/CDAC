/* Ramesh’s basic salary is input through the keyboard his DA is 40% of the basic salary
and H.R.A is 25%, P.F=20% and TA is 30% of the basic salary.WAP to calculate the gross
salary and net salary.*/

#include<stdio.h>

int main()
{
    int s,da, hra,pf,ta,gs,ns;
    printf("Input the salary: ");
    scanf("%d",&s);
    da = s * 40/100;
    hra = s * 25/100;
    pf = s * 20/100;
    ta = s * 30/100;

    gs = s + da + hra + pf + ta;
    ns = gs - da + hra + pf + ta;

    printf("The Gross salary is: %d",gs);
    printf("\n The Net salary is: %d",ns);
}