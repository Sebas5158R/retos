import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Juego de piedra papel o tijera con vidas
        
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Declarar variables
        int vidas=2;
        String desicion;


        //Solicitar datos
        System.out.println("Desea jugar?");
        //Capturar datos
        desicion=teclado.nextLine();

        //Operaciones(PROCESOS)
        if(desicion.equals("Si")){
            //Operaciones(PROCESOS)
            do {
                System.out.println("Juego de piedra, papel o tijera");
                    //Operaciones(PROCESOS)
                    int seleccionCompu = (int)(Math.random() * 3) + 1;

                    //Mostrar en pantalla
                    System.out.println("El computador ya escogio");
                    //Mostrar en pantalla
                    System.out.println("Indique su eleccion 1, 2 o 3 siendo:\n1=Piedra\n2=Papel\n3=Tijera");
                    //Capturar datos
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
                            case 3: System.out.println("El computador gano, te quedan: "+vidas--+"vida(s)"); break;
                            }
                            break;

                            case 2:
                            System.out.println("Papel");
                            switch ( seleccionUsuario )
                            {
                            case 1: System.out.println("El computador gano, te quedan: "+vidas--+"vida(s)"); break;
                            case 2: System.out.println("Empate"); break;
                            case 3: System.out.println("Ganaste"); break;
                            }
                            break;
            
                        case 3:
                            System.out.println("Tijera");
                            switch ( seleccionUsuario )
                            {
                            case 1: System.out.println("Ganaste"); break;
                            case 2: System.out.println("El computador gano, te quedan: "+vidas--+"vida(s)"); break;
                            case 3: System.out.println("Empate"); break;
                            }
                            break;
                    }
                    //Operaciones(PROCESOS)
                    vidas=vidas--;
                    //Mostrar en pantalla
                    System.out.println("Desea volver a jugar?");
                    //Capturar dato
                    desicion=teclado.next();
                        } while (desicion.equals("Si"));
                    }


                    //Limpiar buffer
                    teclado.close();
    }
    
    }

