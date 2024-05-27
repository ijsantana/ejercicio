package EjerciciosDeEjemplo;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {

        String pepe = "adawed";


        //LISTAS Y ARREGLOS:



        //1. ARRAY O ARREGLO -> ES UN VECTOR DE OBJETOS DE ANCHO DETERMINADO.
        //EJ: Tenemos un arreglo de 2 strings.


        String[] textos = new String[2];

        //SIEMPRE SE ARRANCA EN 0
        //textos = ["pepe","Carlos"]
        textos[0] = "pepe";
        textos[1] = "Carlos";

        System.out.println(Arrays.stream(textos).toList());

        Integer[] arreglo1 = new Integer[5];
        arreglo1[0]=12312;
        arreglo1[1]=212312;
        arreglo1[2]=10012;
        arreglo1[3]=2312;
        arreglo1[4]=312;

        System.out.println(Arrays.stream(arreglo1).toList());


        //UN ARRAY TIENE METODOS PREDETERMINADOS

        int largo = arreglo1.length;

        Integer[] arreglo2 = arreglo1.clone();

        arreglo2[1]=0;

        Integer[] arreglo3 = new Integer[5];
        arreglo3[0]=arreglo1[0];
        arreglo3[1]=arreglo1[1];
        arreglo3[2]=arreglo1[2];
        arreglo3[3]=arreglo1[3];
        arreglo3[4]=arreglo1[4];

        //CICLO DETERMINADO -> PUEDO USARLO PARA RECORRER UN ARRAY
        //for(DONDE ARRANCO; CONDICION PARA TERMINAR; INCREMENTO)
        //i++ es incrementar de a 1 ---->   i = i + 1
        //i-- restando 1
        //i+4 incrementando en 4
        //el arreglo es de largo 5 peeeeero va a ir del 0 al 4
        for(int i=0; i <= arreglo1.length ;i++){
            System.out.println("El valor de la posicion " + i + " es igual a " + arreglo1[i]);
        }


    }



}
