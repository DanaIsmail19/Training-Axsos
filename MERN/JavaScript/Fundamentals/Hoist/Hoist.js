console.log("\n-----------------example 1-----------------\n");
// example 1
var hello = 'world';
console.log(hello);


console.log("\n-----------------example 2-----------------\n");

//example 2
var needle = 'haystack'; 

test(); 

function test() {
    var needle = 'magnet'; 
    console.log(needle);
}

console.log("\n-----------------example 3-----------------\n");
// example 3
var brendan = 'super cool'; // Global variable 

console.log(brendan);

function print() {
    brendan = 'only okay'; 
    console.log(brendan); 
}

print(); // Calls the function


console.log("\n-----------------example 4-----------------\n");
// example 4
var food = 'chicken'; // Global variable

console.log(food); 

eat(); // Calls the function

function eat() {
    var food; // Local variable 
    food = 'half-chicken';
    console.log(food); 
    food = 'gone'; // Updates the local food variable to 'gone'
    
}

console.log("\n-----------------example 5-----------------\n");
//example 5
var mean = function() {
    food = "chicken"; // Updates global food
    console.log(food); 
    var food = "fish"; // Local variable
    console.log(food); 
}

mean(); 

console.log(food); 


console.log("\n-----------------example 6-----------------\n");
//example 6
var genre = "disco";
console.log(genre);

rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);


console.log("\n-----------------example 7-----------------\n");
//example 7
dojo = "san jose";
console.log(dojo);

function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
learn();
console.log(dojo);


console.log("\n-----------------example 8-----------------\n");
//example 8
console.log(makeDojo("Chicago", 65)); // Expected output: { name: 'Chicago', students: 65, hiring: true }
console.log(makeDojo("Berkeley", 0)); // Expected output: { status: 'closed for now' }

function makeDojo(name, students) {
    if (students <= 0) {
        return { status: 'closed for now' };
    }
    
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if (dojo.students > 50) {
        dojo.hiring = true;
    }
    return dojo;
}
