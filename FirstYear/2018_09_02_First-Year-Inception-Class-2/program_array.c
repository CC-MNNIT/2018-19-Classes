#include<stdio.h>
// Arrays and pointers
int main()
{
	 int a[5] ={0,1,2,3,4};
	 printf("%d",a[1]);
	// //indexing is from 0..!!
	 int b[5]={1,2};//padding of 0s..!!
	 char c[5];
	 float d[5];
	 char name_of[] = {'a','c'};
	 char name1[]="himanshu";
	 char name2[]={'h','i','m','a','n','s','h','u'};
	 printf("%s\n",name1);


	int ap = 0;
	int *p = &ap;
	printf("%p\n",&ap);
	printf("%p\n",p);
	printf("%d\n",*p);
	printf("%d\n",a);
	char ch = 'a';

	char *ptr = &ch;

	printf("%c\n",*ptr);

	float f = 2.34;
	float *fptr = &f;

}
