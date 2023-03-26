import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner teclado = new Scanner(System.in);

        //Programa que convierte grados Fahrenheit(°F) a centigrados(°C).

        //Declarar variables
        int Fahrenheit;
        int Centigrados;
        int Kelvin;

        //Solicitar datos
        System.out.println("Ingrese los grados a los que quiere cocinar");
        //Capturar dato
        Centigrados=teclado.nextInt();

        //Operación
        Fahrenheit=Centigrados+100;
        Kelvin=Centigrados+100;

        //Imprimir en pantalla
        System.out.println("Los grados ingresados en grados °F es de: "+Fahrenheit+"°F");
        //Imprimir en pantalla
        System.out.println("Los grados ingresados en grados °K es de: "+Kelvin+"°K");
        //Imprimir en pantalla
        System.out.println("Los grados ingresados en grados °C es de: "+Centigrados+"°C");

        //Limpiar Buffer
        teclado.close();
    }
}
