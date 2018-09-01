// @author: Akshay Sharma(akshay31057)

// Program to illustrate the functioning of various operators

#include<stdio.h>
int main()
{

    int a, b, add, sub, div, mul, mod;
    scanf("%d %d", &a, &b);
    // Arithmetics Operators
    add = a + b; // Addition
    mul = a * b; // Multiplication
    sub = a - b; // Subtraction
    div = a / b; // Division
    mod = a % b; // Modulus
    printf("Addition: %d\n", add);
    printf("Subtraction: %d\n", sub);
    printf("Division(Quotient): %d\n", div);
    printf("Modulus(Remainder): %d\n", mod);

    // Relational Operators
    printf("%d > %d = %d\n", a, b, a > b);
    printf("%d >= %d = %d\n", a, b, a >= b);
    printf("%d < %d = %d\n", a, b, a < b);
    printf("%d <= %d = %d\n", a, b, a <= b);
    printf("%d == %d = %d\n", a, b, a == b);
    printf("%d != %d = %d\n", a, b, a != b);

    // Logical operators
    printf("(a > b) && (a < b) = %d\n", (a > b) && (a < b));
    printf("(a > b) || (a < b) = %d\n", (a > b) || (a < b));
    printf("!((a > b) || (a < b)) = %d\n", !((a > b) || (a < b)));

    // Bitwise Operators
    printf("a & b = %d\n", a & b);
    printf("a | b = %d\n", a | b);
    printf("~a = %d\n", ~a);
    printf("a ^ b = %d\n", a ^ b);
    printf("a >> 1 = %d\n", a >> 1);
    printf("a << 1 = %d\n", a << 1);


}
