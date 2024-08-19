const Unit = require('./Unit');
const Effect = require('./Effect');


// Make an instance of Unit called "Red Belt Ninja" 
const redBeltNinja = new Unit("Red Belt Ninja");
redBeltNinja.attack(blackBeltNinja);

//Make an instance of Unit called "Black Belt Ninja"
const blackBeltNinja = new Unit("Black Belt Ninja");

//Make an instance of "Hard Algorithm" and play it on "Red Belt Ninja"
const hardAlgorithm = new Effect("Hard Algorithm");
hardAlgorithm.play(redBeltNinja);

//task4: Make an instance of Effect called "Unhandled Promise Rejection"
const unhandledPromiseRejection = new Effect("Unhandled Promise Rejection");
unhandledPromiseRejection.play(redBeltNinja);


//task5: Make an instance of Effect called "Pair Programming"
const pairProgramming = new Effect("Pair Programming");
pairProgramming.play(redBeltNinja);