let estilos = document.getElementById("text");
let nombres = document.getElementById("form1");
let links   = document.getElementsByTagName("a");

let section= document.getElementById("container");
let containerSection = document.querySelector("section#container");
let segundo  = document.getElementsByClassName("second")
let tercero = document.querySelector("ol","third");


function cambiarEstilo(){
    estilos.style.fontSize="2rem";
    estilos.style.color="orange";
    estilos.style.font = "cian";
}

function obtenerNombres(){
    console.log(nombres[0].value);
    console.log(nombres[1].value);
}

function alertaLinks(){
    let ultimo  = links.length - 1;
    alert("numero de links " + links.length + "\nprimer link " +links[0].href+ "\nultimo link "+ links[ultimo].href );
    console.log(links.length );
    console.log(links[0].href);
    console.log(links[-1].href);

}


function mostrar(){
let lit = document.createElement("li");
lit.textContent="four";
let ul = document.getElementById("lista");


ul.appendChild(lit) ;
    console.log(`section por tag :${section} 
    section por query: ${containerSection.length}
    clases segundo: ${segundo.length}
    clase tercero ol: ${tercero}`);

    
    section.insertAdjacentHTML("beforeend", "<h2>¡Hola!</h2>");
let h2Element = section.querySelector("h2"); // Selecciona el elemento h2 dentro de la sección
h2Element.classList.add("mensaje"); 

}