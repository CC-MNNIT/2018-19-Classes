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

var sequentialStart = function() {
  console.log('==SEQUENTIAL START with then() chaining==');
  resolveAfter2Seconds().then(function(slow) {
    console.log(slow);
    return resolveAfter1Second();
  }).then(function(fast){
    console.log(fast);
  });
}

var concurrentStart = function() {
  console.log('==CONCURRENT START with Promise.all==');
  Promise.all([resolveAfter2Seconds(), resolveAfter1Second()]).then(([slow, fast]) => {
    console.log(slow);
    console.log(fast);
  });
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