package Retos;
import java.util.Scanner;
public class RetoVII {
    public static void main(String[] args) {
        int apuesta;
        int reiniciar = 1, contador = 0;
        Scanner sc = new Scanner(System.in);
        int numero = (int)(Math.random()*2+1);
        int opcion;
        int dinDisponible = 10000;

        while(reiniciar == 1 || dinDisponible<=0){
            System.out.println("Cuanto dinero deseas apostar cuentas con: "+dinDisponible);
            apuesta = sc.nextInt();
            dinDisponible -= apuesta;
            System.out.println("Elige una opcion (1.Cara 2.Sello)");
            opcion = sc.nextInt();
            if(dinDisponible < apuesta){
                System.out.println("No tienes dinero suficiente");
                reiniciar = 2;
            }else{
                if(numero == opcion){
                    System.out.println("Ganaste");
                    apuesta = apuesta*2;
                    dinDisponible += apuesta;
                    System.out.println("Tu dinero es: "+dinDisponible);
                    }else{
                    System.out.println("Perdiste");
                    dinDisponible -= apuesta;
                    System.out.println("Tu dinero es: "+dinDisponible);
                    }                     
                contador ++;
                System.out.println("Deseas volver a jugar (1.SI 2.NO)");
                reiniciar = sc.nextInt();
            }

        }
        System.out.println("La cantidad de dinero que usted tiene es: " + dinDisponible + " y usted jugo: " + contador);
        sc.close();
    }
}
