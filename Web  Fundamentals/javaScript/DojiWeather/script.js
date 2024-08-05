
var cookieDiv = document.querySelector(".cookie-policy");

function loading() {
    alert("Loading weather report...")
}

function cTOf(temp) {
    return Math.round(9 / 5 * temp + 32);
}

function fTOc(temp) {
    return Math.round(5 / 9 * (temp - 32));
}

function convert(element) {
    console.log(element.value);
    for(var i=1; i<9; i++) {
        var tempSpan = document.querySelector("#temp" + i);
        var tempValue = parseInt(tempSpan.innerText);
        if(element.value == "°C") {
            tempSpan.innerText = fTOc(tempValue);
        } else {
            tempSpan.innerText = cTOf(tempValue);
        }
    }
}

function accept() {
    cookieDiv.remove();
}