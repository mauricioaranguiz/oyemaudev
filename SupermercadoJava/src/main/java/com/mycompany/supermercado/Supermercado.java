
package com.mycompany.supermercado; 

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
                
        Tarjeta tarjeta1 = new Tarjeta("TAR01", "Francisco Jesus", 500000);
        Tarjeta tarjeta2 = new Tarjeta("TAR02", "Maximo Ignacio", 500000);
        
        //Aqui sale toda la información del enunciado
        //Se puede crear el menu con opciones para realizar las tareas por separado
        System.out.println("Informacion de Tarjeta");
        System.out.println(tarjeta1);
        System.out.println("Tipo de cliente: " + tarjeta1.tipoCliente());
        tarjeta1.realizarCompra(50000);
        System.out.println("Descuento de Lunes : " + (tarjeta1.descuento("lunes") * 100) + "%");
        
        System.out.println("\nInformacion de Tarjeta");
        System.out.println(tarjeta2);
        System.out.println("Tipo de cliente: " + tarjeta2.tipoCliente());
        tarjeta2.realizarCompra(50000);
        System.out.println("Descuento de Lunes : " + (tarjeta2.descuento("lunes") * 100) + "%");
        
        //Aqui construi un menu
        int salir = 0;
        Scanner teclado=new Scanner(System.in);
        
        while (salir == 0){
            System.out.println("\nMenu Supermercado");
            System.out.println("1. Mostrar datos de tarjeta");
            System.out.println("2. Mostrar tipo de cliente");
            System.out.println("3. Ingresar Comprar");
            System.out.println("4. Mostrar descuento segun el dia");
            System.out.println("5. Salir");
            System.out.println("Ingrese opcion : ");
            
            int opcion = teclado.nextInt();
            int tarjetaSeleccionada=0;
            if (opcion == 1){
                System.out.println("Indique tarjeta 1 o 2 : ");
                tarjetaSeleccionada = teclado.nextInt();

                if (tarjetaSeleccionada == 1) {
                    System.out.println(tarjeta1);
                } else if (tarjetaSeleccionada == 2) {
                    System.out.println(tarjeta2);
                } else {
                    System.out.println("No existe.");
                }
            } else if (opcion == 2){
                System.out.println("Indique tarjeta 1 o 2 : ");
                tarjetaSeleccionada = teclado.nextInt();
                
                if (tarjetaSeleccionada == 1) {
                    System.out.println("Tipo cliente : " + tarjeta1.tipoCliente());
                } else if (tarjetaSeleccionada == 2) {
                    System.out.println("Tipo cliente : " + tarjeta2.tipoCliente());
                } else {
                    System.out.println("No existe.");
                }
            } else if (opcion == 3){
                System.out.println("Indique tarjeta 1 o 2 : ");
                tarjetaSeleccionada = teclado.nextInt();
                
                System.out.println("Ingrese total compra : ");
                int totalCompra = teclado.nextInt();
                if (tarjetaSeleccionada == 1) {
                    tarjeta1.realizarCompra(totalCompra);
                } else if (tarjetaSeleccionada == 2) {
                    tarjeta2.realizarCompra(totalCompra);
                } else {
                    System.out.println("No existe.");
                }
            } else if (opcion == 4){
                System.out.println("Indique tarjeta 1 o 2 : ");
                tarjetaSeleccionada = teclado.nextInt();
                
                System.out.println("Ingrese dia : ");
                String dia = teclado.next();
                double descuento = 0.0;
                if (tarjetaSeleccionada == 1) {
                    descuento = tarjeta1.descuento(dia);
                } else if (tarjetaSeleccionada == 2) {
                    descuento = tarjeta2.descuento(dia);
                } else {
                    System.out.println("No existe.");
                }
                if (descuento > 0){
                    System.out.println("Descuento : " + (descuento * 100) + "%");
                } else {
                    System.out.println("Dia sin descuento!");
                }
            } else if (opcion == 5){
                salir=1;
                System.out.println("Fin");
            } else {
                System.out.println("ERROR: Se equivocooooooo!");
            }
            
        }
        teclado.close();
        
    }
}
