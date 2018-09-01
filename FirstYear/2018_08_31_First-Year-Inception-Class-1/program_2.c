// @author: Akshay Sharma(akshay31057)
#include<stdio.h>

int main()
{
    // Type Declaration Statements

    int a;
    a = 1; // Integer type data

    long long int c = 45489794649; // Long integer type

    float b = 2.5; // Floating type data

    double d = 45879562.8;  // double type for larger decimal numbers

    char ch = 'e';

    printf("Data type programs!!!");

    // In C++, we have cout function
    // cout<<"Hello Freshers!!!";

    // Output instructions
    printf("%d\n",a);

    printf("%lld\n",c);

    printf("%f\n",b);

    printf("%lf\n",d);

    printf("%c", ch);

    // Input Instructions
    int a_inp;
    scanf("%d", &a_inp);


    float b_inp;
    scanf("%f", &b_inp);

    // In C++, we can use
    // cin >> a_inp;
    // cin >> b_inp;

    return 0;

}
