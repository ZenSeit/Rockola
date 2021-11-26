/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
$(document).ready(function() {
    cargarcanciones();
});

async function cargarcanciones() {
  const request = await fetch('/lcan', {
    method: 'GET',
    headers: getHeaders()
  });
  const canciones = await request.json();


  let listadoHtml = '';
  for (let cancion of canciones) {

    let usuarioHtml = '<tr><td>'+cancion.nom+'</td><td>' + cancion.autor +'</td><td>' + cancion.gen+ '</td><td>'
                    + cancion.enlace+'</td><td>'+cancion.comentario+'</td></tr>';
    listadoHtml += usuarioHtml;
}

document.querySelector('#canciones tbody').outerHTML =listadoHtml ;

}

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json',
     'Authorization': localStorage.token
   };
}


