import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        //Juego de piedra pepel o tijera con la condición de ser mayor de edad
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Declarar variables
        int edad;


        //Solicitar datos
        System.out.println("Ingrese su edad para poder jugar");
        //Capturar datos
        edad=teclado.nextInt();

        //Operaciones(PROCESOS)
        if(edad>=18 && edad<=89){
            System.out.println("Juego de piedra, papel o tijera");

        int seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("El computador ya escogio");

        System.out.println("Indique su eleccion 1, 2 o 3 siendo:\n1=Piedra\n2=Papel\n3=Tijera");
        int seleccionUsuario=teclado.nextInt();

        System.out.print("El computador ha escogido: ");

        //Operaciones(PROCESOS)
        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Empate"); break;
                   case 2: System.out.println("Ganaste"); break;
                   case 3: System.out.println("El computador gano"); break;
                }
                break;

                 case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("El computador gano"); break;
                   case 2: System.out.println("Empate"); break;
                   case 3: System.out.println("Ganaste"); break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Ganaste"); break;
                   case 2: System.out.println("El computador gano"); break;
                   case 3: System.out.println("Empate"); break;
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