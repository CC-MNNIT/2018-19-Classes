var resolveAfter2Seconds = function(cb) {
  console.log("starting slow promise");
  setTimeout(function() {
    cb(2000);
    console.log("slow promise is done");
    resolveAfter1Second(cb);
  }, 2000);
};

var resolveAfter1Second = function(cb) {
  console.log("starting fast promise");
  setTimeout(function() {
    cb(1000);
    console.log("fast promise is done");
  }, 1000);
};

var callbackFunc = function(val) {
  console.log(val);
}

var resolveAfter2SecondsParallel = function() {
  console.log("starting slow promise");
  setTimeout(function() {
    console.log(2000);
    console.log("slow promise is done");
  }, 2000);
};

var resolveAfter1SecondParallel = function(slow, cb) {
  console.log("starting fast promise");
  setTimeout(function() {
    console.log(1000);
    console.log("fast promise is done");
  }, 1000);
};

var sequentialStart = function() {
  console.log('==SEQUENTIAL START with callbacks==');
  resolveAfter2Seconds(callbackFunc);
}

var parallel = function() {
  console.log('==PARALLEL with callbacks==');
  resolveAfter2SecondsParallel();
  resolveAfter1SecondParallel();
}

sequentialStart(); // takes 2+1 seconds in total
// wait again
setTimeout(parallel, 4000); // trully parallel