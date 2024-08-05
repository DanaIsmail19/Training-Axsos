var isFlipped = false;

function imgSwap(elemrnt)
{
    if (isFlipped) {
        elemrnt.src="C:/Users/di1/Desktop/Basic/javaScript/pokemon/img/SWSH45_EN_52.png";
    }
    else
    {
        elemrnt.src="C:/Users/di1/Desktop/Basic/javaScript/pokemon/img/Pokemon Card Backside in High Resolution by AtomicmonkeyTCG on DeviantArt.jpg";
    }
    isFlipped = !isFlipped;
}


