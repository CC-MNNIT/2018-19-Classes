## Resources

- [What is an exception ?](https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html)
- [The try Block](https://docs.oracle.com/javase/tutorial/essential/exceptions/try.html)
- [The catch Block](https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html)
- [Reading From and Writing To Sockets : Oracle Docs](https://docs.oracle.com/javase/tutorial/networking/sockets/readingWriting.html)
- [Writing a Client/Server Pair : Oracle Docs](https://docs.oracle.com/javase/tutorial/networking/sockets/clientServer.html)
- [Socket Programming : GeeksForGeeks](https://www.geeksforgeeks.org/socket-programming-in-java/)
- [Serialization Guide For Beginners](serialization)

## Classroom Codes

- [Socket Client/Server Pair Example](https://github.com/CC-MNNIT/2018-19-Classes/tree/master/Java/2018_08_31_Java-Class-5/socket-example)

## Miscellaneous

```c

#include <stdio.h>

int main(){

	printf("Welcome to 4th Class of SoftaBlitz\n");

	printf("Today we will cover Socket Programming");

	int *ptr = 0;
	int val = *ptr;

	printf("I am as useless as @UselessCoder");
	
}
```

What normally one expects as output is :

```
Welcome to 4th Class of SoftaBlitz
Today we will cover Socket Programming
Segmentation Fault
```

But what we get is : 
```
Welcome to 4th Class of SoftaBlitz
Segmentation Fault
```

To understand the output we should first know the concept of **“Buffer”**.
Buffer is a place to store data temporarily, in order to mitigate differences between input speed and output speed. While the producer is being faster than the consumer, the producer can continue to store output in the buffer. When the consumer speeds up, it can read from the buffer. The buffer is there in the middle to bridge the gap.
Whenever data is fetched by consumer from the buffer, the buffer is said to flush out its data.

Based upon what triggers the flushing of data from the buffer, the associated streams are :

- **Unbuffered** : Where no buffer is attached. Data is immediately transferred from producer to consumer. e.g., Error Stream.
- **Fully Buffered** : Where data is flushed either when buffer capacity is full or the program successfully terminates, or some function like fflush() is used.( Check out fflush() yourself ). e.g., File Streams
- **Line Buffered** : Apart from the conditions mentioned in fully buffered, flushing is also triggered when a new line(‘\n’) is encounterd. e.g., Input/Output Streams.

In the context of the question, since printf uses Output Stream which is Line Buffered, therefore, only on encounter of a new line or successful termination of program will the data be flushed to the terminal.

At the point when Segmentation Fault occurs the data is still in the buffer and hence is not flushed onto the terminal.

But the point is why are we discussing all these C programming concepts in Java. The reason is that in Java all OutputSreams have buffers attached to them whether it is of some Socket or default System.out OutputStream. Now consider a case where Server writes into the OutputStream of Socket and Client reads it via it's Socket InputStream, Now if Server do not flush it's Output Stream then the content will be there in buffer, and the Client will be blocked indefinitely waiting to read it. That's why it is always advisable to flush the OuputStream of a Socket if you write any thing into it.
