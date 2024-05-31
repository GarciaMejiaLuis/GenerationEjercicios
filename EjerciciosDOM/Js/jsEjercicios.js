
/*let btnClick = document.getElementById("jsstyle");
btnClick.addEventListener("click", function (element) {
    let texto = document.getElementById("text");
    texto.style.font = "white";
    texto.style.fontSize = "2rem";
    texto.style.color = "orange";
});


var submitButton = document.getElementById('submitButton');
submitButton.addEventListener('click', alertaLinks);

function alertaLinks(){
    event.preventDefault();
    let links = document.getElementsByTagName("a");
    alert(`Numero de links: ${links.length} \nPrimer Link: ${links[0].href} \nUltimo link: ${links[links.length-1].href}`);
}

*/

function id(){
    let div2 =document.createElement("li");
    div2.textContent="Four";


    let section = document.getElementById('container');
    let sectonQuery = document.querySelector("#container");
    let second = document.querySelectorAll(".second");
    let second2 = document.querySelectorAll(" ol > .second");
    console.log(second2);
    section.insertAdjacentText("beforebegin","Hello");
    let main= document.querySelector(".footer");
   
    main.classList.add("main");
    main.classList.remove("main");

   

    let ulElement = document.querySelector("#lista");
    ulElement.appendChild(div2);

    let bgGreen = document.querySelectorAll("ol>li");
    bgGreen.forEach(function(item) {
        item.style.color = "orange";
    });
}

