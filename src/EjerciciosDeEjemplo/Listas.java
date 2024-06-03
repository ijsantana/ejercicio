package EjerciciosDeEjemplo;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        //LISTAS: ES UN MANEJO DINAMICO DE LA MEMORIA DE LA LISTA --> PUEDO AGREGAR Y QUITAR TODOS LOS ELEMENTOS QUE QUIERA DE LA LISTA.
        //DE TAMAÑO DINAMICO
        // pos1: DATO1, pos2    --->  pos2: DATO2,pos3   ---->  pos3: DATO3, pos4 ----> ....

        // _ _ _ _ _ _ _ _ _ _ _ _ _ MEMORIA _
        //LA FORMA DE DEFINIRLO DEPENDE DE CADA LENGUAJE
        List<String> lista = new ArrayList<>();
        lista.add("pepe");
        lista.add("caco");
        lista.remove("pepe");
        lista.remove(0);
        //lista.clear();

        if(lista.size()==0){
            System.out.println("La lista esta vacia");
        } else {
            System.out.println(lista.get(0));
        }

        if(lista.size()>0){
            System.out.println(lista.get(0));
        } else {
            System.out.println("La lista esta vacia");
        }

        if(lista.size()!=0){
            System.out.println(lista.get(0));
        } else {
            System.out.println("La lista esta vacia");
        }

        if(lista.isEmpty()){
            System.out.println("La lista esta vacia");
        } else {
            System.out.println(lista.get(0));
        }

        System.out.println(lista);
        System.out.println(lista.size());

        if(lista.isEmpty()){
            System.out.println("La lista tiene vacia");
        } else {
            System.out.println("La lista tiene datos");
        }

        // ! => Invierte el valor booleano --> ES UN NEGADOR
        //LA LISTA NO ESTA VACIA
        if(!lista.isEmpty()){
            System.out.println("La lista tiene datos");
        } else {
            System.out.println("La lista vacia");
        }
        //EL PRIMER VALOR DE LA LISTA NO ES COCO
        if(!lista.get(0).equals("coco")){

        }

        if(lista.size()!=4){
            System.out.println("El tamaño de la lista es diferente a 4");
        }


    }

}
