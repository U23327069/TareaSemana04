import java.util.Scanner;
public class Pregunta4 {
     public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);        
        // Ingresamos un número permitido (1,2,3,4,6,12)
        System.out.print("Ingrese un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();
        // Convertir el número al nombre del periodo
        String periodo;
        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Número no permitido";
                break;
        }        
        // Mostraremos el periodo que corresponde
        System.out.println("El periodo correspondiente es: " + periodo);
     }    
}
