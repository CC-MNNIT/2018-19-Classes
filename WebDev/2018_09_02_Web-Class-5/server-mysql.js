const express = require('express');
const fs = require('fs');
const path = require('path');
const mysql = require('mysql');
const app = express();

var connection = mysql.createConnection({
	host     : 'localhost',
	user     : 'root',
	password : '',
	database : 'global_login',
	port : 3306
});
connection.connect();

// used async-await to run queries in sync
function MyQuery(query){
	return new Promise(function(resolve,reject){
		connection.query(query, function(err, results, fields){
			if(err) reject(err);
			resolve(results);
		})
	});
}

app.get('/', function(req, res) {
	console.log(req.query);

	if ("user_id" in req.query) {
		connection.query("SELECT email FROM users WHERE user_id=?", [req.query.user_id], function (error, results) {
			if (error) throw error;

			console.log(results[0]);
			if (!results.length) res.send("Invalid User Id");
			else {
				res.send(results[0].email);
			}
		});
	}
	else res.send("Yo yo");
});

app.listen(3000, () => console.log('Example app listening on port 3000!'));