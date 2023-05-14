package Retos;
import java.util.Scanner;

public class RetoVI {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Ingrese la cantidad de productos:");
        int cantidadProductos = scanner.nextInt();

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Ingrese el precio del producto " + i + ":");
            double precio = scanner.nextDouble();
            total += precio;
        }

        System.out.println("El total es: " + total);
    }
}
