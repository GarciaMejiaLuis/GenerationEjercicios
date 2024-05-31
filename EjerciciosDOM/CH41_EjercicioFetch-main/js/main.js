const itemsContainer = document.querySelector("#list-items");

function addItem(item) {
    const itemHTML = '<div class="card" style="width: 18rem;">\n' +
        '    <div class="card-body">\n' +
        '        <h5 class="card-title">' + item.name + '</h5>\n' +
        '        <p class="card-text">' + item.pantone_value + '</p>\n' +
        '        <div style="background:' + item.color + ';">' + item.color + '</div>\n' +
        '    </div>\n' +
        '</div>\n' +
        '<br/>';
  
    itemsContainer.insertAdjacentHTML("beforeend", itemHTML);
}//addItem

// after fetching the colors, call addItem with each color
function fetchColorsList() {

  
}//fetchColorsList

function loadColorsFromStorage() {
        const promesa = fetch("https://reqres.in/api/unknown", { methohd: "GET" });
        promesa
        .then((response) => {
            response.json().then((data) => {
                for (let i = 0; i < data.data.length; i++) {
                    addItem(data.data[i]);
        
                    let elemento = {
                        "id": data.data[i].id,
                        "nombre": data.data[i].name,
                        "pantone_value": data.data[i].pantone_value,
                        "color": data.data[i].color
                    };
                }
            });
        })
            .catch((err) => { console.log("Existe un problema con la solicitud" + err) });

}

loadColorsFromStorage();