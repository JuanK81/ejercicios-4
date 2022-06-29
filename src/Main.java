public class Main {
    public static void main(String[] args) {

                //if
                int numeroIf = 2;

                if (numeroIf >= 0 ) {
                    System.out.println("positive");
                 } else if (numeroIf == 0) {
                    System.out.println("igual a 0");
                 } else {
                   System.out.println("negative");
                }

                //while
                int numeroWhile = 0;

                while (numeroWhile < 3) {

                    System.out.println(numeroWhile);

                    numeroWhile++;
                };

                //do while
                do {
                    System.out.println(numeroWhile);
                    numeroWhile++;
                }
                while(numeroWhile < 3);

                //for
                int numeroFor = 0;

                for (int i = 0; i < 3; i++) {
                    System.out.println(numeroFor);
                    numeroFor++;
                };

                //switch
                var estacion = "VERANO";

                switch (estacion) {

                    case "INVIERNO":
                        System.out.println("Estamos en invierno");
                        break;

                    case "PRIMAVERA":
                        System.out.println("Estamos en primavera");
                        break;

                    case "VERANO":
                        System.out.println("Estamos en verano");
                        break;

                    case "OTOÑO":
                        System.out.println("Estamos en otoño");
                        break;

                    default:
                        System.out.println("Ésto no es una estación...");
                }

            }


        }



