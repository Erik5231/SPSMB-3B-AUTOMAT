package cz.spsmb.b3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnotu: ");
        int ammount = sc.nextInt();
        int vysledek = 0;
        int zbytek = 0;
        int money[] = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < money.length; i++) {
            vysledek = ammount / money[i];
            zbytek = ammount % money[i];
            System.out.println(money[i] + " " + vysledek+"x");
            ammount = zbytek;
        }

    }
}