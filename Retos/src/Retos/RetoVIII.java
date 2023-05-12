package Retos;
import java.util.Scanner;

public class RetoVIII {
    public static void main(String[] args) {
        int g = 0, p = 0, e = 0;
        int piedra = 1, papel =2, tijera = 3;
    
        int respuesta;
        int ranMaq = (int)(Math.random()*3+1);
        boolean reiniciar = true;
    // Recolectamos y almacenamos la eleccion del usuario

    // Declaramos las condiciones y los posibles casos que pueden suceder partiendo de la eleccion del usuario
    Scanner sc = new Scanner(System.in);

    while (reiniciar) {
        System.out.println("Escoja una opción \n 0 = piedra \n 1 = Tijera \n 2 = Papel");
        respuesta = sc.nextInt();

            if (respuesta == 0 ){
            System.out.println("Escogiste piedra");
            if (ranMaq == piedra){
                System.out.println(" Empate\nEl sistema escoje piedra");
                e++;
            }else if (ranMaq == papel){
                System.out.println(" Pierdes\nEl sistema escoje papel");
                p++;
            }else if (ranMaq == tijera){
                System.out.println(" Ganaste\nEl sistema escoje tijera");
                g++;
            }
            }
            if (respuesta == 1 ){
            System.out.println("Escogiste tijera");
            if (ranMaq == piedra){
                System.out.println(" Pierdes\nEl sistema escoje piedra");
                p++;
            }else if (ranMaq == papel){
                System.out.println(" Ganas\nEl sistema escoje papel");
                g++;
            }else if (ranMaq == tijera){
                System.out.println(" Empate\nEl sistema escoje tijera");
                e++;
            }
            }
            if (respuesta == 2 ){
            System.out.println("Escogiste papel");
            if (ranMaq == piedra){
                System.out.println(" Ganas\nEl sistema escoje piedra");
                g++;
            }else if (ranMaq == papel){
                System.out.println(" Empate\nEl sistema escoje papel");
                e++;
            }else if (ranMaq == tijera){
                System.out.println(" Pierdes\nEl sistema escoje tijera");
                p++;
            }
            }
            System.out.println("\nDesea volver a jugar (S/N)");
            String opcion = sc.next();
            if (opcion.equalsIgnoreCase("N")){
                reiniciar = false;
            }
        } 
        System.out.println("\nGanaste: " + g + "\nPerdiste: " + p + "\nEmpataste: " + e);
        System.out.println("Gracias por jugar");   
        sc.close();    
    }
}
     