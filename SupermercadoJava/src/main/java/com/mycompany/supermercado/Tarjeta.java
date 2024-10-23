
package com.mycompany.supermercado;

public class Tarjeta {
    private String idTarjeta, nombreCliente;
    private Integer cupoTotal;

    public Tarjeta() {
    }

    public Tarjeta(String idTarjeta, String nombreCliente, Integer cupoTotal) {
        this.idTarjeta = idTarjeta;
        this.nombreCliente = nombreCliente;
        this.cupoTotal = cupoTotal;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getCupoTotal() {
        return cupoTotal;
    }

    public void setCupoTotal(Integer cupoTotal) {
        this.cupoTotal = cupoTotal;
    }
    
    @Override
    public String toString(){
        return "Tarjeta de Credito{" +
                "Id Tarjeta='" + idTarjeta + '\'' +
                "Nombre del cliente='" + nombreCliente + '\'' +
                "Cupo total='" + cupoTotal + '\'' +
                "}";
    }
    
    public String tipoCliente(){
        if (cupoTotal < 250000) {
            return "Cliente Básico";
        } else if (cupoTotal <= 500000) {
            return "Cliente Premium";
        } else {
            return "Cliente Gold";
        }
    }
    
    public void realizarCompra(Integer valorCompra) {
        if (valorCompra > cupoTotal){
            System.out.println("Cupo insuficiente");
        } else {
            cupoTotal -= valorCompra;
            System.out.println("Boleta Electronica");
            System.out.println("Cliente : " + nombreCliente);
            System.out.println("Monto Compra : " + valorCompra);
            System.out.println("Cupo disponible :" + cupoTotal);
        }
    }

    public double descuento(String dia){
        dia = dia.toLowerCase();
        String tipoCliente = tipoCliente();
        
        if (dia == "lunes") {
            if (tipoCliente == "Cliente Básico") {
                return 0.10;
            }
        }
        if (dia == "miercoles") {
            if (tipoCliente == "Cliente Premium") {
                return 0.15;
            }
        }
        if (dia == "viernes") {
            if (tipoCliente == "Cliente Gold") {
                return 0.20;
            }
        }
        return 0.0;

    }

}
