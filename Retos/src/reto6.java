import java.util.Random;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        //Juego de descubra la palabra
        
        //Instanciar clases
        Scanner teclado=new Scanner(System.in);
        Random aleatorio = new Random();
        
        //Declarar variables(array)
        String[] animales={"gato","caballo","tigre","leon","perro"};

        //Declarar variables
        int correcto = aleatorio.nextInt(5);
        String palabraCorrecta = animales[correcto];
        String palabraElegida="";
        int n;
        
        //Solicitar datos
        System.out.println("Digite 1 para seguir de lo contrario digite 2 ");
        //Capturar datos
        n=teclado.nextInt();

        //Operaciones(PROCESOS)
        while (n<=1) {

            int dificultad;

            //Solicitar dato
            System.out.println("Digite:\n1=para ver posibles resultados\n2=para ir directo al juego ");
            //Capturar dato
            dificultad=teclado.nextInt();
            
            //Operaciones(PROCESOS)
            switch (dificultad) {
                case 1:
                
                //Operación de ciclo
                for(int i=0; i<animales.length; i++){
                 System.out.println("Posibles palabras: "+animales[i]);   
                }
                System.out.println("Adivina la palabra");
                palabraElegida=teclado.next();
                //Operaciones(PROCESOS)
                if(palabraCorrecta.equals(palabraElegida)){
                    System.out.println("CORRECTO, Ganaste");
                }else{
                    System.out.println("PERDISTE, La palabra correcta era: "+palabraCorrecta);
                }break;
            
                case 2:
                System.out.println("Adivina la palabra");
                palabraElegida=teclado.next();
                //Operaciones(PROCESOS)
                if(palabraCorrecta.equals(palabraElegida)){
                    System.out.println("CORRECTO, Ganaste");
                }else{
                    System.out.println("PERDISTE, La palabra correcta era: "+palabraCorrecta);
                }break;
    
                default:
                System.out.println("Error");
                break;
            }
            //Solicitar dato
            System.out.println("Desea continuar?\n1=Si\n2=No");
            //Capturar dato
            n=teclado.nextInt();
            
        }
        System.out.println("Adiós");


        //Limpiar buffer
        teclado.close();

    }
}
