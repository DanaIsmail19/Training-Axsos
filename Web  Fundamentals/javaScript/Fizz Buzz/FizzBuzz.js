
var num = 1000;

for (var i = 0 ; i<num ; i++)
{
    if ((i%15)  == 0)
        console.log("FizzBuzz");
    else if (i%5==0)
        console.log("Buzz");
    else if (i %3 == 0)
        console.log("Fuzz");
    else
    console.log(i);

}