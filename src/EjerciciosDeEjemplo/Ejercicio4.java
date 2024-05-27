package EjerciciosDeEjemplo;

public class Ejercicio4 {


        //CODIGO PRINCIPAL
        public static void main(String[] args) {

            Integer nro1 = 10;
            Integer nro2 = 20;

            //        Y     =      F (X,  y)
            Integer suma = sumar(nro1,nro2);

            Integer suma2 = sumar(20,41241);

            Integer resta = restar(nro1,nro2);

            Integer potencia = elevarAlCuadrado(nro1);

            String nombreDelNumero = nombreDelNumero(2);

             //     F    ( x , Y )
            sumarSinDevolverNada(nro1,nro2);

            System.out.println("LA SUMA ES: " + suma);

            System.out.println("LA RESTA 1 - 2 ES: " + resta);

            System.out.println("LA RESTA 2 - 1 ES: " + restar(nro2,nro1));

            System.out.println("LA RESTA 2 - 1 ES: " + restar(50,20));

            System.out.println("EL CUADRADO DE NRO1 ES: " + potencia);

        }


        public static Integer sumar(Integer nro1, Integer nro2){
            Integer suma = nro1 + nro2;
            return suma;
        }

        public static Integer restar(Integer nroA, Integer nroB){
            Integer resta = nroA - nroB;
            return resta;
        }

        public static Integer elevarAlCuadrado(Integer nro){
            Integer cuadrado = nro*nro;
            return cuadrado;
        }

        //QUIERO UNA FUNCION QUE NO RETORNE NADA ----> void
        public static void sumarSinDevolverNada(Integer nroA, Integer nroB){
            Integer suma = nroA + nroB;
            System.out.println(suma);
        }

        public static String nombreDelNumero(Integer nro){
            //INICIALIZO LA VARIABLE DEL NOMBRE DEL NUMERO -> ""
            String nombreDelNro = "";

            if(nro==0){
                nombreDelNro="Cero";
            }else if(nro==1){
                nombreDelNro="Uno";
            }else if(nro==2){
                nombreDelNro="Dos";
            }else if(nro==3){
                nombreDelNro="Tres";
            }else{
                nombreDelNro="No pude deducirlo";
            }

            return nombreDelNro;

        }


}
