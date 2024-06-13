
/*
It seems that document.querySelector('button#citystats'); is returning null because it executes before the DOM fully loads.

If you put this line of code under

window.onload=function(){
  -- put your code here
}
then it will run without issue.
*/
window.onload=function(){
    let button = document.querySelector('button#citystats');
    button.addEventListener('click', displaystats)

  console.log(button);

  let resultdiv = document.createElement('div');
  resultdiv.id = 'result';
  document.getElementById("wrapper").appendChild(resultdiv); 


function displaystats(){
    const input = document.getElementById("city"); // To get select element

    const city = input.options[input.selectedIndex].value;
    // input.option will take, all available options from select element as an Array
    // input.selectedIndex will take, one particular element (option), which is choosed by User as an index
    // .value will take, the Value choosed  by User

    let population = 0, state =" ", country = " ";

    switch(city) {
        case 'Bangalore': population = 200;
                            state = "Karnataka";
                            country = "India";
                            break;

        case 'Chennai': population = 150;
                            state = "Tamil Nadu";
                            country = "India";
                            break;

        case 'Hyderabad': population = 100;
                            state = "Telangana";
                            country = "India";
                            break;

        case 'Kolkata': population = 50;
                            state = "West Bengal";
                            country = "India";
                            break;
        
    }

    let stats = `The city called ${city} is a Most populus city in ${state} , ${country}, has vast population of ${population}.`;

    //code\\ let resultdiv = document.createElement('div'); // To create a <div> element // Just created, not placed

    //code\\ resultdiv.id = 'result'; // To give id to that <div> Element
    // Like this, we can give stylings for that <div> element - resultdiv.style.background = "";

    //code\\ document.getElementById("wrapper").appendChild(resultdiv); 
    //document.getElementById("wrapper") is to get an Element - In this element only, resultdiv element will placed as direct child of 'wrapper' div
    // .appendChild(resultdiv) means, The "resultdiv" element will append the last direct child of The element which have id name "wrapper".

    ///ERROR???

//document.getElementById("wrapper").appendChild(resultdiv);  - This Line is not efficcient one
//Because, Whenever we click the button, everytime the function will get called, So every time the <div> element will create
// But, First time only the element should be created
// To solve this, We need to write this line in out of the Function


    document.getElementById("result").innerHTML = stats; // To add stats into newly created Element



}
}