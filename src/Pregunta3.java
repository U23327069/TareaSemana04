import java.util.Scanner;
public class Pregunta3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número entre 1 y 6
        System.out.print("Ingrese un número entero entre 1 y 6: ");
        int numero = Scanner.nextInt();
        
        // Verificar si el número está en el rango permitido
        if (numero >= 1 && numero <= 6) {
            // Convertir el número a inglés
            String ingles;
            switch (numero) {
                case 1:
                    ingles = "one";
                    break;
                case 2:
                    ingles = "two";
                    break;
                case 3:
                    ingles = "three";
                    break;
                case 4:
                    ingles = "four";
                    break;
                case 5:
                    ingles = "five";
                    break;
                case 6:
                    ingles = "six";
                    break;
                default:
                    ingles = "Desconocido"; // Esta parte no debería ocurrir
                    break;
            }
            // Mostrar la palabra correspondiente en inglés
            System.out.println("El número ingresado en inglés es: " + ingles);
        } else {
            // Si el número no está en el rango de 1 a 6
            System.out.println("El número ingresado está fuera del rango permitido.");
        }    
    }    
}
