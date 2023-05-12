package Retos;
import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        int piedra = 1, papel =2, tijera = 3;
        int respuesta;
        int ranMaq = (int)(Math.random()*3+1);
       Scanner sc = new Scanner(System.in);


        System.out.println("Escoja una opción \n 0 = piedra \n 1 = Tijera \n 2 = Papel");
        respuesta = sc.nextInt();

            if (respuesta == 0 ){
            System.out.println("Escogiste piedra");
                if (ranMaq == piedra){
                    System.out.println(" Empate\nEl sistema escoje piedra");
                }else if (ranMaq == papel){
                    System.out.println(" Pierdes\nEl sistema escoje papel");
                }else if (ranMaq == tijera){
                    System.out.println(" Ganaste\nEl sistema escoje tijera");
                }
            }
            if (respuesta == 1 ){
            System.out.println("Escogiste tijera");
                if (ranMaq == piedra){
                    System.out.println(" Pierdes\nEl sistema escoje piedra");
                }else if (ranMaq == papel){
                    System.out.println(" Ganas\nEl sistema escoje papel");
                }else if (ranMaq == tijera){
                    System.out.println(" Empate\nEl sistema escoje tijera");
                }
            }
            if (respuesta == 2 ){
            System.out.println("Escogiste papel");
                if (ranMaq == piedra){
                    System.out.println(" Ganas\nEl sistema escoje piedra");
                }else if (ranMaq == papel){
                    System.out.println(" Empate\nEl sistema escoje papel");
                }else if (ranMaq == tijera){
                    System.out.println(" Pierdes\nEl sistema escoje tijera");
                }
            }
        sc.close();
    }
}
