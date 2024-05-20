package EjerciciosDeEjemplo;

public class Clase2 {


    //FUNCIONES!!!
    //y = f(x,w,z,...)
    //VARIABLE DE SALIDA -> Y (LO QUE ME DEVUELVE)
    //VARIABLES DE ENTRADA -> x, z, w (LO QUE INGRESO)
    //FIRMA DE UNA FUNCION -> LO QUE LA HACE UNICA ->   TipoDeAccesoALaFuncion      TipoDeVariableDeSalida      nombreDeLaFuncion (VariablesDeEntrada, ....)

    public static void main(String[] args) {
        String localidad = obtenerLocalidad("1234");
    }



    //FUNCION
    //TIPO DE ACCESO -> PUBLIC (ACCESO PUBLICO EN CUALQUIER PARTE DEL PROYECTO) / PRIVATE (SOLO ACCEDO DESDE EjerciciosDeEjemplo.CLASE2) / PROTECTED
    private static String obtenerLocalidad(String codigoPostal){
        return "victoria";
    }


}
