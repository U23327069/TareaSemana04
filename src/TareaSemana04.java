import java.util.Scanner;
public class TareaSemana04 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Ingrese un número entre 1 y 5
        System.out.print("Ingrese un número entero entre 1 y 5: ");
        int numero = Scanner.nextInt();        
        // Verificar el rango numerico
        if (numero >= 1 && numero <= 5) {
            // Convertimos el número a palabra
            String palabra;
            switch (numero) {
                case 1:
                    palabra = "uno";
                    break;
                case 2:
                    palabra = "dos";
                    break;
                case 3:
                    palabra = "tres";
                    break;
                case 4:
                    palabra = "cuatro";
                    break;
                case 5:
                    palabra = "cinco";
                    break;
                default:
                    palabra = "Desconocido";
                    break;
            }
            // Mostramos la palabra que corresponde al numero
            System.out.println("El número ingresado en palabra es: " + palabra);
        } else {
            // Si el número no está en el rango de 1 a 5
            System.out.println("El número ingresado está fuera del rango permitido.");
        }        
    }    
}