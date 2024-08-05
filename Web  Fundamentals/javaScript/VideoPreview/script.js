console.log("page loaded...");

function play(element) {
    element.play();
}

function pause(element) {
    element.pause();
    element.currentTime = 0;
}