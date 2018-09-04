// @author: Akshay Sharma(akshay31057)

// Program to illustrate the functioning of various operators-2

#include<stdio.h>
int main()
{

    int a, b, c = 0;
   // Post increment/decrement operators

    a = c++;
    printf("POST incr\na = %d \nc = %d\n", a, c);
    /* Equivalent to
                        a = c;
                        c = c + 1;
    */
    a = c--;
    printf("POST decr\na = %d \nc = %d\n", a, c);
    /* Equivalent to
                        a = c;
                        c = c - 1;
    */
   // Pre increment/decrement operators

    a = ++c;
    printf("PRE incr\na = %d \nc = %d\n", a, c);
    /* Equivalent to
                        c = c + 1;
                        a = c;
    */
    a = --c;
    printf("PRE decr\na = %d \nc = %d\n", a, c);
    /* Equivalent to
                        c = c - 1;
                        a = c;
    */

    // Conditional Operator
    // Ternary Operator
    int p = (a > 1) ? 5 : 8;
    printf("%d\n", p);

    // PRECEDENCE OF OPERATORS
    int h = 8;
    int e = 4 * 6 + 3 * 4 < 3 ? 4 : 3;
    printf("%d\n", e);

    return 0;

}
