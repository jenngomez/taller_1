package com.yenifergomez.aplicacion;

import com.yenifergomez.dominio.Dispensador;

public class App {
    public static void main(String[] args) {
        Dispensador dispensador = new Dispensador();

        dispensador.serial = 2365;
        dispensador.marca = "LG";
        dispensador.cantidadMaxima = 50;
        dispensador.cantidadMinima = 1;
        dispensador.cantidadActual = 20;
        dispensador.temperatura = 5;

        System.out.println("El dispensador tiene el serial " + dispensador.serial + " y la marca " + dispensador.marca );

        dispensador.servir(10);
        System.out.println("La cantidad actual en el dispensador es de: " + dispensador.cantidadActual);

        dispensador.llenar(20);
        System.out.println("La cantidad actual en el dispensador es de: " + dispensador.cantidadActual);

        dispensador.vaciar(5);
        System.out.println("La cantidad actual en el dispensador es de: " + dispensador.cantidadActual);

        dispensador.calentar((byte) 20);
        System.out.println("La nueva temperatura es de: " + dispensador.temperatura);

        dispensador.enfriar((byte) 15);
        System.out.println("La nueva temperatura es de: " + dispensador.temperatura);

        dispensador.nivelActual = 'M';
        System.out.println("El nivel del dispensador está en: " + dispensador.nivelActual);




    }
}
