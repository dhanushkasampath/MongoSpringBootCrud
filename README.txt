show dbs;

use mycustomers
db

db.createUser({
	user:"dhanushka",
	pwd:"abc@123",
	roles:["readWrite","dbAdmin"]
});

db.createCollection('customers');    like tables

show collections

db.customers.insert({first_name:"john",last_name:"Doe"});  creating a documet; like a row in a table
db.customers.find();   

db.customers.insert([{first_name:"saman",last_name:"kumara"},{first_name:"nimal",last_name:"Doe"}]);   //adding multiple documents at once

db.customers.find().pretty();  // look nicely

db.customers.update({first_name:"john"},{first_name:"john",last_name:"sins",gender:"male"});

> db.customers.find({first_name:"saman"}).pretty();  // meken a value eka thiyena okkoma documents tika return wenawa

> db.customers.find({age:{$lt:40}}).pretty();    //40 ta adu ages set eka return karai 

db.customers.find({"address.city":"Boston"}).pretty();  //city eka boston yu documents return karai 

db.customers.find().pretty().count();   // to find the no of documents


