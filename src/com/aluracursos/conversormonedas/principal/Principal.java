package com.aluracursos.conversormonedas.principal;

import com.aluracursos.conversormonedas.metodos.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        double valor=0.0;

        while (opcion !=7) {
            System.out.println("***************************************\n" +
                    "    Sea bienvenido al Conversor de Monedas =\n" +
                    "    1) Dolar =>> Peso argentino\n" +
                    "    2) Peso argentino =>> Dolar\n" +
                    "    3) Dolar =>> Real brasileño\n" +
                    "    4) Real brasileño =>> Dolar\n" +
                    "    5) Dolar =>> Peso colombiano\n" +
                    "    6) Peso colombiano =>> Dolar\n" +
                    "    7) Salir\n" +
                    "    Elija una opcion valida\n" +
                    "     ***************************************");
            opcion = teclado.nextInt();

            if (opcion !=7){
            System.out.println("Digite el valor para la conversión");
            valor = teclado.nextDouble();

            Conversor procedimiento = new Conversor();
            procedimiento.buscarconversion(opcion,valor);
            System.out.println(procedimiento.buscarconversion(opcion, valor));
            }else {
                System.out.println("Gracias por preferirnos, esperamos volver a atenderlo");
            }
        }
    }
}
