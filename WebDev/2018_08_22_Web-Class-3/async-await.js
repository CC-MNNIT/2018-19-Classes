/*
1.Introduction to JavaScript
2.Data types
3.Functions
4.Objects
5.Prototype chain
6.Closures
7.Callbacks,promises and async await
8.Asynchronous nature of Javascript
9. JQuery
*/

var resolveAfter2Seconds = function() {
  console.log("starting slow promise");
  return new Promise(function(resolve, reject) {
    setTimeout(function() {
      resolve(2000);
      console.log("slow promise is done");
    }, 2000);
  });
};

var resolveAfter1Second = function() {
  console.log("starting fast promise");
  return new Promise(function(resolve, reject) {
    setTimeout(function() {
      resolve(1000);
      console.log("fast promise is done");
    }, 1000);
  });
};

var sequentialStart = async function() {
  console.log('==SEQUENTIAL START==');
  const slow = await resolveAfter2Seconds(); // If the value of the expression following the await operator is not a Promise, it's converted to a resolved Promise.
  const fast = await resolveAfter1Second();
  console.log(slow);
  console.log(fast);
}

var concurrentStart = async function() {
  console.log('==CONCURRENT START with await==');
  const slow = resolveAfter2Seconds(); // starts timer immediately
  const fast = resolveAfter1Second();

  console.log(await slow);
  console.log(await fast); // waits for slow to finish, even though fast is already done!
}

var parallel = function() {
  console.log('==PARALLEL with Promise.then==');
  resolveAfter2Seconds().then((message)=>console.log(message)); // in this case could be simply written as console.log(resolveAfter2Seconds());
  resolveAfter1Second().then((message)=>console.log(message));
}

sequentialStart(); // takes 2+1 seconds in total
// wait above to finish
setTimeout(concurrentStart, 4000); // takes 2 seconds in total
// wait again
setTimeout(parallel, 7000); // trully parallel