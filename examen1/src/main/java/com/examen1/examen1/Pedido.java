package com.examen1.examen1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cantidad;
    private String precio;
    private String descripcion;

    List<Pedido> Plist = new ArrayList<Pedido> ();

    public Pedido(String cantidad, String precio, String descripcion){
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void getPedidoList(){
        Pedido Pedido1 = new Pedido("4","1000","Coca-Cola");
        Pedido Pedido2 = new Pedido("6","2500","Jamon");
        Pedido Pedido3 = new Pedido("10","750","Atun");

        Plist.add(Pedido1);
        Plist.add(Pedido2);
        Plist.add(Pedido3);

        for(Pedido PedidoIteracion : Plist){
            System.out.println(PedidoIteracion.getDescripcion().getPrecio());
        }
    }
    /*AGREGA UNA PERSONA A LA LISTA */ 
    public void addPedido(Pedido pedido){
        Plist.add(pedido);
    }
    /*ACTUALIZA UNA PERSONA */
    public void updatePedido(Pedido pedido, int index){
        this.getPedidoList();
        Plist.set(index, pedido);
    }
    /*BORRA UNA PERSONA */
    public void delPedido(int index){
        Plist.remove(index);
    }


/*GETTERS AND SETTERS PARA LA CLASE */

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio(){
        return precio;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }

    public void setPrecio(String precio){
        this.precio = precio;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
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