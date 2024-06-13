const btn = document.getElementById("btn");

const wrap = document.getElementById("wrap");

const colorText = document.getElementById("color");

const hex = [0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'];

btn.addEventListener('click', changeBg);


function changeBg(){
    let hexColor = '#';

    //It will add Randomly Generated Hexa Decimal Number 6 times to a hexColor
    for(let i=0; i<6; i++){
        hexColor = hexColor + randomHex();
    }

    console.log(hexColor);

    wrap.style.backgroundColor = hexColor; // To Set Background Color in a Element which has is="wrap"
    colorText.innerHTML = hexColor;
}

//To Generate Random Index of hex Array
function randomHex(){

    let randomIndex = Math.floor(Math.random()*16);

    return hex[randomIndex];

}