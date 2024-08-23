var num =100;

for (var i = 0 ; i <= (100/5); i++)
{
    if (i%2 == 0)
        console.log(i);
}


for(var i=num; i>=0; i--) {
    if(i % 3 == 0) {
        console.log(i);
    }
}


for(var i=4; i>-4; i-=1.5) {
    console.log(i);
}

var sum = 0;
for(var i=1; i<=num; i++) {
    sum += i;
}
console.log(sum);

var Fuctorial = 1;
for(var i=1; i<=12; i++) {
    Fuctorial *= i;
}
console.log(Fuctorial);