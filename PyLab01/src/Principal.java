import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Cantidad de vidas usadas:" + vida + "\t¿Podrias adivinar cual es el numero secreto?");
            rp = sc.nextInt();
            if (rp == 420)
                fl = true;

        } while (vida < 5 && !fl);
        if (fl == true)
            System.out.println("Has adivinado!");
        else
            System.out.println("Has perdido...");
    }
}