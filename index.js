/*$(function () {
  $('[data-toggle="tooltip"]').tooltip()
}) */

 // Cantidad entradas a comprar


const botonCalcular = document.getElementById('botonCalcular') // Resumen

botonCalcular.addEventListener('click',resumen)



var valorentrada = 200;

function resumen(){
  const cantidadEntradas = document.getElementById('cantidadEntrada').value;
  const total = cantidadEntradas * valorentrada;
  const descuento = document.getElementById("inputState").value;
  const preciofinal = cantidadEntradas * (valorentrada - (valorentrada * descuento) / 100);
  document.getElementById("totalCompra").value = "El total es: $" +  preciofinal;

  console.log(total);
  console.log(descuento);
  console.log(preciofinal);
 
}




