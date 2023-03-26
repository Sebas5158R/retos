import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        //reto de: Llenar formularios

        //Instanciar clases
        Scanner teclado=new Scanner(System.in);

        //Declarar variables
        String desicion;
        //Declarar variables (Arrays)
        String [] nombre=new String[10];
        String [] apellido=new String[10];
        int [] edad=new int[2];
        String[] user=new String[10];

        //Operaciones(PROCESOS)
        do {
            System.out.println("Ingrese el nombre");
            nombre[1]=teclado.next();
            System.out.println("Ingrese el apellido");
            apellido[1]=teclado.next();
            System.out.println("Ingrese edad");
            edad[1]=teclado.nextInt();
            System.out.println("Ingrese usuario");
            user[1]=teclado.next();

            //Solicitar datos
            System.out.println("Desea llenar otro formulario?");
            //Capturar datos
            desicion=teclado.next();


        } while (desicion.equals("Si"));

        //Mostrar en pantalla
        System.out.println("Los datos ingresados fueron: \n"+"Nombre:" +nombre[1]+"\n" +"Apellido:" +apellido[1]+"\n" +"Edad:" +edad[1]+"\n" +"Nombre de usuario:" +user[1]);


        //Limpiar buffer
        teclado.close();
    }
}
