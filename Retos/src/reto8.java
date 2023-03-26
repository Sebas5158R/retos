import java.util.Random;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        //Juego de los dados

        //Instanciar clases
        Scanner teclado=new Scanner(System.in);
        Random num=new Random();

        //Declarar variables
        int dado, num1 = 0, num2 = 0;

        //Solicitar datos
        System.out.println("Ingrese el numero total de dados, minimo 2");
        //Capturar datos
        dado=teclado.nextInt();

        //Operación (CICLO)
        while (1<dado) {
            System.out.print("Primer jugador:\n1.Lanzar: ");
            dado=teclado.nextInt();
            //Operación
            num1 = num.nextInt(6) + 1;
            //Mostrar en pantalla
            System.out.print(num1);
            System.out.println(" ");

            System.out.print("Segundo jugador:\n1.Lanzar: ");
            dado=teclado.nextInt();
            //Operación
            num2 = num.nextInt(6) + 1;
            //Mostrar en pantalla
            System.out.println(num2);
            System.out.print(" ");
        }
        //Operación
        if(num1>num2){
             System.out.println("El jugador uno gano con: "+num1);
        }else if(num1==num2){
            System.out.println("Es un empate");
        }else{
            System.out.println("El jugador dos gano con: "+num2);
        }
       
        //Limpiar buffer
        teclado.close();
    }
}
