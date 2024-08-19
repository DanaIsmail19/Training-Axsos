const cars = ['Tesla', 'Mercedes', 'Honda'];
const [ randomCar ] = cars;
const [ ,otherRandomCar ] = cars;

console.log(randomCar);//'Tesla'
console.log(otherRandomCar);//'Mercedes'


//problem 2 
const employee = {
    name: 'Elon',
    age: 47,
    company: 'Tesla'
};

// Destructuring and renaming
const { name: otherName } = employee;
const { name } = employee;

console.log(name);  //error name undefined
console.log(otherName); 



//problem 3
const person = {
    name: 'Phil Smith',
    age: 47,
    height: '6 feet'
}
const password = '12345';
const { password: hashedPassword } = person;  
//Predict the output
console.log(password);//'12345'
console.log(hashedPassword);// undefiend


//problem 4
const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [,first] = numbers;// 2
const [,,,second] = numbers;//
const [,,,,,,,,third] = numbers;
//Predict the output
console.log(first);//2
console.log(second);//5
console.log(third);//2
console.log(first == second);
console.log(first == third);


//problem 5
const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [ ,willThisWork] = secondKey;
//Predict the output
console.log(key);//'value'
console.log(secondKey);//[1,5,1,8,3,3]
console.log(secondKey[0]);//1
console.log(willThisWork);//5
