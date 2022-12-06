public class main {
    public static void main(String[] args) {

        /*Parte 1*/
        int numeroIf = 1;

        if (numeroIf == 0){
            System.out.println("El numero es 0");
        }
        else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es positivo");
        }
        /*Parte 2*/
        int numeroWhile = 0;

        while(numeroWhile <= 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        /*Parte 3*/
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile <= 3);

        /*Parte 4*/
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        /*Parte 5*/
        var estacion = "verano";

        switch (estacion){
            case "invierno":
                System.out.println("Estas en invierno");
                break;
            case "primeravera":
                System.out.println("Estas en primavera");
                break;
            case "verano":
                System.out.println("Estas en verano");
                break;
            case "otoño":
                System.out.println("Estas en otoño");
                break;
            default:
                System.out.println("La variable no es una estación");
        }
    }
}
