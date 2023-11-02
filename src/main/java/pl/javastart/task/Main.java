package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbę");
            number = scanner.nextInt();
        } while (checkNumber(number));
    }

    private static boolean checkNumber(int number) {
        if (number < 100) {
            System.out.println("Podana liczba jest za mała");
            return true;
        } else if (number > 200) {
            System.out.println("Podana liczba jest za duża");
            return true;
        } else if (number % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3");
            return true;
        } else {
            System.out.println("Twoja liczba jest ok");
            return false;
        }
    }
}