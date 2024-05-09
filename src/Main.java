public class Main {
    public static void main(String[] args) {

        // TIPO DE VARIABLE --- NOMBRE DE LA VARIABLE = QUE VALOR TOMA;

        //LENGUAJE TIPADO -> YO TENGO QUE DEFINIR EL TIPO DE VARIABLE. JAVA (FUERTEMENTE TIPADO)
        //LENGUAJE NO TIPADO -> EL COMPILADOR INTERPRETA QUE TIPO DE VARIABLE ES DEPENDIENDO QUE HAY DESPUES DEL =. JAVASCRIPT, PYTHON

        //TIPOS DE VARIABLES
        //PRIMITIVAS NUMERICAS
        int enteroCorto = 2;
        long enteroLargo = 1231;

        double decimalLargo = 12312.1231;
        float decimalCorto = 12312.12F;

        //CADENAS DE TEXTO -> Es un arreglo o cadena de caracteres (Tipo CHAR).
        String nombre = "Juan";



        //BOOLEANAS O DE BANDERA -> Tienen dos resultados posibles (Verdadero o Falso) Se representa como 1 o 0;
        boolean resultado = true;

        System.out.println("Hello world!");


        //OPERADORES NUMERICOS

        int nro1 = 100;
        int nro2 = 2;

        int suma = nro1 + nro2; //102
        int resta = nro1 - nro2; // 98
        int multiplicacion = nro1 * nro2; //200
        int division = nro1 / nro2; //50
        int potencia = nro1 ^ nro2; //10000
        int restoDeDivision = nro1 % nro2; //0

        //CON CADENAS DE TEXTO
        String nombre1 = "Fede";
        String nombre2 = "Juan";
        String nombre3 = nombre1 + " " + nombre2; //CONCATENA TEXTO ---> FEDE JUAN
        String nombre4 = nombre1 + nro1;

        //OPERADORES COMPARATIVOS
        boolean comp1 = (nro1 > nro2); //TRUE
        boolean comp2 = (nro1 >= nro2);
        boolean comp3 = (nro1 == nro2); // == SI SON IGUALES
        boolean comp4 = (nro1 != nro2); // DISTINTO

        //CONDICIONALES

        if(nro1>nro2){
            System.out.println("El numero 1 es mayor al numero 2");
        }

        if(nro1>nro2){
            System.out.println("El numero 1 es mayor al numero 2");
        } else {
            System.out.println("El numero 1 es menor o igual al numero 2");
        }

        if(nro1>nro2){
            System.out.println("LALALLA");
            System.out.println("El numero 1 es mayor al numero 2");
        } else if(nro1==nro2) {
            System.out.println("El numero 1 es igual al numero 2");
        } else {
            System.out.println("El numero 1 es menor al numero 2");
        }


        //SWITCH:
        String variable = "PEPE";

        switch (variable) {
            case "COCO":
                System.out.println("EL NOMBRE ES COCO");
                break;
            case "PEPE":
                    System.out.println("EL NOMBRE ES PEPE");
                    break;
            case "LOLO":
                System.out.println("EL NOMBRE ES LOLO");
                break;
            default:
                System.out.println("EL NOMBRE NO LO CONOZCO");
        }



        //CICLOS O REPETICIONES -> FOR Y EL WHILE


        //FOR -> UN CICLO DE REPETICIONES CONOCIDAS O RANGO DEFINIDO:

        // for (contador o variable que cuenta y la inicializo; condicion o el limite del ciclo; incremento)

        //INCREMENTO EN 1 -> i = i + 1  o tambien   i++     -----> 0,1,2,3,4,5....10
        //INCREMENTO EN 2 -> i = i + 2                      -----> 0,2,4,6,...10
        //INCREMENTO EN 5 -> i = i + 5

        for(int i = 0; i<50; i++){
            System.out.println("El numero es " + i);
        }


        //DECRECION EN 1 -> i = i - 1             i--           ------> 10,9,8....0
        for(int i = 10; i==0; i--){

        }




    }
}