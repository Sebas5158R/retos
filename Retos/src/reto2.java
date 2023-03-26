import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) throws Exception {
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //"Programa que determina con facilidad la dosis de vacuna que se le aplica a un bebé;

        //Declarar variables
        String nombreM, nombreB, EPS;
        int peso, meses;
        int dosis;

        //Solicitar datos
        System.out.print("Ingrese su EPS: ");
        //Capturar dato
        EPS = teclado.next();

        //Solicitar datos
        System.out.print("Ingrese el nombre del médico que aplicará la vacuna: ");
        //Capturar datos
        nombreM=teclado.next();

        //Solicitar datos
        System.out.print("Ingrese el nombre del bebé al que se le aplicará la vacuna: ");
        //Capturar datos
        nombreB=teclado.next();

        //Solicitar datos
        System.out.print("Ingrese cuantos meses tiene el bebé: ");
        //Capturar datos
        meses = teclado.nextInt();

        //Solicitar datos
        System.out.print("Ingrese el peso aproximado del bebé: ");
        //Capturar datos
        peso = teclado.nextInt();

        //Operación
        dosis=peso+15*meses*15*10;

        //Imprimir en pantalla
        System.out.println("El médico que vacunara al bebé es: "+nombreM);
        //Imprimir en pantalla
        System.out.println("En la EPS: "+EPS);
        //Imprimir en pantalla
        System.out.println("La dosis a aplicar a: "+nombreB+", es de: "+dosis+"ml");


        //Limpiar buffer
        teclado.close();
    }

}
