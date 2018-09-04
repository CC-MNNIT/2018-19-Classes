var express = require('express');
var path = require('path');
var fs = require('fs');
var bodyParser = require('body-parser');
var app = express();

app.use(express.static(path.join(__dirname, 'public')));

app.use(function (req, res, next) {
	var string = req.method + ' ' + req.path + ' - ' + req.ip;
	console.log(string);
	next();
});

app.get("/now",function middleware(req, res, next) {
	req.string = "example";
	next();
}, function (req, res) {
	res.send(req.string); // This will display "example" to the user
});

app.get('/', function(req, res, next) {
	res.set('Content-Type', 'text/html');
	res.send('Hello World!');
	next();
});

app.get("/json", function(req, res) {
	res.json({"message": "Hello World"});
});

app.get("/:word/echo", function(req, res) {
  word = req.params.word;
  res.set('Content-Type', 'text/html');
  res.send(word + " " + req.query.msg);
});

app.listen(3000);