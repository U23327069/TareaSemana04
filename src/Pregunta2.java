import java.util.Scanner;
public class Pregunta2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        // Ingresar un número del 1 al 10
        System.out.print("Ingrese un número entero entre 1 y 10: ");
        int numero = scanner.nextInt();        
        // Verificar si el número está en el rango permitido
        if (numero >= 1 && numero <= 10) {
            // Convertir el número a romano
            String romano;
            switch (numero) {
                case 1:
                    romano = "I";
                    break;
                case 2:
                    romano = "II";
                    break;
                case 3:
                    romano = "III";
                    break;
                case 4:
                    romano = "IV";
                    break;
                case 5:
                    romano = "V";
                    break;
                case 6:
                    romano = "VI";
                    break;
                case 7:
                    romano = "VII";
                    break;
                case 8:
                    romano = "VIII";
                    break;
                case 9:
                    romano = "IX";
                    break;
                case 10:
                    romano = "X";
                    break;
                default:
                    romano = "Desconocido";
                    break;
            }
            // Mostrar el número romano
            System.out.println("El número ingresado en romano es: " + romano);
        } else {
            // Si el número está fuera del rango de 1 a 10
            System.out.println("El número ingresado está fuera del rango permitido.");
        }    
     }
}
