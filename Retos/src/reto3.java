import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) throws Exception {
        //Juego del carisellazo con la condión de la edad

        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Declarar variables
        int edad;
        int num=0;

        //Solicitar datos
        System.out.print("Ingrese su edad para poder jugar: ");
        //Capturar datos
        edad=teclado.nextInt();

        //Operaciones(PROCESOS)
        if(edad>=18 && edad<=89){
            System.out.println("Edad valida, puede continuar");
            System.out.println("Lanzando moneda...");

            //Solicitar datos
            System.out.println("Elige 1 o 2 siendo: \n1 = cara \n2 = Sello");
            //Capturar dato
            num=teclado.nextInt();
            System.out.print("Salio: ");

            //Operaciones(PROCESOS)
            int numero = (int)(Math.random()*2+1);
            switch( numero ) {
                case 1:
                System.out.println("Cara");
                switch (num) {
                    case 1: System.out.println("Ganaste");break;
                    case 2: System.out.println("Perdiste, intentalo de nuevo");break;
                }
                break;

                case 2:
                System.out.println("Sello");
                switch (num) {
                    case 1: System.out.println("Perdiste, intentalo de nuevo");break;
                    case 2: System.out.println("Ganaste");break;
                }
                break;
            }
            
        }
        else if (edad>=90){
            System.out.println("Edad invalida");
        }
        else if (edad<18 && edad>=1) {
            System.out.println("No puedes jugar");
        }
        else {
            System.out.println("Edad invalida");
        }

        //Limpiar buffer
        teclado.close();
        
    }
}
