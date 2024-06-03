package EjerciciosDeEjemplo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        //UN MAPA ES UNA VARIABLE TIPO CLAVE - VALOR. PUEDO AGREGAR Y SACAR LAS claves-valor que yo quiera.
        //LA CLAVE SIEMPRE ES UNICA!!!!!!!!!!

        //LA CLAVE ES STRING, Y LOS VALORES QUE TOMAN SON STRING
        Map<String,String> mapa = new HashMap<>();
        mapa.put("nombre","Juan");
        mapa.put("apellido","Heine");
        mapa.put("nombre2","Fede");

        //BORRA TODOO EL MAPA
        //mapa.clear();

        //GET -> ME TRAE EL VALOR DEL MAPA PASANDO LA CLAVE
        String nombrePersona = mapa.get("nombre");

        //EN GENERAL SE USAN DENTRO DE UN IF
        mapa.containsValue("Juanes"); //--->False
        mapa.containsKey("nombres"); //--->False

        System.out.println("El nombre es " + nombrePersona);

        //LA CLAVE ES NUMERICA, Y EL VALOR QUE TOMA ES TEXTO.
        Map<Integer,String> mapaNumerico = new HashMap<>();
        mapaNumerico.put(1,"One");
        mapaNumerico.put(2,"Two");
        mapaNumerico.put(3,"Three");
        mapaNumerico.put(50,"Fifty");

        Map<String, LocalDate> mapaFechas = new HashMap<>();
        mapaFechas.put("Argentina",LocalDate.of(2024,05,27));
        mapaFechas.put("Uruguay",LocalDate.of(2024,05,27));
        mapaFechas.put("China",LocalDate.of(2024,05,28));
        mapaFechas.put("Italia", LocalDate.parse("2024-12-01", DateTimeFormatter.ofPattern("yyyy%MM%ddhh:mm:ss")));


        LocalDate FechaEnArg = mapaFechas.get("Argentina");


    }



    }


