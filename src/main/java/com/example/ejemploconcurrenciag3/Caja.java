package com.example.ejemploconcurrenciag3;

public class Caja {

    private int cantidadVentas = 0;
    private int totalRecaudado = 0;

    /**
     * sycronized permite que solamente un Thread (hilo) ejecute el metodo a la vez
     *Con esto evitamos el problema de race condition
     * @param vendedor es el numero de race conndition
     * @param monto monto asignado
     */

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public void registrarVentas(String vendedor, int monto){
        cantidadVentas++;
        totalRecaudado += monto;

        System.out.println(vendedor + "registro una venta de C$" + monto + "|ventas acumuladas:" +
                + cantidadVentas + "|total: C$" +totalRecaudado);

    }

}