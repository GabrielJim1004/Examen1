package com.examen1.examen1;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPedidoController {

    @GetMapping("/get")
    public void getPersonaList(){
        Pedido Plist = new Pedido(null,null,null);
        Plist.getPedidoList();
    }

    @PostMapping("/post")
    public void addPedido(String cantidad, String precio, String descripcion){
        Pedido pedido = new Pedido(cantidad,precio,descripcion);
        pedido.addPedido(pedido);
        pedido.getPedidoList();
    }

    @PutMapping("/edit")
    public void updatePedido(String cantidad, String precio, String descripcion, int index){
        Pedido pedido = new Pedido(cantidad,precio,descripcion);
        pedido.updatePedido(pedido, index);
        pedido.getPedidoList();
    }

    @DeleteMapping("/delete")
    public void delPedido(int index){
        Pedido pedido = new Pedido(null, null, null);
        pedido.getPedidoList();
        pedido.delPedido(index);
        pedido.getPedidoList();
    }
    
}
/* 
Requerimientos
Se necesita un API para hacer pedidos en un almacen. Cada pedido lleva, cantidad, precio y descripcion. El api debe responder al URL /pedidos/ Deberia tener un controlador 
rest que administre una lista de pedidos. El API deberia tener 4 endpoints que hagan lo siguiente.

GET Endpoint que enumere los pedidos de la lista y la imprima en consola.
POST Endpoint que añada el pedido a la lista y la imprima en consola.
PUT que actualice el pedido (puede reemplazar el elemento un mediante el indice) y la imprima en consola
DELETE que remueva el pedido de la lista mediante el indice y la imprima en consola.
(Opcional) crear un webcontroller que contenga una descripcion breve del proyecto.
(Opcional) crear un metodo getTotal que calcule el monto del pedido + el IVA (15) y lo imprima en consola.
Evaluación
10% clonar y actualizar correctamente el GIT
10% Inicializar correctamente el proyecto y todas sus dependecias.
10% Uso correcto de clases y controladores.
15% methodo GET
15% methodo POST
15% methodo PUT
15% methodo DELETE
10% commit y Pull request.
5% BONO si añade un webcontroller enumerando los endpoints.
5% BONO si añade un un metodo getTotal que calcule el monto del pedido + el IVA (15%).
*/