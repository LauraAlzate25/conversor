package com.aluracursos.conversormonedas.metodos;

public class Conversor {

    ConsultarApi conversor = new ConsultarApi();
    double arsRate = conversor.obtenerTasas()[0];
    double brlRate = conversor.obtenerTasas()[1];
    double copRate = conversor.obtenerTasas()[2];
    double conversion=0.0;

    public String buscarconversion(int opcion, double valor ){

        switch (opcion){
            case 1:
//                Dolar =>> Peso argentino
                conversion = valor * arsRate;
                return ("El valor " + valor + " [USD] corresponde al valor final de =>>> " + conversion + " [ARS]");

            case 2:
//                Peso argentino =>> Dolar
                conversion = valor / arsRate;
                return ("El valor " + valor + " [ARS] corresponde al valor final de =>>> " + conversion + " [USD]");

            case 3:
//                Dolar =>> Real brasileño
                conversion = valor * brlRate;
                return ("El valor " + valor + " [USD] corresponde al valor final de =>>> " + conversion + " [BRL]");

            case 4:
//                Real brasileño =>> Dolar
                conversion = valor / brlRate;
                return ("El valor " + valor + " [BRL] corresponde al valor final de =>>> " + conversion + " [USD]");

            case 5:
//                Dolar =>> Peso colombiano
                conversion = valor * copRate;
                return ("El valor " + valor + " [USD] corresponde al valor final de =>>> " + conversion + " [COP]");

            case 6:
//                Peso colombiano =>> Dolar
                conversion = valor / copRate;
                return ("El valor " + valor + " [COP] corresponde al valor final de =>>> " + conversion + " [USD]");

            default:
                return null;
        }
    }
//    Dolar USD
//    Peso argentino ARS
//    Real brasilero BRL
//    Peso colombiano COP

}
