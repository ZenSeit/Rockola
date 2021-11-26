/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
/*$(document).ready(function() {
   // on ready
});*/


async function iniciarSesion() {
  let datos = {};
  datos.nickname = document.getElementById('txtnickname').value;
  datos.password = document.getElementById('txtpassword').value;

  const request = await fetch('/login', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });

  const respuesta = await request.text();
  if (respuesta !== "mal") {
    localStorage.token = respuesta;
    localStorage.nickname = datos.nickname;
    window.location.href = '/canciones.html'; //se debe poner el html para que el navegador lo pueda abrir
    alert("salio bien y se loguea");
  } else {
    alert("Las credenciales son incorrectas. Por favor intente nuevamente.");
  }

}

