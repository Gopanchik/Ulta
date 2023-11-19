package lesson15;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        Distance.print();
        System.out.println();
        System.out.print("Enter num of meters: ");
        int meters = scan.nextInt();
        System.out.print("Enter num of cm: ");
        int cm = scan.nextInt();

        System.out.println("Result of meters to kilometers = " + Converter.metriToKilometri(meters));
        System.out.println("Result om cantimetri to dicimetri = " + Converter.cmToDm(cm));

    }

    double distance;

    public static void print() {
        System.out.println("Welcome to converter!!!)))");
    }

    static class Converter {
        static double metriToKilometri(double meters) {
            return meters / 1000.0;
        }

        static int cmToDm(int cm) {
            return cm * 10;
        }
    }
}
