import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();
            
            if (option == 5) {
                System.out.println("Saliendo...");
                break;
            }
            
            System.out.print("Digite el primer número: ");
            int a = scanner.nextInt();
            System.out.print("Digite el segundo número: ");
            int b = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Resultado: " + calculator.add(a, b));
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        
        scanner.close();
    }
}